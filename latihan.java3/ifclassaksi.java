/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kondisiif;
import java.util.Scanner;

/**
 *
 * @author oitco
 */
public class ifclassaksi {
    public static void main(String []args)
    {
        double tot_beli;
        Scanner input = new Scanner(System.in);
        ifclass fungsiif = new ifclass();
        
        System.out.print("total pembelian Rp. ");
        fungsiif.Totbeli = input.nextDouble();
        
        System.out.println("besarnya potong Rp. " + fungsiif.getpotongan());
        
    }
    
}
