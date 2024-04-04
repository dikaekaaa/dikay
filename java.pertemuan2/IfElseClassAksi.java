/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifelse;

/**
 *
 * @author oitco
 */
public class IfElseClassAksi {
    public static void main (String[] args){
        
    
    IfElseClass ifclass = new IfElseClass();
    
    ifclass.setInputData();
    ifclass.getKeterangan();
      System.out.println("hasil akhir");
      System.out.println("==========================================");
      System.out.println("nama siswa                :"+ifclass.nama);
      System.out.println("nilai akhir yang di dapat :"+ifclass.nilAkhir);
      System.out.println("keterangan                :"+ifclass.getKeterangan());
      System.out.println("===========================================");
      
    }
    
}
