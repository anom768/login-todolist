package ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.domain;

import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.entity.Todolist;

public class TodolistListResponse {
    
    private final Todolist[] todolists;

    public TodolistListResponse(Todolist[] todolists) {
        this.todolists = todolists;
    }

    public Todolist[] getTodolists() {
        return todolists;
    }
}
