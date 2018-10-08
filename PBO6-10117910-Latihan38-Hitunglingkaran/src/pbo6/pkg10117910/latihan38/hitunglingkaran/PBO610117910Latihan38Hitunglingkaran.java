/*
 *
 * @author
 * NAMA 	: Ricky Yudha Pratama Kawamura
 * KELAS	: PBO6
 * NIM		: 10117910
 * 
 * Description : Program Hitung Lingkaran
 *
 */
package pbo6.pkg10117910.latihan38.hitunglingkaran;

import java.util.Scanner;

/**
 *
 * @author rickyyudhaa
 */
public class PBO610117910Latihan38Hitunglingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String diameter;
        double d;
        Circlecalculator ccctr = new Circlecalculator();

        System.out.println("===Perhitungan Lingkaran===");

        do {
            System.out.print("Masukkan nilai diameter lingkaran : ");
            diameter = scn.nextLine();
            System.out.println((!diameter.matches("[0-9]*"))
                    ? "Nilai Diameter Tidak Sesuai\n" : "");

        } while (!diameter.matches("[0-9]*"));

        System.out.println("===Hasil Perhitungan Lingkaran===");
        d = Double.parseDouble(diameter);

        System.out.printf("Jari-jari Lingkaran = %.0f cm %n",
                ccctr.radius(d));
        System.out.printf("Luas Lingkaran = %.2f cm %n",
                ccctr.circleWide(ccctr.radius(d)));
        System.out.printf("Keliling Lingkaran = %.2f cm %n",
                ccctr.circleRound(ccctr.radius(d)));
    }
}

