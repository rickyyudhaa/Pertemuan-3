/*
 *
 * @author
 * NAMA 	: Ricky Yudha Pratama Kawamura
 * KELAS	: PBO6
 * NIM		: 10117910
 * 
 * Description : Program tunjangan
 *
 */
package pbo6.pkg10117910.latihan35.programtunjangan;

import java.util.Scanner;
/**
 *
 * @author rickyyudhaa
 */
public class PBO610117910Latihan35Programtunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        pbo6.pkg10117910.latihan35.programTunjangan.Tunjangan tjg = new pbo6.pkg10117910.latihan35.programTunjangan.Tunjangan();
        Scanner scan = new Scanner(System.in);

        System.out.println("===========Program Tunjangan===========");
        System.out.print("Berapa gaji pokok Anda perbulan ? : Rp. ");
        tjg.salary = scan.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum) : ");
        tjg.status = scan.next();

        tjg.output(tjg.status,tjg.salary);
    }
    
}
