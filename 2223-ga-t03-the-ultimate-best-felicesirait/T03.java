// 12S22006 - Felice Anggie Sirait
// 12S22011 - Wilson Eksaudi Sihombing
import java.util.*;
import java.lang.Math;

public class T03 {
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
        String kategoridiskon;
        String kategoribook;
        double penilaianbuku;
        
        do {
            iSBN = input.nextLine();
            if (iSBN.equals("---")) {
            } else {
                judul = input.nextLine();
                penulis = input.nextLine();
                tahunTerbit = input.nextLine();
                penerbit = input.nextLine();
                if (penerbit.equals("---")) {
                    penerbit = "---";
                } else {
                    penerbit = penerbit;
                }
                formatBukuElektranik = input.nextLine();
                hargaPembelian = Double.parseDouble(input.nextLine());
                minimumMargin = Double.parseDouble(input.nextLine());
                if (minimumMargin > 0) {
                    kategoridiskon = "---";
                } else {
                    if (minimumMargin < -(hargaPembelian * 40 / 100)) {
                        kategoridiskon = "Once in a lifetime";
                    } else {
                        if (minimumMargin < -(hargaPembelian * 20 / 100)) {
                            kategoridiskon = "Never come twice";
                        } else {
                            kategoridiskon = "No regret";
                        }
                    }
                }
                stok = Integer.parseInt(input.nextLine());
                rating = Double.parseDouble(input.nextLine());
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
                if (kategoridiskon.equals("Once in a lifetime") && kategoribuku.equals("Best Pick")) {
                    kategoribook = "The ultimate best";
                } else {
                    kategoribook = "---";
                }
                System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahunTerbit + "|" + penerbit + "|" + formatBukuElektranik + "|" + hargaPembelian + "|" + minimumMargin + "|" + stok + "|" + rating + "|" + kategoribuku + "|" + kategoridiskon + "|" + kategoribook);
            }
        } while (!iSBN.equals("---"));
    }
}


