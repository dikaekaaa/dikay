package scanner;
import java.io.*;

/**
 *
 * @author oitco
 */
public class latbuffered {
    public static void main(String args[]) throws Exception
    {
        //membuat objek baru
        InputStreamReader keyreader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader (keyreader);
        //deklarasi variabel
        String kata1, kata2;
        
        System.out.print("masukan kata pertama : ");
        kata1 = input.readLine();
        System.out.print("masukan kata kedua : ");
        kata2 = input.readLine();
        System.out.println("\nhasil input string : " + kata1 + " " + kata2);
        
    }
        
    }
