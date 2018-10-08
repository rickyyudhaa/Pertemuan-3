/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10117910.latihan35.programTunjangan;

/**
 *
 * @author rickyyudhaa
 */
public class Tunjangan{
    public String status;
    public Double salary, allowance;

    public Double countTotalsalary(double parsalary, double parAllowance){
    return allowance = parsalary+parAllowance;
    }
    public Double countAllowance(String parStatus, double parSalary){
    return allowance=(parStatus.equals("Menikah")?0.35*parSalary:0);
    }


    public void output(String parStatus, double parSalaryy){
        System.out.println("\n=========Hasil Perhitungan Gaji Anda=========");
        System.out.println("Gaji Pokok \t: Rp "+salary);
        System.out.println("Allowance \t: Rp "+countAllowance(parStatus,parSalaryy));
        System.out.println("Total Gaji \t: Rp "+countTotalsalary(parSalaryy,allowance));
}
}
