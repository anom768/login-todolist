package ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.domain;

public class UserRegisterRequest {

    private final String id;
    private final String name;
    
    private final String password;
    private final String passwordVerify;

    public UserRegisterRequest(String id, String name, String password, String passwordVerify) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.passwordVerify = passwordVerify;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getPasswordVerify() {
        return passwordVerify;
    }
}
