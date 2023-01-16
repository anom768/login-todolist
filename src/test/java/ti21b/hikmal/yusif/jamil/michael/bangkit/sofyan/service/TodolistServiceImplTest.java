package ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.service;

import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.service.TodolistService;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.service.TodolistServiceImpl;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.config.Database;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.domain.TodolistDeleteRequest;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.domain.TodolistInsertRequest;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.domain.TodolistUpdateRequest;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.entity.Todolist;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.entity.User;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.repository.TodolistRepository;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.repository.TodolistRepositoryImpl;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.repository.UserRepository;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.repository.UserRepositoryImpl;

import java.sql.SQLException;

public class TodolistServiceImplTest {

    private Database database;
    private UserRepository userRepository;
    private TodolistRepository todolistRepository;
    private TodolistService todolistService;

    @BeforeEach
    void setUp() throws SQLException {
        database = new Database("_test");
        userRepository = new UserRepositoryImpl(database);
        todolistRepository = new TodolistRepositoryImpl(database);
        todolistService = new TodolistServiceImpl(todolistRepository);

        todolistRepository.deleteAll();
        userRepository.deleteAll();
    }

    @Test
    void testInsertSuccess() {

        User user = new User("bangkit", "Bangkit", "bangkit");
        userRepository.insert(user);

        TodolistInsertRequest request = new TodolistInsertRequest("bangkit", "satu");
        var response = todolistService.insert(request);

        assertEquals(1, response.getTodolists().getId());
        assertEquals("bangkit", response.getTodolists().getId_user());
        assertEquals("satu", response.getTodolists().getTodo());
    }

    @Test
    void testInsertNullAttribute() {

        User user = new User("bangkit", "Bangkit", "bangkit");
        userRepository.insert(user);

        TodolistInsertRequest request = new TodolistInsertRequest(null, null);

        assertThrows(RuntimeException.class, () -> {
            todolistService.insert(request);
        });
    }

    @Test
    void testInsertBlankAttribute() {

        User user = new User("bangkit", "Bangkit", "bangkit");
        userRepository.insert(user);

        TodolistInsertRequest request = new TodolistInsertRequest("", "");

        assertThrows(RuntimeException.class, () -> {
            todolistService.insert(request);
        });
    }

    @Test
    void testGetAllNull() {
        User user = new User("bangkit", "Bangkit", "bangkit");
        userRepository.insert(user);

        var response = todolistService.getAll("bangkit");
        assertEquals(0, response.getTodolists().length);
    }

    @Test
    void testGetAllSuccess() {
        User user = new User("bangkit", "Bangkit", "bangkit");
        userRepository.insert(user);
        todolistRepository.insert(new Todolist(user.getId(), "satu"));
        todolistRepository.insert(new Todolist(user.getId(), "dua"));

        var response = todolistService.getAll("bangkit");
        assertEquals("satu", response.getTodolists()[0].getTodo());
        assertEquals("dua", response.getTodolists()[1].getTodo());
    }

    @Test
    void testUpdateSuccess() {
        User user = new User("bangkit", "Bangkit", "bangkit");
        userRepository.insert(user);
        todolistRepository.insert(new Todolist(user.getId(), "satu"));

        TodolistUpdateRequest request = new TodolistUpdateRequest(
                1, "bangkit", "satusatu"
        );

        var response = todolistService.update(request);
        assertEquals(request.getId(), response.getTodolists().getId());
        assertEquals(request.getId_user(), response.getTodolists().getId_user());
        assertEquals(request.getTodo(), response.getTodolists().getTodo());
        assertNotEquals("satu", response.getTodolists().getTodo());
    }

    @Test
    void testUpdateNullAttribute() {
        TodolistUpdateRequest request = new TodolistUpdateRequest(0, null, null);

        assertThrows(RuntimeException.class, () -> {
            todolistService.update(request);
        });
    }

    @Test
    void testUpdateBlankAttribute() {
        TodolistUpdateRequest request = new TodolistUpdateRequest(1, "", "");

        assertThrows(RuntimeException.class, () -> {
            todolistService.update(request);
        });
    }

    @Test
    void testDelete() {
        User user = new User("bangkit", "Bangkit", "bangkit");
        userRepository.insert(user);
        todolistRepository.insert(new Todolist(user.getId(), "satu"));

        TodolistDeleteRequest request = new TodolistDeleteRequest(1, "bangkit", "satu");

        var result = todolistService.delete(request);
        assertTrue(result);
    }

}
