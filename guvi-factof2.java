// Factorial of a Number-2
//Problem Statement 
//Given a number N, find the factorial of N.

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long fact = 1;
        for (int i = 1; i <= N; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
