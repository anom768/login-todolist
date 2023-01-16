package ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.repository;


import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.entity.Todolist;

public interface TodolistRepository {
    
    Todolist insert(Todolist todolist);

    Todolist[] getAll(String id_user);

    Todolist update(Todolist todolist);

    boolean delete(Todolist todolist);
    
    boolean deleteAll(String id);

    void deleteAll();

}
