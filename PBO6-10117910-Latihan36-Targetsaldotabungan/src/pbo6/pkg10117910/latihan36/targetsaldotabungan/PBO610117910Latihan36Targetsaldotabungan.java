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
package pbo6.pkg10117910.latihan36.targetsaldotabungan;

/**
 *
 * @author rickyyudhaa
 */
public class PBO610117910Latihan36Targetsaldotabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        savings save = new savings();
        save.balance = 3500000;
        save.interest = 8;
        int balanceTarget = 6000000;
        
        save.count(save.balance, balanceTarget);
    }
    
}
