//Sum of First K Natural Numbers
//Problem Statement 
//Write a program to print the sum of the first K natural numbers.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int K=sc.nextInt();
        int natural=(K*(K+1))/2;
        System.out.println(natural);
    }
}