package ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.domain;

import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.entity.Todolist;

public class TodolistResponse {
    
    private final Todolist todolists;

    public TodolistResponse(Todolist todolists) {
        this.todolists = todolists;
    }

    public Todolist getTodolists() {
        return todolists;
    }
}
