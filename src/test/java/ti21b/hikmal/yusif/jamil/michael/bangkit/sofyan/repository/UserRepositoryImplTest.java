package ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.repository;

import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.repository.TodolistRepositoryImpl;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.repository.TodolistRepository;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.repository.UserRepositoryImpl;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.repository.UserRepository;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.config.Database;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.entity.User;

import java.sql.SQLException;

public class UserRepositoryImplTest {

    private Database database;
    private UserRepository userRepository;
    private TodolistRepository todolistRepository;

    @BeforeEach
    void setUp() throws SQLException {
        database = new Database("_test");
        userRepository = new UserRepositoryImpl(database);
        todolistRepository = new TodolistRepositoryImpl(database);

        todolistRepository.deleteAll();
        userRepository.deleteAll();
    }

    @Test
    void testInsert() {
        User user = new User("bangkit", "Bangkit", "bangkit");
        var result = userRepository.insert(user);

        assertNotNull(result);
        assertEquals(user.getId(), result.getId());
        assertEquals(user.getName(), result.getName());
        assertEquals(user.getPassword(), result.getPassword());
    }

    @Test
    void testUpdate() {
        var user = userRepository.insert(new User("anom", "Anom", "anom"));
        var result = userRepository.update(new User(user.getId(), "Bangkit", "bangkit"));
        
        assertNotNull(user);
        assertNotNull(result);
        assertEquals(user.getId(), result.getId());
        assertEquals("Bangkit", result.getName());
        assertEquals("bangkit", result.getPassword());
        assertNotEquals(user.getName(), result.getName());
        assertNotEquals(user.getPassword(), result.getPassword());
    }

    @Test
    void testFindByIdNotFound() {
        var result = userRepository.findById("anom");
        assertNull(result);
    }

    @Test
    void testFindByIdSuccess() {
        var user = userRepository.insert(new User("anom", "Anom", "anom"));
        var result = userRepository.findById("anom");

        assertNotNull(result);
        assertEquals(user.getId(), result.getId());
        assertEquals(user.getName(), result.getName());
    }

}
