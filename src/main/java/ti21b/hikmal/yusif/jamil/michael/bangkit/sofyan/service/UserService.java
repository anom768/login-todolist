package ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.service;

import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.domain.UserLoginRequest;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.domain.UserRegisterRequest;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.domain.UserResponse;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.domain.UserUpdatePasswordRequest;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.domain.UserUpdateProfileRequest;

public interface UserService {

    UserResponse register(UserRegisterRequest request);

    UserResponse login(UserLoginRequest request);

    UserResponse updatePassword(UserUpdatePasswordRequest request);

    UserResponse updateProfile(UserUpdateProfileRequest request);

}
