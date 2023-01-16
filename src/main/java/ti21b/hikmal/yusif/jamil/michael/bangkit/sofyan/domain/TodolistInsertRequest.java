package ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.domain;

public class TodolistInsertRequest {
    
    private final String id_user;
    private final String todo;

    public TodolistInsertRequest(String id_user, String todo) {
        this.id_user = id_user;
        this.todo = todo;
    }

    public String getId_user() {
        return id_user;
    }

    public String getTodo() {
        return todo;
    }
}
