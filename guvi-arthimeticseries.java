//Arithmetic Series Sum
//Problem Statement:
//Given 3 numbers A,B,C find the sum of Arithmetic Series with a=A, d=B and n=C

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        int arser=(C*(2*A+(C-1)*B))/2;
        System.out.println(arser);
    }
}