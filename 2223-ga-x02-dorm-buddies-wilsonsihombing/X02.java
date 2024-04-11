// 12S22011 - Wilson Eksaudi Sihombing
// 12S22031 - Ioka Eirel Purba
import java.util.*;
import java.lang.Math;

public class X02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] buddy = new String[4];
        int i;
        
        i = 0;
        inisialisasi(buddy, i);
        func_input(i, buddy);
        roombuddies(i, buddy);
    }
    
    public static void inisialisasi(String[] buddy, int i) {
        for (i = 0; i <= 3; i++) {
            buddy[i] = "";
        }
    }
    
    public static void func_input(int i, String[] buddy) {
        while (i < 4) {
            buddy[i] = input.nextLine();
            if (!buddy[i].equals("---")) {
                i = i + 1;
            } else {
                i = 4;
            }
        }
    }
    
    public static void roombuddies(int i, String[] buddy) {
        while (i < 4) {
            if (!buddy[i].equals("---")) {
                System.out.println(buddy[i]);
                i = i + 1;
            } else {
                i = 4;
            }
        }
    }
}
