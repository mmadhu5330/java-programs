//Case-Sensitive String Equality
//Problem Statement 
//Given 2 strings S1 and s2, check whether they are case senitively equal without using any predefined function(case sensitive).If they are not same print 'no'

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S1 = sc.next();
        String S2 = sc.next();
        if (S1.length() != S2.length()) {
            System.out.println("no");
            return;
        }
        boolean same = true;

        for (int i = 0; i < S1.length(); i++) {
            if (S1.charAt(i) != S2.charAt(i)) {
                same = false;
                break;
            }
        }
        if (same) System.out.println("yes");
        else System.out.println("no");
    }
}
