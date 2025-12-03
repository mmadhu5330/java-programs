//Almost Sorted Array
//Problem Statement:
//Given a number N followed by N elements which can be arranged in ascending order with maximum one element update. Print the index of the element which has to be changed else print '-1' if the updation not neccassary or if the given input needs more than one update to form ascending order.

import java.util.Scanner;
public class Main {
    public static int findUpdateIndex(int[] arr) {
        int n = arr.length;
        int count = 0;
        int index = -1;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                count++;
                index = i; 
                if (count > 1) {
                    return -1; 
                }
            }
        }

        if (count == 0) {
            return -1; 
        }
        int original = arr[index];
        arr[index] = (index == 0) ? arr[index + 1] - 1 : arr[index - 1] + 1;
        boolean sorted = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }

        if (sorted) {
            return index; 
        } else {
            return -1; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(findUpdateIndex(arr));
        }

        sc.close();
    }
}
