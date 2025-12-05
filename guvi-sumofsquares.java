//Sum of Squares of Digits
//Problem Statement:
//Given a number N, print the sum of the squares of its digits.

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();  
        long sum = 0;  
        for (int i = 0; i < n.length(); i++) {
            int digit = n.charAt(i) - '0'; 
            sum += digit * digit;          
        }

        System.out.println(sum);
    }
}