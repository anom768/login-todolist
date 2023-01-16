package ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.domain;

public class UserUpdatePasswordRequest {

    private final String id;
    private final String oldPassword;
    
    private final String newPassword;
    private final String newPasswordVerify;

    public UserUpdatePasswordRequest(String id, String oldPassword, String newPassword, String newPasswordVerify) {
        this.id = id;
        this.oldPassword = oldPassword;
        this.newPassword = newPassword;
        this.newPasswordVerify = newPasswordVerify;
    }

    public String getId() {
        return id;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public String getNewPasswordVerify() {
        return newPasswordVerify;
    }
}
