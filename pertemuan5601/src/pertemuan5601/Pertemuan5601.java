package pertemuan5601;

/**
 *
 * @author Edy
 * TGL : 26-4-2025
 */
public class Pertemuan5601 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        buah pisang = new buah();
        pisang.warna = "Kuning";
        pisang.SetRasa("Manis");
        
        System.out.printf("Warna Pisang diset %s",pisang.warna);
        System.out.printf("\nRasa Pisang diset %s",pisang.getRasa());
        
        System.out.print("\n");
        
        buah anggur = new buah();
        anggur.warna = "Merah";
        anggur.SetRasa("Asam");
        
        System.out.printf("\nWarna Anggur diset %s",anggur.warna);
        System.out.printf("\nRasa Anggur diset %s",anggur.getRasa());
        System.out.print("\n");
    }
    
}


class buah{
    public String warna;
    private String rasa;
    
    public void SetRasa(String txRasa){
        this.rasa = txRasa;
    }
    public String getRasa(){
        return this.rasa;
    }
}