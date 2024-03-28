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
public class aksiscanner {
    public static void main(String args[])
    {
        //membuat objek baru
        classscanner scan = new classscanner();
        
        scan.inputScanner();
        System.out.print("\nnama anda :" + scan.getnama());
        System.out.print("\nnilai anda : " + scan.rata());
        
        
    }
            
    
}
