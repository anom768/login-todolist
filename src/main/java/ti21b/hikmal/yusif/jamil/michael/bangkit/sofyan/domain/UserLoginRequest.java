package ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.domain;

public class UserLoginRequest {
    
    private final String id;
    private final String password;

    public UserLoginRequest(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }
}
