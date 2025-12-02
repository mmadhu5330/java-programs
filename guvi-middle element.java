//String Middle Element Modification
//Given a string S, print it after changing the middle element to * (if the length of the string is even, change the 2 middle elements to *)

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();
        char[] c=S.toCharArray();
        int n=c.length;
        if(n%2==0){
             c[n/2 - 1] = '*';
            c[n/2] = '*';
        } else {
            c[n/2] = '*';
        }

        System.out.println(new String(c));
        }
}
