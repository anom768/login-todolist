package ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.controller;

import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.config.Database;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.domain.TodolistInsertRequest;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.entity.Todolist;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.repository.TodolistRepository;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.repository.TodolistRepositoryImpl;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.service.SessionService;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.service.TodolistService;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.service.TodolistServiceImpl;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.table.TodolistTable;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.view.MainWindow;

import javax.swing.*;
import java.sql.SQLException;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.domain.TodolistDeleteRequest;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.domain.TodolistUpdateRequest;

public class TodolistController {

    private final Database database;
    private final TodolistRepository todolistRepository;
    private final TodolistService todolistService;
    private final MainWindow mainWindow;

    public TodolistController(MainWindow mainWindow, Database database) throws SQLException {
        this.mainWindow = mainWindow;
        //this.database = new Database("_test");
        this.database = database;
        todolistRepository = new TodolistRepositoryImpl(this.database);
        todolistService = new TodolistServiceImpl(todolistRepository);
    }

    public boolean insert() {
        var user = SessionService.current();
        TodolistInsertRequest request = new TodolistInsertRequest(
                user.getId(), mainWindow.getTodo().getText()
        );

        try {
            todolistService.insert(request);
            mainWindow.getTodo().setText("");
            JOptionPane.showMessageDialog(mainWindow, "Insert todo success");
            return true;
        } catch (RuntimeException exception) {
            JOptionPane.showMessageDialog(mainWindow, exception.getMessage());
            return false;
        }
    }

    public void getAll() {
        var user = SessionService.current();
        var todolists = todolistService.getAll(user.getId());
        mainWindow.getTodoTable().setModel(new TodolistTable());
        TodolistTable todolistTable = (TodolistTable) mainWindow.getTodoTable().getModel();

        for (Todolist todolist : todolists.getTodolists()) {
            todolistTable.addRow(new Object[] {todolist.getId(), todolist.getTodo(), todolist.getCreated_at(), todolist.getModified_at()});
        }
    }

    public boolean update() {
        var user = SessionService.current();
        
        TodolistUpdateRequest request = new TodolistUpdateRequest(
                mainWindow.getIdTodoSelected(),
                user.getName(),
                mainWindow.getTodo().getText()
        );
        
        try {
            todolistService.update(request);
            mainWindow.getTodo().setText("");
            JOptionPane.showMessageDialog(mainWindow, "Update todo success");
            return true;
        } catch (RuntimeException exception) {
            JOptionPane.showMessageDialog(mainWindow, exception.getMessage());
            return false;
        }
    }

    public boolean delete() {
        var user = SessionService.current();
        
        TodolistDeleteRequest request = new TodolistDeleteRequest(
                mainWindow.getIdTodoSelected(), user.getId(), mainWindow.getTodo().getText());
        try {
            int yes = JOptionPane.showConfirmDialog(
                    mainWindow, "Are you sure want delete todolist \nwith id "+ mainWindow.getIdTodoSelected() +
                            " and todo : " + mainWindow.getTodo().getText() + " ?",
                    "Confirmation", JOptionPane.YES_NO_OPTION);
            if (yes == JOptionPane.YES_OPTION) {
                todolistService.delete(request);
                mainWindow.getTodo().setText("");
                JOptionPane.showMessageDialog(mainWindow, "Delete todo success");
                mainWindow.setIdTodoSelected(0);
                return true;
            } else {
                return false;
            }
        } catch (RuntimeException exception) {
            JOptionPane.showMessageDialog(mainWindow, exception.getMessage());
            return false;
        }
    }

    public void deleteAll() {
        int yes = JOptionPane.showConfirmDialog(
                    mainWindow, "Are you sure want delete all todolist ?",
                    "Confirmation", JOptionPane.YES_NO_OPTION);
        if (yes == JOptionPane.YES_OPTION) {
            var user = SessionService.current();
            todolistRepository.deleteAll(user.getId());
        }
    }

}
