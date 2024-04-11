// 12S22006 - Felice Anggie Sirait
// 12S22011 - Wilson Eksaudi Sihombing
import java.util.*;
import java.lang.Math;

public class T01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN;
        String judul;
        String penulis;
        String tahunTerbit;
        String penerbit;
        String formatBukuElektranik;
        double hargaPembelian;
        double minimumMargin;
        int stok;
        double rating;
        
        iSBN = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        tahunTerbit = input.nextLine();
        penerbit = input.nextLine();
        formatBukuElektranik = input.nextLine();
        hargaPembelian = input.nextDouble();
        minimumMargin = input.nextDouble();
        stok = input.nextInt();
        rating = input.nextDouble();
        System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahunTerbit + "|" + penerbit + "|" + formatBukuElektranik + "|" + hargaPembelian + "|" + minimumMargin + "|" + stok + "|" + rating);
    }
}
