package ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.service;


import org.mindrot.jbcrypt.BCrypt;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.domain.UserLoginRequest;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.domain.UserRegisterRequest;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.domain.UserResponse;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.domain.UserUpdatePasswordRequest;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.domain.UserUpdateProfileRequest;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.entity.User;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.repository.UserRepository;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserResponse register(UserRegisterRequest request) {
        validateRegister(request);

        try {
            User user = new User(request.getId(), request.getName(), BCrypt.hashpw(request.getPassword(), BCrypt.gensalt()));
            userRepository.insert(user);

            UserResponse response = new UserResponse(user);
            return response;
        } catch (RuntimeException exception) {
            throw exception;
        }
    }


    private void validateRegister(UserRegisterRequest request) {
        User user = userRepository.findById(request.getId());
        if (user != null) {
            throw new RuntimeException("id is already exsist");
        }

        if (request.getId() == null | request.getName() == null | request.getPassword() == null |
            request.getPasswordVerify() == null | request.getId().trim().equals("") |
            request.getName().trim().equals("") | request.getPassword().trim().equals("") |
            request.getPasswordVerify().trim().equals("")) {
                throw new RuntimeException("id, name and password can not blank");
            }

        if (request.getId().length() < 5 | request.getPassword().length() < 5 | request.getPasswordVerify().length() < 5) {
            throw new RuntimeException("id and password minimun must 5 characters");
        }

        if (!request.getPassword().equals(request.getPasswordVerify())) {
            throw new RuntimeException("password not same");
        }

    }

    @Override
    public UserResponse login(UserLoginRequest request) {
        User user = validateLogin(request);

        UserResponse response = new UserResponse(user);

        return response;
    }

    private User validateLogin(UserLoginRequest request) {
        User user = userRepository.findById(request.getId());

        if (request.getId() == null | request.getPassword() == null |
            request.getId().trim().equals("") | request.getPassword().trim().equals("")) {
                throw new RuntimeException("id and password can not blank");
            }

        if (user == null) {
            throw new RuntimeException("id or password is wrong");
        }

        if (!BCrypt.checkpw(request.getPassword(), user.getPassword())) {
            throw new RuntimeException("id or password is wrong");
        }

        return user;
    }

    @Override
    public UserResponse updatePassword(UserUpdatePasswordRequest request) {
        User user = validateUpdatePassword(request);

        try {
            user.setPassword(BCrypt.hashpw(request.getNewPassword(), BCrypt.gensalt()));
            userRepository.update(user);

            UserResponse response = new UserResponse(user);
            return response;
        } catch (RuntimeException exception) {
            throw exception;
        }
    }

    private User validateUpdatePassword(UserUpdatePasswordRequest request) {
        User user = userRepository.findById(request.getId());

        if (request.getOldPassword() == null | request.getNewPassword() == null | request.getNewPasswordVerify() == null |
            request.getOldPassword().trim().equals("") | request.getNewPassword().trim().equals("") | request.getNewPasswordVerify().trim().equals("")) {
                throw new RuntimeException("password can not blank");
            }

        if (request.getNewPassword().length() < 5 | request.getNewPasswordVerify().length() < 5) {
            throw new RuntimeException("password minimun must 5 characters");
        }

        if (!request.getNewPasswordVerify().equals(request.getNewPassword())) {
            throw new RuntimeException("password not same");
        }

        if (!BCrypt.checkpw(request.getOldPassword(), user.getPassword())) {
            throw new RuntimeException("old password is wrong");
        }

        if (BCrypt.checkpw(request.getNewPassword(), user.getPassword())) {
            throw new RuntimeException("can not same with current password");
        }

        return user;

    }

    @Override
    public UserResponse updateProfile(UserUpdateProfileRequest request) {
        validateUpdateProfile(request);

        try {
            User user = userRepository.findById(request.getId());
            user.setName(request.getNewName());
            userRepository.update(user);

            UserResponse response = new UserResponse(user);
            return response;
        } catch (RuntimeException exception) {
            throw exception;
        }
    }


    private void validateUpdateProfile(UserUpdateProfileRequest request) {
        if (request.getNewName() == null | request.getNewName().trim().equals("")) {
            throw new RuntimeException("name can not blank");
        }

    }

}
