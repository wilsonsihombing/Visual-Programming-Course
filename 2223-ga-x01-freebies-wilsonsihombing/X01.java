// 12S22011 - Wilson Eksaudi Sihombing
// 12S22006 - Felice Anggie Sirait
import java.util.*;
import java.lang.Math;

public class X01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double transaksi, hargabuku, bukutermurah;
        
        transaksi = 0;
        boolean stop;
        
        stop = false;
        bukutermurah = 1000;
        while (!stop) {
            hargabuku = Double.parseDouble(input.nextLine());
            if (hargabuku == 0) {
                stop = !stop;
            } else {
                if (bukutermurah < hargabuku) {
                } else {
                    bukutermurah = hargabuku;
                }
                transaksi = transaksi + hargabuku;
            }
        }
        if (transaksi >= 100) {
            transaksi = transaksi - bukutermurah;
        }
        System.out.println(toFixed(transaksi,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
