//Problem Statement:
//Given 2 numbers N and M add both the numbers and check whether the sum is odd or even.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N=input.nextInt();
        int M=input.nextInt();
        int sum=N+M;
        if(sum%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}