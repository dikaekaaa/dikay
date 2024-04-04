/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrayberdimensi1;
import java.util.Scanner;
/**
 *
 * @author oitco
 */
public class LatArray1 {
    public static void main(String[] args)
    {
    int i;
    int[] nil_akhir;
    //deklarasi variabel array
    nil_akhir = new int[6]; //membuat objek array
    Scanner input = new Scanner(System.in);
        for(i=0; i<6;  i++)
        {
            System.out.println("masukan Array ke " + i + " = ");
            nil_akhir[i] = input.nextInt();    
        }
    System.out.println("\n\nData yang Diinput ke Elemmen Array \n");
    for(i=0;  i<6;  i++)
    {
    System.out.println("Nilai akhir Index " + i);
    System.out.println(" = " + nil_akhir[i]);
    }
    
    }
    
}
