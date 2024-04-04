
package polimorfisme;

/**
 *
 * @author oitco
 */
class hewan {
    public void suara (){
        System.out.println("Hewan bersuara : ");
    }
}
class kuda extends hewan {
    @Override
    public void suara () {
        System.out.println("Kuda mengikik....");
    }
}
class kucing extends hewan {
    @Override
    public void suara () {
        System.out.println("Kucing mengeong....");
    }
}
class ayam extends hewan {
    @Override
    public void suara () {
        System.out.println("Ayam berkokok....");
    }
}
public class polimorfisme {
    public static void main (String[] args){
        hewan HEWAN = new hewan();
        kuda KUDA = new kuda();
        kucing KUCING = new kucing();
        ayam AYAM = new ayam();
        
        HEWAN.suara();
        
        HEWAN = KUDA;
        HEWAN.suara();
        
        HEWAN = KUCING;
        HEWAN.suara();
        
        HEWAN = AYAM;
        HEWAN.suara();
    }
}
