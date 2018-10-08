/*
 *
 * @author
 * NAMA 	: Ricky Yudha Pratama Kawamura
 * KELAS	: PBO6
 * NIM		: 10117910
 * 
 * Description : Program Nilai Terbesar dan Terkecil
 *
 */
package pbo6.pkg10117910.latihan39.terbesarterkecil;

import java.util.Scanner;

/**
 *
 * @author rickyyudhaa
 */
public class PBO610117910Latihan39Terbesarterkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String officer;
        int nStudent;

        grade grd = new grade();
        Scanner scan = new Scanner(System.in);

        System.out.println("===Program nilai terbesar dan nilai terkecil===");
        System.out.print("Masukkan Nama Petugas : ");
        officer = scan.nextLine();
        System.out.print("Masukkan Banyaknya Mahasiswa :  ");
        nStudent = scan.nextInt();
        System.out.println();

        grd.inputGrade(nStudent);
        System.out.println("");
        grd.outputGrademaxmin(nStudent);
        grd.showgrade(nStudent);
        System.out.println("");
        
        System.out.println("Nilai Terbesar : " + grd.max);
        System.out.println("Nilai Terkecil : " + grd.min);
        System.out.println("");
        System.out.println("Nama Petugas : " + officer);
    }
    }
        
