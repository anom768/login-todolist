package ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.repository;

import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.repository.TodolistRepositoryImpl;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.repository.TodolistRepository;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.repository.UserRepositoryImpl;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.repository.UserRepository;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.config.Database;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.entity.Todolist;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.entity.User;

import java.sql.SQLException;

public class TodolistRepositoryImplTest {

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
        var user = userRepository.insert(new User("bangkit", "Bangkit", "bangkit"));
        var todolist = todolistRepository.insert(new Todolist(
                user.getId(), "satu"
        ));

        assertEquals(user.getId(), todolist.getId_user());
        assertEquals("satu", todolist.getTodo());
    }

    @Test
    void testGetAllNull() {
        var user = userRepository.insert(new User("bangkit", "Bangkit", "bangkit"));
        var todolist = todolistRepository.getAll(user.getId());

        assertEquals(0, todolist.length);
    }

    @Test
    void testGetAllSuccess() {
        var user = userRepository.insert(new User("bangkit", "Bangkit", "bangkit"));
        todolistRepository.insert(new Todolist(user.getId(), "satu"));
        todolistRepository.insert(new Todolist(user.getId(), "dua"));
        var todolist = todolistRepository.getAll(user.getId());

        assertEquals("bangkit", todolist[0].getId_user());
        assertEquals("satu", todolist[0].getTodo());

        assertEquals("bangkit", todolist[1].getId_user());
        assertEquals("dua", todolist[1].getTodo());
    }

    @Test
    void testUpdate() {
        userRepository.insert(new User("bangkit", "Bangkit", "bangkit"));
        var todolist = todolistRepository.insert(new Todolist("bangkit", "satu"));

        var result = todolistRepository.update(new Todolist(1,"bangkit", "satusatu"));

        assertEquals("bangkit", result.getId_user());
        assertEquals("satusatu", result.getTodo());
    }

    @Test
    void testDelete() {
        userRepository.insert(new User("bangkit", "Bangkit", "bangkit"));
        var todolist = todolistRepository.insert(new Todolist("bangkit", "satu"));

        var result = todolistRepository.delete(todolist);
        assertTrue(result);
    }

}
