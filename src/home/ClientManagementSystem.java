package home;

import gui.UserLogin;

public class ClientManagementSystem {

    public static void main(String[] args) {
        new ResourceTester().createDirectory();
        UserLogin.launcher();
    }
    
}
