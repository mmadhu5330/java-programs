//Find Minimum Among Ten Numbers
//Problem Statement:
//Find the minimum among 10 numbers.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int min=Integer.MAX_VALUE;
       for(int i=0;i<10;i++){
           int N=sc.nextInt();
           if(N<min){
               min=N;
           }
           
       }
       System.out.println(min);
    }
}