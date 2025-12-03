//Product of Digits
//Problem Statement:
//Given a number N, print the product of the digits.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long N=sc.nextLong();
        long product=1;
        while(N>0){
            long digit=N%10;
            product*=digit;
            N/=10;
        }
        System.out.println(product);
    }
}