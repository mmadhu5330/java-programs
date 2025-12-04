//Max of Consecutive Pairs
//Problem Statement 
//Given a number N followed by N elements for every 2 consecutive numbers print the maximum of the 2.

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < N - 1; i++) {
            int maxVal = Math.max(arr[i], arr[i + 1]);
            System.out.print(maxVal);
            if (i != N - 2)
                System.out.print(" ");
        }
    }
}