/*
 *
 * @author
 * NAMA 	: Ricky Yudha Pratama Kawamura
 * KELAS	: PBO6
 * NIM		: 10117910
 * 
 * Description : Program Kalkulator
 *
 */
package pbo6.pkg10117910.latihan34.kalkulator;

import java.util.Scanner;

/**
 *
 * @author rickyyudhaa
 */
public class PBO610117910Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan angka ke-1 : ");
        Double value1 = scan.nextDouble();
        System.out.print("Masukkan angka ke-2 : ");
        Double value2 = scan.nextDouble();
        Kalkulator cal = new Kalkulator();
        System.out.println();
        System.out.println("Hasil Pertambahan : " + cal.tambahBilangan(value1, value2));
        System.out.println("Hasil Pengurangan : " + cal.kurangBilangan(value1, value2));
        System.out.println("Hasil Perkalian : " + cal.kaliBilangan(value1, value2));
        System.out.println("Hasil Pembagian : " + cal.bagiBilangan(value1, value2));
        System.out.println("Hasil Sisa : " + cal.sisaBilangan(value1, value2));
    }

}
