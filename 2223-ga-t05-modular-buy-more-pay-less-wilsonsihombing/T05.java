// 12S22011 - Wilson Eksaudi Sihombing
// 12S22031 - Ioka Purba
import java.util.*;
import java.lang.Math;

public class T05 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] arrISBN = new String[3];
        double[] arrEksPrice = new double[3];
        double totalharga;
        
        totalharga = 0;
        isbn(arrISBN, arrEksPrice);
        hargabuku(arrEksPrice, totalharga);
    }
    
    public static double hargabuku(double[] arrEksPrice, double totalharga) {
        totalharga = arrEksPrice[0] + arrEksPrice[1] + arrEksPrice[2];
        System.out.println(toFixed(totalharga,2));
        
        return totalharga;
    }
    
    public static void isbn(String[] arrISBN, double[] arrEksPrice) {
        arrEksPrice[0] = 0;
        arrEksPrice[1] = 0;
        arrEksPrice[2] = 0;
        int[] arrQuantity = new int[3];
        
        arrQuantity[0] = 0;
        arrQuantity[1] = 0;
        arrQuantity[2] = 0;
        double[] arrPrice = new double[3];
        
        arrPrice[0] = 0;
        arrPrice[1] = 0;
        arrPrice[2] = 0;
        int b, quantity0, quantity1, quantity2;
        
        b = 0;
        quantity0 = 0;
        quantity1 = 0;
        quantity2 = 0;
        String buku0, buku1, buku2;
        
        buku0 = ".";
        buku1 = ".";
        buku2 = ".";
        int zero, one, two;
        
        zero = 0;
        one = 1;
        two = 2;
        do {
            arrISBN[b] = input.nextLine();
            if (!arrISBN[b].equals("---")) {
                if (arrISBN[b].equals(arrISBN[0])) {
                    if (zero == 0) {
                        buku0 = arrISBN[b];
                    }
                    if (arrISBN[0].equals(buku0)) {
                        b = 0;
                        arrPrice[b] = Double.parseDouble(input.nextLine());
                        arrQuantity[b] = Integer.parseInt(input.nextLine());
                        quantity0 = quantity0 + arrQuantity[b];
                        zero = 3;
                        b = b + 1;
                    } else {
                        if (one == 1) {
                            buku1 = arrISBN[b];
                        }
                        if (arrISBN[0].equals(buku1)) {
                            b = 1;
                            arrPrice[b] = Double.parseDouble(input.nextLine());
                            arrQuantity[b] = Integer.parseInt(input.nextLine());
                            quantity1 = quantity1 + arrQuantity[b];
                            zero = 3;
                            b = b + 1;
                        } else {
                            b = 2;
                            arrPrice[b] = Double.parseDouble(input.nextLine());
                            arrQuantity[b] = Integer.parseInt(input.nextLine());
                            quantity2 = quantity2 + arrQuantity[b];
                            zero = 3;
                            b = 0;
                        }
                    }
                } else {
                    if (arrISBN[b].equals(arrISBN[1])) {
                        if (one == 1) {
                            buku1 = arrISBN[b];
                        }
                        if (arrISBN[1].equals(buku1)) {
                            b = 1;
                            arrPrice[b] = Double.parseDouble(input.nextLine());
                            arrQuantity[b] = Integer.parseInt(input.nextLine());
                            quantity1 = quantity1 + arrQuantity[b];
                            one = 3;
                            b = b + 1;
                        } else {
                            b = 2;
                            arrPrice[b] = Double.parseDouble(input.nextLine());
                            arrQuantity[b] = Integer.parseInt(input.nextLine());
                            quantity2 = quantity2 + arrQuantity[b];
                            one = 3;
                            b = 0;
                        }
                    } else {
                        if (arrISBN[b].equals(arrISBN[2])) {
                            if (two == 2) {
                                buku2 = arrISBN[b];
                            }
                            if (arrISBN[2].equals(buku2)) {
                                b = 2;
                                arrPrice[b] = Double.parseDouble(input.nextLine());
                                arrQuantity[b] = Integer.parseInt(input.nextLine());
                                quantity2 = quantity2 + arrQuantity[b];
                                two = 3;
                                b = 0;
                            }
                        }
                    }
                }
            } else {
                b = 3;
            }
        } while (b < 3);
        if (quantity0 >= 20) {
            arrPrice[0] = arrPrice[0] - arrPrice[0] * 12 / 100;
        } else {
            if (quantity0 >= 10) {
                arrPrice[0] = arrPrice[0] - arrPrice[0] * 5 / 100;
            } else {
                if (quantity0 >= 5) {
                    arrPrice[0] = arrPrice[0] - arrPrice[0] * 2 / 100;
                }
            }
        }
        arrEksPrice[0] = arrPrice[0] * quantity0;
        if (quantity1 >= 20) {
            arrPrice[1] = arrPrice[1] - arrPrice[1] * 12 / 100;
        } else {
            if (quantity1 >= 10) {
                arrPrice[1] = arrPrice[1] - arrPrice[1] * 5 / 100;
            } else {
                if (quantity1 >= 5) {
                    arrPrice[1] = arrPrice[1] - arrPrice[1] * 2 / 100;
                }
            }
        }
        arrEksPrice[1] = arrPrice[1] * quantity1;
        if (quantity2 >= 20) {
            arrPrice[2] = arrPrice[2] - arrPrice[2] * 12 / 100;
        } else {
            if (quantity2 >= 10) {
                arrPrice[2] = arrPrice[2] - arrPrice[2] * 5 / 100;
            } else {
                if (quantity2 >= 5) {
                    arrPrice[2] = arrPrice[2] - arrPrice[2] * 2 / 100;
                }
            }
        }
        arrEksPrice[2] = arrPrice[2] * quantity2;
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
