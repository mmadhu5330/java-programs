//Counting Digits of a Number
//Problem Statement 
//Count the number of digits of a given number N.Size of the integer ranges from 1<N<100000000

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();  
        int count = String.valueOf(N).length();
        System.out.println(count);
    }
}