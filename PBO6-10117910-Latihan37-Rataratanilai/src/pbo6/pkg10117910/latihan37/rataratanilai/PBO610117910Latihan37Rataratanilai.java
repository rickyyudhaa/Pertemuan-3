/*
 *
 * @author
 * NAMA 	: Ricky Yudha Pratama Kawamura
 * KELAS	: PBO6
 * NIM		: 10117910
 * 
 * Description : Program Target Saldo Tabungan
 *
 */
package pbo6.pkg10117910.latihan37.rataratanilai;

import java.util.Scanner;

/**
 *
 * @author rickyyudhaa
 */
public class PBO610117910Latihan37Rataratanilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        int student;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        student = scan.nextInt();

        mhs.HitungTotal(mhs.Studentgrade, student);
        mhs.HitungRataRataStudentgrade(mhs.totalStudentgrade, student);

        System.out.println("\nMaka, Rata-rata Nilainya adalah : " + mhs.HitungRataRataStudentgrade(mhs.totalStudentgrade, student));
    }

}
