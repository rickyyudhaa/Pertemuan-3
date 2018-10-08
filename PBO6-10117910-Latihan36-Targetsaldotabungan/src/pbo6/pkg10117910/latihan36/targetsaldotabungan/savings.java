/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10117910.latihan36.targetsaldotabungan;

/**
 *
 * @author rickyyudhaa
 */
public class savings {
    public int balance,interest;

    public double cInterest(int parBalance, int parInterest){
        return parBalance*parInterest/100;
    }

    public void count(int parBalance, int parBalancetarget){
        int i = 1;
        while (parBalance <= parBalancetarget) {
            cInterest(parBalance,interest);
            parBalance += cInterest(parBalance, interest);

            String moneyformat = String.format("Rp.%,3d", parBalance).replaceAll(",", ".");
            System.out.printf("Saldo di bulan ke-"+i+" %s%n",moneyformat);
            i++;
        }
    }
}
