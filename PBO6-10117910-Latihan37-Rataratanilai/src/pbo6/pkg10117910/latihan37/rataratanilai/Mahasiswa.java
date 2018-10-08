/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10117910.latihan37.rataratanilai;

import java.util.Scanner;
/**
 *
 * @author rickyyudhaa
 */
public class Mahasiswa {
    public int Studentgrade;
    public double totalStudentgrade;
    Scanner scan = new Scanner(System.in);

    public double HitungTotal(int parStudentgrade, int parN){
        for (int i=1; i<=parN; i++){
            System.out.print("Nilai Mahasiswa ke-"+i+" : ");
            parStudentgrade = scan.nextInt();
            totalStudentgrade += parStudentgrade;
        }
    return totalStudentgrade;}

    public double HitungRataRataStudentgrade(double total, int jmlhMhs) {
        return total/jmlhMhs;
    }
}
