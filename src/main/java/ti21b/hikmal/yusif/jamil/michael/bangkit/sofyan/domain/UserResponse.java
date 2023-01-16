package ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.domain;

import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.entity.User;

public class UserResponse {
    
    private final User user;

    public UserResponse(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
