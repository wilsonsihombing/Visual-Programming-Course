
import java.util.*;
import java.lang.Math;

import java.util.*;
import java.lang.Math;

public class T06 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int i;
        boolean palindrome;
        String huruf;
        
        huruf = input.nextLine();
        palindrome = true;
        i = 0;
        while (i <= (double) huruf.length() / 2 - 1) {
            if (!String.valueOf(huruf.charAt(i)).equals(String.valueOf(huruf.charAt(huruf.length() - i - 1)))) {
                palindrome = false;
            }
            i = i + 1;
        }
        if (palindrome == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    
    public static void bacakata(int n, String[] huruf) {
        int i;
        
        for (i = 0; i <= n - 1; i++) {
            huruf[i] = input.nextLine();
        }
    }
}
