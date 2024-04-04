package kondisiif;
import scanner.*;
import java.util.*;
/**
 *
 * @author oitco
 */
public class latif 
{
    public static void main(String []args)
    {
    double tot_beli, potongan=0, jum_bayar=0;
    Scanner input = new Scanner(System.in);
    
    System.out.print("total pembelian Rp. ");
    tot_beli = input.nextDouble();
      if (tot_beli >= 50000)
      potongan = 0.2 * tot_beli;
    System.out.println("besarnya potongan Rp. " + potongan );
    jum_bayar = tot_beli - potongan;
    System.out.println("jumlah yang harus dibayarkan Rp. " + jum_bayar);
                
    }
    
}
