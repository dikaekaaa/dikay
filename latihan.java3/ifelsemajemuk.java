/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifelse;
import kondisiif.*;
import java.util.Scanner;

/**
 *
 * @author oitco
 */
public class ifelsemajemuk {
    public static void main(String[] args){
    int pendapatan;
    double jasa, komisi, total;
    
//deklarasi objek
Scanner input = new Scanner(System.in);
System.out.print("masukan pendapatan sales Rp.");
pendapatan = input.nextInt();

if (pendapatan >= 0 && pendapatan <= 200000) {
jasa = 20000;
komisi =0.5* pendapatan;
}
else {
jasa=30000;
komisi=0.2*pendapatan;
}

/*menghitung total*/
total = komisi + jasa;
System.out.println("\nuang jasa Rp " + (int) jasa);
System.out.println("\nuang komisi Rp" + (int) komisi);
System.out.println("===================================");
System.out.println("\nuang total Rp " + (int) total);
}
}


    
