package pertemuan5602;

import java.util.Scanner;

/**
 *
 * @author Edy
 * TGL : 26-4-2025
 */
public class Pertemuan5602 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner insi = new Scanner(System.in);
        
        System.out.print("Masukkan panjang sisi persegi: ");
        int nsisi = insi.nextInt();
        
        LuasPersegi LP = new LuasPersegi(nsisi);
        System.out.println("Luas Persegi = Sisi X Sisi");
        System.out.printf("             = %d X %d\n", nsisi,nsisi);
        System.out.printf("             = %d\n", LP.HL());
    }
    
}
