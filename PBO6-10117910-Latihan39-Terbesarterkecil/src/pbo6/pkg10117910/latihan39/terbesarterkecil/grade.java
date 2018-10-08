/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10117910.latihan39.terbesarterkecil;

import java.util.Scanner;

/**
 *
 * @author rickyyudhaa
 */
public class grade {
    public int Grade[] = new int[40];
    public int max, min;

    public void inputGrade(int nStudent) {
        int i;
        Scanner scan = new Scanner(System.in);
        for (i = 1; i <= nStudent; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + i + " : ");
            Grade[i] = scan.nextInt();
        }
    }

    public void showgrade(int nStudent) {
        int i;
        System.out.println("===Hasil Nilai Mahasiswa===");
        for (i = 1; i <= nStudent; i++) {
            System.out.println("Nilai Mahasiswa ke-" + i + " = " + Grade[i]);
        }
    }

    public void outputGrademaxmin(int nStudent) {
        int i;

        //Inisialisasi Max dan Min
        min = Grade[1];
        max = Grade[1];

        //Penghitungan Grade Terbesar dan Terkecil
        for (i = 1; i <= nStudent; i++) {
            if (Grade[i] > max) {
                max = Grade[i];
            } else if (Grade[i] < min) {
                min = Grade[i];
            }
        }
    }

}
