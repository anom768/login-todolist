package ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.domain;

public class UserUpdateProfileRequest {
    
    private String id, newName;

    public UserUpdateProfileRequest(String id, String newName) {
        this.id = id;
        this.newName = newName;
    }

    public String getId() {
        return id;
    }

    public String getNewName() {
        return newName;
    }
}
