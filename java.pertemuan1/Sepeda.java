/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author oitcome
 */
public class Sepeda{
    int kecepatan = 0;
    int gir = 0;
    
    void ubahgir(int pertambahanGir) {
        gir = gir + pertambahanGir;
        System.out.println("Gir: " + gir);
    }
    void tambahKecepatan(int pertambahanKecepatan) {
        kecepatan = kecepatan + pertambahanKecepatan;
        System.out.println("Kecepatan: " + kecepatan);
    }
}

