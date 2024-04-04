/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kondisiif;

/**
 *
 * @author oitco
 */
public class ifclass {
    public double Totbeli, potongan;
    
    public void setTotalbeli(double a){
            Totbeli=a;
 }
    public double getpotongan(){
        if (Totbeli >= 50000){
            potongan = 0.2 * Totbeli;
         }
        return potongan;
    }
    
public double Jumlahbayar()
{
    return (Totbeli-potongan);
}
}
    
