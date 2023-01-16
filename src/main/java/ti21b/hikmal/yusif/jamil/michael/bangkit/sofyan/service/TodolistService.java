package ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.service;

import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.domain.TodolistDeleteRequest;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.domain.TodolistInsertRequest;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.domain.TodolistListResponse;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.domain.TodolistResponse;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.domain.TodolistUpdateRequest;

public interface TodolistService {

    TodolistResponse insert(TodolistInsertRequest request);

    TodolistListResponse getAll(String id_user);

    TodolistResponse update(TodolistUpdateRequest request);

    boolean delete(TodolistDeleteRequest request);

}
