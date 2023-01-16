package ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.service;

import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.service.UserServiceImpl;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.service.UserService;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mindrot.jbcrypt.BCrypt;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.config.Database;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.domain.UserLoginRequest;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.domain.UserRegisterRequest;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.domain.UserUpdatePasswordRequest;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.domain.UserUpdateProfileRequest;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.entity.User;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.repository.TodolistRepository;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.repository.TodolistRepositoryImpl;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.repository.UserRepository;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.repository.UserRepositoryImpl;

import java.sql.SQLException;


public class UserServiceImplTest {

    private Database database;
    private UserRepository userRepository;
    private TodolistRepository todolistRepository;
    private UserService userService;

    @BeforeEach
    void setUp() throws SQLException {
        database = new Database("_test");
        userRepository = new UserRepositoryImpl(database);
        userService = new UserServiceImpl(userRepository);
        todolistRepository = new TodolistRepositoryImpl(database);

        todolistRepository.deleteAll();
        userRepository.deleteAll();
    }

    @Test
    void testRegisterSuccess() {
        UserRegisterRequest request = new UserRegisterRequest(
                "bangkit", "Bangkit", "bangkit", "bangkit"
        );

        var response = userService.register(request);

        assertEquals(request.getId(), response.getUser().getId());
        assertEquals(request.getName(), response.getUser().getName());
        assertTrue(BCrypt.checkpw(request.getPassword(), response.getUser().getPassword()));
    }

    @Test
    void testRegisterDuplicate() {
        UserRegisterRequest request = new UserRegisterRequest(
                "bangkit", "Bangkit", "bangkit", "bangkit"
        );
        userService.register(request);

        assertThrows(RuntimeException.class, () -> {
            userService.register(request);
        });
    }

    @Test
    void testRegisterNullAttribute() {
        UserRegisterRequest request = new UserRegisterRequest(
                null, null, null, null
        );

        assertThrows(RuntimeException.class, () -> {
            userService.register(request);
        });
    }

    @Test
    void testRegisterBlankAttribute() {
        UserRegisterRequest request = new UserRegisterRequest("", "", "", "");

        assertThrows(RuntimeException.class, () -> {
            userService.register(request);
        });
    }

    @Test
    void testRegisterLengthPassword() {
        UserRegisterRequest request = new UserRegisterRequest("anom", "Anom", "anom", "anom");

        assertThrows(RuntimeException.class, () -> {
            userService.register(request);
        });
    }

    @Test
    void testRegisterDifferentPassword() {
        UserRegisterRequest request = new UserRegisterRequest(
                "bangkit", "Bangkit", "bangkit", "sedhayu"
        );

        assertThrows(RuntimeException.class, () -> {
            userService.register(request);
        });
    }

    @Test
    void testLoginSuccess() {
        UserRegisterRequest request = new UserRegisterRequest(
                "bangkit", "Bangkit", "bangkit", "bangkit"
        );
        userService.register(request);

        UserLoginRequest request2 = new UserLoginRequest("bangkit", "bangkit") ;

        var response = userService.login(request2);

        assertNotNull(response);
        assertEquals(request.getId(), response.getUser().getId());
        assertEquals(request.getName(), response.getUser().getName());
        assertTrue(BCrypt.checkpw(request.getPassword(), response.getUser().getPassword()));
    }

    @Test
    void testloginNullAttribute() {
        UserRegisterRequest request = new UserRegisterRequest(
                "bangkit", "Bangkit", "bangkit", "bangkit"
        );

        UserLoginRequest request2 = new UserLoginRequest(null, null);

        assertThrows(RuntimeException.class, () -> {
            userService.login(request2);
        });
    }

    @Test
    void testloginBlankAttribute() {
        UserRegisterRequest request = new UserRegisterRequest(
                "bangkit", "Bangkit", "bangkit", "bangkit"
        );
        userService.register(request);

        UserLoginRequest request2 = new UserLoginRequest("", "");

        assertThrows(RuntimeException.class, () -> {
            userService.login(request2);
        });
    }

    @Test
    void testloginWrongPassword() {
        UserRegisterRequest request = new UserRegisterRequest(
                "bangkit", "Bangkit", "bangkit", "bangkit"
        );
        userService.register(request);

        UserLoginRequest request2 = new UserLoginRequest("bangkit", "wrong");

        assertThrows(RuntimeException.class, () -> {
            userService.login(request2);
        });
    }

    @Test
    void testloginNotFound() {

        UserLoginRequest request2 = new UserLoginRequest("bangkit", "bangkit");

        assertThrows(RuntimeException.class, () -> {
            userService.login(request2);
        });
    }

    @Test
    void testUpdatePasswordSuccess() {
        userRepository.insert(new User(
                "bangkit", "Bangkit", BCrypt.hashpw("bangkit", BCrypt.gensalt())
        ));

        UserUpdatePasswordRequest request = new UserUpdatePasswordRequest(
                "bangkit", "bangkit", "bangkit2", "bangkit2"
        );
        var response = userService.updatePassword(request);

        assertEquals(request.getId(), response.getUser().getId());
        assertTrue(BCrypt.checkpw(request.getNewPassword(), response.getUser().getPassword()));
    }

    @Test
    void testUpdatePasswordNullAttribute() {
        UserUpdatePasswordRequest request = new UserUpdatePasswordRequest(null, null, null, null);

        assertThrows(RuntimeException.class, () -> {
            userService.updatePassword(request);
        });
    }

    @Test
    void testUpdatePasswordBlankAttribute() {
        UserUpdatePasswordRequest request = new UserUpdatePasswordRequest("", "", "", "");

        assertThrows(RuntimeException.class, () -> {
            userService.updatePassword(request);
        });
    }

    @Test
    void testUpdatePasswordLengthAttribute() {
        UserUpdatePasswordRequest request = new UserUpdatePasswordRequest(
                "bangkit", "bangkit", "ban", "ban"
        );

        assertThrows(RuntimeException.class, () -> {
            userService.updatePassword(request);
        });
    }

    @Test
    void testUpdatePasswordNotSame() {
        UserUpdatePasswordRequest request = new UserUpdatePasswordRequest(
                "bangkit", "bangkit", "bangkit2", "bangkit3"
        );

        assertThrows(RuntimeException.class, () -> {
            userService.updatePassword(request);
        });
    }

    @Test
    void testUpdatePasswordNotSameCurrentPassword() {
        userRepository.insert(new User(
                "bangkit", "Bangkit", "bangkit"
        ));

        UserUpdatePasswordRequest request = new UserUpdatePasswordRequest(
                "bangkit", "bangkit", "bangkit", "bangkit"
        );

        assertThrows(RuntimeException.class, () -> {
            userService.updatePassword(request);
        });
    }

    @Test
    void testUpdateProfileSuccess() {
        userRepository.insert(new User(
                "bangkit", "Bangkit", "bangkit"
        ));

        UserUpdateProfileRequest request = new UserUpdateProfileRequest(
                "bangkit", "Bangbangkit"
        );
        var response = userService.updateProfile(request);

        assertEquals(request.getNewName(), response.getUser().getName());
    }

    @Test
    void testUpdateProfileNullAttribute() {
        UserUpdateProfileRequest request = new UserUpdateProfileRequest(null, null);

        assertThrows(RuntimeException.class, () -> {
            userService.updateProfile(request);
        });
    }

    @Test
    void testUpdateProfileBlankAttribute() {
        UserUpdateProfileRequest request = new UserUpdateProfileRequest("", "");

        assertThrows(RuntimeException.class, () -> {
            userService.updateProfile(request);
        });
    }

}
