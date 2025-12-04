//Rotated Array Rotation Count
//Problem Statement 
//Given an value 'M' follwed by array of M elements in which the elements would have been rotated for certain 'N' times from the intial array representation where all elements are arranged in ascending order.Print the 'N' or print -1 if there is no rotation made or cannot be determined.Note: 1<=N<=length of the given array.

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int[] arr = new int[M];
        for (int i = 0; i < M; i++) {
            arr[i] = sc.nextInt();
        }
        int minIndex = 0;
        int minVal = arr[0];
        for (int i = 1; i < M; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
                minIndex = i;
            }
        }
        if (minIndex == 0)
            System.out.println("-1");
        else
            System.out.println(minIndex);
    }
}