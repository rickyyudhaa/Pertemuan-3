/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10117910.latihan33.userlogin;

/**
 *
 * @author rickyyudhaa
 */
public class User {

    private static String username, password;
    private boolean accountStatus;

    private boolean checkAccount(String parUsername, String parPassword) {
        username = "RizkiAdam";
        password = "terbaikselalu";
        if (parPassword.equals(password) && parUsername.equals(username)) {
            accountStatus = true;
        } else {
            accountStatus = false;
        }
        return accountStatus;
    }

    private void loginOutput(boolean status, String parUsername) {
        if (status == true) {
            System.out.println("");
            System.out.println("******HALLO " + parUsername.toUpperCase() + "******");
            System.out.println("Selamat Datang di Aplikasi ini");
        } else {
            System.out.println("");
            System.out.println("Ooops, Username atau Password anda salah");
        }
    }

    public void loginChecking(String parUsername, String parPassword) {
        checkAccount(parUsername, parPassword);
        loginOutput(accountStatus, parUsername);
    }
}
