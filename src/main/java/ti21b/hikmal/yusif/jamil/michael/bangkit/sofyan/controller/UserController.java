package ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.controller;

import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.config.Database;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.domain.UserLoginRequest;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.domain.UserRegisterRequest;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.domain.UserUpdatePasswordRequest;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.domain.UserUpdateProfileRequest;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.helper.ClearFormHelper;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.repository.UserRepository;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.repository.UserRepositoryImpl;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.service.SessionService;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.service.UserService;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.service.UserServiceImpl;
import javax.swing.*;
import java.sql.SQLException;
import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.view.MainWindow;

public class UserController {

    private final Database database;
    private final UserRepository userRepository;
    private final UserService userService;
    private final MainWindow mainWindow;

    public UserController(MainWindow mainWindow, Database database) throws SQLException {
        //database = new Database("_test");
        this.database = database;
        userRepository = new UserRepositoryImpl(this.database);
        userService = new UserServiceImpl(userRepository);
        this.mainWindow = mainWindow;
    }

    public boolean register() {
        UserRegisterRequest request = new UserRegisterRequest(
                mainWindow.getIdRegister().getText(),
                mainWindow.getNameRegister().getText(),
                mainWindow.getPasswordRegister().getText(),
                mainWindow.getPasswordRegisterVrfy().getText()
        );

        try {
            userService.register(request);
            ClearFormHelper.clearRegister(mainWindow);
            JOptionPane.showMessageDialog(mainWindow, "Register Success");
            return true;
        } catch (RuntimeException exception) {
            ClearFormHelper.clearRegister(mainWindow);
            JOptionPane.showMessageDialog(mainWindow, exception.getMessage());
            return false;
        }
    }

    public boolean login() {
        UserLoginRequest request = new UserLoginRequest(
                mainWindow.getIdLogin().getText(),
                mainWindow.getPasswordLogin().getText()
        );

        try {
            var response = userService.login(request);
            SessionService.create(response.getUser().getId(), response.getUser().getName());
            ClearFormHelper.clearLogin(mainWindow);
            JOptionPane.showMessageDialog(mainWindow, "Login Success");
            mainWindow.getNamePf().setText(response.getUser().getName());
            return true;
        } catch (RuntimeException exception) {
            ClearFormHelper.clearLogin(mainWindow);
            JOptionPane.showMessageDialog(mainWindow, exception.getMessage());
            return false;
        }
    }

    public void dashboard() {
        var user = SessionService.current();
        mainWindow.getWelcome().setText("Welcome " + user.getName());
    }

    public boolean updateName() {
        var user = SessionService.current();
        UserUpdateProfileRequest request = new UserUpdateProfileRequest(
            user.getId(), mainWindow.getNamePf().getText()
        );

        try {
            var response = userService.updateProfile(request);
            SessionService.create(response.getUser().getId(), response.getUser().getName());
            JOptionPane.showMessageDialog(mainWindow, "Update profile success");
            return true;
        } catch (RuntimeException exception) {
            JOptionPane.showMessageDialog(mainWindow, exception.getMessage());
            mainWindow.getNamePf().setText(user.getName());
            return false;
        }
    }

    public boolean updatePassword() {
        var user = SessionService.current();
        UserUpdatePasswordRequest request = new UserUpdatePasswordRequest(
                user.getId(),
                mainWindow.getOldPasswordPf().getText(),
                mainWindow.getNewPasswordPf().getText(),
                mainWindow.getNewPasswordVrfyPf().getText()
        );

        try {
            userService.updatePassword(request);
            ClearFormHelper.clearUpdatePassword(mainWindow);
            JOptionPane.showMessageDialog( mainWindow,"Update password success");
            return true;
        } catch (RuntimeException exception) {
            ClearFormHelper.clearUpdatePassword(mainWindow);
            JOptionPane.showMessageDialog(mainWindow, exception.getMessage());
            return false;
        }
    }

    public void logout() {
        SessionService.destroy();
    }

}
