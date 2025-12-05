//Minimum Difference in Array
//Problem Statement 
//Given an array, find the absolute minimum difference between any two elements in the array.

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
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < N; i++) {
            int diff = arr[i] - arr[i - 1];
            if (diff < minDiff) minDiff = diff;
        }

        System.out.println(minDiff);
    }
}