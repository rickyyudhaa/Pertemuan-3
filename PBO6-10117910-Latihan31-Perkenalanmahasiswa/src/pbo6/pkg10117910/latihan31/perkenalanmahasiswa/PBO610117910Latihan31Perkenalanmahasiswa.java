/*
 *
 * @author
 * NAMA 	: Ricky Yudha Pratama Kawamura
 * KELAS	: PBO6
 * NIM		: 10117910
 * 
 * Description : Program Perkenalan Mahasiswa
 *
 */
package pbo6.pkg10117910.latihan31.perkenalanmahasiswa;

/**
 *
 * @author rickyyudhaa
 */
public class PBO610117910Latihan31Perkenalanmahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = "10117991";
        mhs1.name= "Asep";
        mhs1.introduceSelf(mhs1.nim, mhs1.name);
        
        Mahasiswa mhs2 = new Mahasiswa();
        mhs1.nim = "10117992";
        mhs1.name= "Bujang";
        mhs1.introduceSelf(mhs2.nim, mhs2.name);
        
        Mahasiswa mhs3 = new Mahasiswa();
        mhs1.nim = "10117993";
        mhs1.name= "Cecep";
        mhs1.introduceSelf(mhs3.nim, mhs3.name);
    }
    
}
