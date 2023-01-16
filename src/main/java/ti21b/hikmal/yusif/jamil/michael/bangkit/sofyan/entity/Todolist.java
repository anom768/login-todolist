package ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.entity;

import java.sql.Timestamp;

public class Todolist {
    
    private int id;
    private String id_user, todo;
    private Timestamp created_at, modified_at;
    
    public Todolist() {
    }

    public Todolist(int id, String id_user, String todo) {
        this.id = id;
        this.id_user = id_user;
        this.todo = todo;
    }

    public Todolist(int id, String id_user) {
        this.id = id;
        this.id_user = id_user;
    }

    public Todolist(String id_user, String todo) {
        this.id_user = id_user;
        this.todo = todo;
    }

    public Todolist(String id_user, String todo, Timestamp created_at, Timestamp modified_at) {
        this.id_user = id_user;
        this.todo = todo;
        this.created_at = created_at;
        this.modified_at = modified_at;
    }

    public Todolist(int id, String id_user, String todo, Timestamp created_at, Timestamp modified_at) {
        this.id = id;
        this.id_user = id_user;
        this.todo = todo;
        this.created_at = created_at;
        this.modified_at = modified_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public Timestamp getModified_at() {
        return modified_at;
    }

    @Override
    public String toString() {
        return "Todolist{" +
                "id=" + id +
                ", id_user='" + id_user + '\'' +
                ", todo='" + todo + '\'' +
                ", created_at=" + created_at +
                ", modified_at=" + modified_at +
                '}';
    }
}
