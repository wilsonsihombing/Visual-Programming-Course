// 12S22006 - Felice Anggie Sirait.
// 12S22011 - Wilson Sihombing.
import java.util.*;
import java.lang.Math;

public class T02 {
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
        String kategoribuku;
        
        kategoribuku = " ";
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
        if (rating >= 4.7) {
            kategoribuku = "Best Pick";
        } else {
            if (rating >= 4.5) {
                kategoribuku = "Must Read";
            } else {
                if (rating >= 4.0) {
                    kategoribuku = "Recommended";
                } else {
                    if (rating >= 3.0) {
                        kategoribuku = "Average";
                    } else {
                        if (rating < 3.0) {
                            kategoribuku = "Low";
                        }
                    }
                }
            }
        }
        System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahunTerbit + "|" + penerbit + "|" + formatBukuElektranik + "|" + hargaPembelian + "|" + minimumMargin + "|" + stok + "|" + rating + "|" + kategoribuku);
    }
}
