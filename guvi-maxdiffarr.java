//Max Difference in Array
//Problem Statement 
//Given an array, find the maximum difference between any two elements.

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        if (N < 2) {
            System.out.println("0");
            return;
        }
        int minVal = arr[0];
        int maxVal = arr[0];
        for (int i = 1; i < N; i++) {
            if (arr[i] < minVal) minVal = arr[i];
            if (arr[i] > maxVal) maxVal = arr[i];
        }
        System.out.println(maxVal - minVal);
    }
}
