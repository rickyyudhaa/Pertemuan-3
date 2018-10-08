/*
 *
 * @author
 * NAMA 	: Ricky Yudha Pratama Kawamura
 * KELAS	: PBO6
 * NIM		: 10117910
 * 
 * Description : Program Warna Kepribadian
 *
 */
package pbo6.pkg10117910.latihan40.warnakepribadian;

import java.util.Scanner;

/**
 *
 * @author rickyyudhaa
 */
public class PBO610117910Latihan40Warnakepribadian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String warnaMu;
        String namaMu;
        warna clr = new warna();
        Scanner scan = new Scanner(System.in);

        System.out.print(clr.ANSI_RED + "YUK "
                + clr.ANSI_RESET);
        System.out.print(clr.ANSI_GREEN + "CEK "
                + clr.ANSI_RESET);
        System.out.print(clr.ANSI_YELLOW + "KEPRIBADIANMU "
                + clr.ANSI_RESET);
        System.out.print(clr.ANSI_CYAN + "DARI "
                + clr.ANSI_RESET);
        System.out.print(clr.ANSI_PURPLE + "WARNA "
                + clr.ANSI_RESET);
        System.out.print(clr.ANSI_BLUE + "FAVORITMU "
                + clr.ANSI_RESET + "\n");

        System.out.print("\n" + clr.ANSI_RED_BACKGROUND + clr.ANSI_WHITE
                + "\t MERAH \t\t\n" + clr.ANSI_RESET);
        System.out.print(clr.ANSI_GREEN_BACKGROUND + clr.ANSI_WHITE
                + "\t HIJAU \t\t\n" + clr.ANSI_RESET);
        System.out.print(clr.ANSI_YELLOW_BACKGROUND + clr.ANSI_WHITE
                + "\t KUNING \t\n" + clr.ANSI_RESET);
        System.out.print(clr.ANSI_BLUE_BACKGROUND + clr.ANSI_WHITE
                + "\t BIRU \t\t\n" + clr.ANSI_RESET);
        System.out.print(clr.ANSI_PURPLE_BACKGROUND + clr.ANSI_WHITE
                + "\t UNGU \t\t\n\n" + clr.ANSI_RESET);

        System.out.print("PILIH WARNA FAVORITMU : ");
        warnaMu = scan.next();
        System.out.print("NAMA KAMU : ");
        namaMu = scan.next();

        System.out.println("\n====HASIL TEST KEPRIBADIAN "
                + namaMu.toUpperCase() + "====");
        clr.hasilWarna(warnaMu);
    }
    
}
