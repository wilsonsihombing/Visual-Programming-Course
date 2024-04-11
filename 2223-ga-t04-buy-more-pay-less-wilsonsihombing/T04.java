// 12S22011- Wilson Eksaudi Sihombing
// 12S22006- Felice Sirait
import java.util.*;
import java.lang.Math;

public class T04 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] iSBN = new String[3];
        int[] quantity = new int[3];
        
        quantity[0] = 0;
        quantity[1] = 0;
        quantity[2] = 0;
        double[] price = new double[3];
        
        price[0] = 0;
        price[1] = 0;
        price[2] = 0;
        double[] totalPrice = new double[3];
        
        totalPrice[0] = 0;
        totalPrice[1] = 0;
        totalPrice[2] = 0;
        int i, quantity0, quantity1, quantity2;
        
        i = 0;
        quantity0 = 0;
        quantity1 = 0;
        quantity2 = 0;
        String buku0, buku1, buku2;
        
        buku0 = "buku";
        buku1 = "buku";
        buku2 = "buku";
        int nol, satu, dua;
        
        nol = 0;
        satu = 1;
        dua = 2;
        double totalRealPrice;
        
        while (i < 3) {
            iSBN[i] = input.nextLine();
            if (iSBN[i].equals("---")) {
                i = 3;
            } else {
                if (iSBN[i].equals(iSBN[0])) {
                    if (nol == 0) {
                        buku0 = iSBN[i];
                    }
                    if (iSBN[0].equals(buku0)) {
                        i = 0;
                        price[i] = Double.parseDouble(input.nextLine());
                        quantity[i] = Integer.parseInt(input.nextLine());
                        quantity0 = quantity0 + quantity[i];
                        nol = 3;
                        i = i + 1;
                    } else {
                        if (satu == 1) {
                            buku1 = iSBN[i];
                        }
                        if (iSBN[0].equals(buku1)) {
                            i = 1;
                            price[i] = Double.parseDouble(input.nextLine());
                            quantity[i] = Integer.parseInt(input.nextLine());
                            quantity1 = quantity1 + quantity[i];
                            nol = 3;
                            i = i + 1;
                        } else {
                            i = 2;
                            price[i] = Double.parseDouble(input.nextLine());
                            quantity[i] = Integer.parseInt(input.nextLine());
                            quantity2 = quantity2 + quantity[i];
                            nol = 3;
                            i = 0;
                        }
                    }
                } else {
                    if (iSBN[i].equals(iSBN[1])) {
                        if (satu == 1) {
                            buku1 = iSBN[i];
                        }
                        if (iSBN[1].equals(buku1)) {
                            i = 1;
                            price[i] = Double.parseDouble(input.nextLine());
                            quantity[i] = Integer.parseInt(input.nextLine());
                            quantity1 = quantity1 + quantity[i];
                            satu = 3;
                            i = i + 1;
                        } else {
                            i = 2;
                            price[i] = Double.parseDouble(input.nextLine());
                            quantity[i] = Integer.parseInt(input.nextLine());
                            quantity2 = quantity2 + quantity[i];
                            satu = 3;
                            i = 0;
                        }
                    } else {
                        if (iSBN[i].equals(iSBN[2])) {
                            if (dua == 2) {
                                buku2 = iSBN[i];
                            }
                            if (iSBN[2].equals(buku2)) {
                                i = 2;
                                price[i] = Double.parseDouble(input.nextLine());
                                quantity[i] = Integer.parseInt(input.nextLine());
                                quantity2 = quantity2 + quantity[i];
                                dua = 3;
                                i = 0;
                            }
                        }
                    }
                }
            }
        }
        if (quantity0 >= 20) {
            price[0] = price[0] - price[0] * 12 / 100;
        } else {
            if (quantity0 >= 10) {
                price[0] = price[0] - price[0] * 5 / 100;
            } else {
                if (quantity0 >= 5) {
                    price[0] = price[0] - price[0] * 2 / 100;
                }
            }
        }
        totalPrice[0] = price[0] * quantity0;
        if (quantity1 >= 20) {
            price[1] = price[1] - price[1] * 12 / 100;
        } else {
            if (quantity1 >= 10) {
                price[1] = price[1] - price[1] * 5 / 100;
            } else {
                if (quantity1 >= 5) {
                    price[1] = price[1] - price[1] * 2 / 100;
                }
            }
        }
        totalPrice[1] = price[1] * quantity1;
        if (quantity2 >= 20) {
            price[2] = price[2] - price[2] * 12 / 100;
        } else {
            if (quantity2 >= 10) {
                price[2] = price[2] - price[2] * 5 / 100;
            } else {
                if (quantity2 >= 5) {
                    price[2] = price[2] - price[2] * 2 / 100;
                }
            }
        }
        totalPrice[2] = price[2] * quantity2;
        totalRealPrice = totalPrice[0] + totalPrice[1] + totalPrice[2];
        System.out.println(toFixed(totalRealPrice,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
