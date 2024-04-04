package ifelse;
import kondisiif.*;
import java.util.Scanner;

/**
 *
 * @author oitco
 */
public class latifelse {
    public static void main(String[] args){
    Scanner input = new Scanner (System.in);
    String keterangan,nama;
    int nilai;
    
    System.out.print("masukan nama siswa:");
    nama = input.nextLine();
    System.out.print("masukan nilai akhir:");
    nilai = input.nextInt();
       if(nilai > 70){
           //perintah jjika kondisi true
           keterangan="lulus";
       }else{
           //perintah jika kondisi false
           keterangan="gagal";
           
       }
       System.out.println("hasil akhir");
       System.out.println("==========================================");
       System.out.println("nama siswa                  :"+nama);
       System.out.println("nilai akhir yang di dapat   :"+nilai);
       System.out.println("keterangan                  :"+keterangan);
       System.out.println("==========================================");
    }
    
}
