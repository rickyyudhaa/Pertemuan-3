/*
 *
 * @author
 * NAMA 	: Ricky Yudha Pratama Kawamura
 * KELAS	: PBO6
 * NIM		: 10117910
 * 
 * Description : Program User Login
 *
 */
package pbo6.pkg10117910.latihan33.userlogin;

import java.util.Scanner;

/**
 *
 * @author rickyyudhaa
 */
public class PBO610117910Latihan33Userlogin {

    /**
     * @param args the command line arguments
     */
    private static String username, password;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Masukkan Username = ");
        username = scn.next();

        System.out.print("Masukkan password = ");
        password = scn.next();

        User cek = new User();
        cek.loginChecking(username, password);
    }

}
