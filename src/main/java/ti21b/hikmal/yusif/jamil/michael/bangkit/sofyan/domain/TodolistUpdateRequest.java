package ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.domain;

public class TodolistUpdateRequest {
    
    private final int id;
    private final String id_user;
    private final String todo;

    public TodolistUpdateRequest(int id, String id_user, String todo) {
        this.id = id;
        this.id_user = id_user;
        this.todo = todo;
    }

    public int getId() {
        return id;
    }

    public String getId_user() {
        return id_user;
    }

    public String getTodo() {
        return todo;
    }
}
