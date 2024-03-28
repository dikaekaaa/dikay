/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scanner;
import java.util.Scanner;

/**
 *
 * @author oitco
 */
public class latscanner {
    public static void main(String args[])
    {
    //membuat objek baru
        Scanner input = new Scanner(System.in);
        
    //deklarasi variabel
    
    String nama;
    int n2;
    double n1, n3;
    
    System.out.print ("masukan nama anda : ");
    nama = input.nextLine();
    System.out.print("masukan nilai 1 :");
    n1 = input.nextDouble();
    System.out.print("masukan nilai 3 :");
    n2 = input.nextInt();
    
    n3 = n1 + n2;
    System.out.print("\nnama anda :" + nama);
    System.out.print("\nnilai anda : " + n3);
    }
    }
