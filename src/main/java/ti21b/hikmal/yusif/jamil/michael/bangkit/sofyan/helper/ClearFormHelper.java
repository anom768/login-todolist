package ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.helper;

import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.view.MainWindow;

public class ClearFormHelper {

    public static void clearRegister(MainWindow mainWindow) {
        mainWindow.getIdRegister().setText("");
        mainWindow.getNameRegister().setText("");
        mainWindow.getPasswordRegister().setText("");
        mainWindow.getPasswordRegisterVrfy().setText("");
    }

    public static void clearLogin(MainWindow mainWindow) {
        mainWindow.getIdLogin().setText("");
        mainWindow.getPasswordLogin().setText("");
    }

    public static void clearUpdatePassword(MainWindow mainWindow) {
        mainWindow.getOldPasswordPf().setText("");
        mainWindow.getNewPasswordPf().setText("");
        mainWindow.getNewPasswordVrfyPf().setText("");
    }

}
