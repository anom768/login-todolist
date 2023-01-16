package ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.service;

import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.domain.TodolistDeleteRequest;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.domain.TodolistInsertRequest;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.domain.TodolistListResponse;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.domain.TodolistResponse;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.domain.TodolistUpdateRequest;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.entity.Todolist;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.repository.TodolistRepository;

public class TodolistServiceImpl implements TodolistService {

    private final TodolistRepository todolistRepository;

    public TodolistServiceImpl(TodolistRepository todolistRepository) {
        this.todolistRepository = todolistRepository;
    }

    @Override
    public TodolistResponse insert(TodolistInsertRequest request) {
        validateInsert(request);
        try {
            Todolist todolist = new Todolist(request.getId_user(), request.getTodo());
            todolistRepository.insert(todolist);

            TodolistResponse response = new TodolistResponse(todolist);
            return response;
        } catch (RuntimeException exception) {
            throw exception;
        }
    }

    private void validateInsert(TodolistInsertRequest request) {
        if (request.getId_user() == null | request.getTodo() == null |
            request.getId_user().trim().equals("") | request.getTodo().trim().equals("")) {
                throw new RuntimeException("todo can not blank");
            }
    }

    @Override
    public TodolistListResponse getAll(String id_user) {
        TodolistListResponse response = new TodolistListResponse(todolistRepository.getAll(id_user));
        return response;
    }

    @Override
    public TodolistResponse update(TodolistUpdateRequest request) {
        validateUpdate(request);
        try {
            Todolist todolist = new Todolist(request.getId(), request.getId_user(), request.getTodo());
            todolistRepository.update(todolist);
            TodolistResponse response = new TodolistResponse(todolist);
            return response;
        } catch (RuntimeException exception) {
            throw exception;
        }
    }

    private void validateUpdate(TodolistUpdateRequest request) {
        if (request.getTodo() == null | request.getTodo().trim().equals("")) {
            throw new RuntimeException("todo can not blank");
        }
    }

    @Override
    public boolean delete(TodolistDeleteRequest request) {
        validateDelete(request);
        try {
            todolistRepository.delete(new Todolist(request.getId(), request.getId_user()));
            return true;
        } catch (RuntimeException exception) {
            throw exception;
        }
    }
    
    private void validateDelete(TodolistDeleteRequest request) {
        if (request.getTodo() == null | request.getTodo().trim().equals("")) {
            throw new RuntimeException("todo can not blank");
        }
    }

}
