//Find Different Number in Series
//Problem Statement 
//Given an array of N elements which follows either even number or odd number series.There may exists at maximum 1 even number in the odd series or 1 odd number in the even series.Find the different number if exists otherwise print '-1'?

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int evenCount = 0, oddCount = 0;
        int evenValue = -1, oddValue = -1;
        for (int x : arr) {
            if (x % 2 == 0) {
                evenCount++;
                evenValue = x;
            } else {
                oddCount++;
                oddValue = x;
            }
        }
        if (evenCount == 1) {
            System.out.println(evenValue);
        }
        else if (oddCount == 1) {
            System.out.println(oddValue);
        }
        else {
            System.out.println("-1");
        }
    }
}