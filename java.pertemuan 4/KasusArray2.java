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
public class KasusArray2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, jd;
        String[] kb = new String[10];
        String[] nb = new String[10];
        String[] hb = new String[10];
        String tanya = "";

        do {
            System.out.print("Masukkan jumlah data: ");
            jd = input.nextInt();

            for (i = 1; i <= jd; i++) {
                System.out.println("Data Ke- " + i);
                System.out.print("Kode barang: ");
                kb[i] = input.next();
                System.out.print("Nama barang: ");
                nb[i] = input.next();
                System.out.print("harga barang: ");
                hb [i] = input.next();
            }

            System.out.println("\n\nDATA PELANGGAN PT. SENTOSA JAYA");
            System.out.println("JL. Sagu No.27A Kebagusan Jakarta selatan");
            System.out.println("==============================================================");

            for (i = 1; i <= jd; i++) {
                System.out.println("Data Ke- " + i);
                System.out.println("Kode barang: " + kb[i]);
                System.out.println("Nama barang: " + nb[i]);
                System.out.println("harga barang: " + hb[i]);
                System.out.println("==============================================================");
            }

            System.out.print("Mau input data lagi: ");
            tanya = input.next();
        } while (tanya.equals("Y") || tanya.equals("y"));
    }
}