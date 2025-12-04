//Descending Elements Below N
//Problem Statement 
//Given a number N and an array of N elements, print all elements lesser than N in descending order. If no element found print -1.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> result = new ArrayList<>();
        for (int num : arr) {
            if (num < N) {
                result.add(num);
            }
        }

        if (result.isEmpty()) {
            System.out.println("-1");
            return;
        }
        result.sort(Collections.reverseOrder());
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i != result.size() - 1) System.out.print(" ");
        }
    }
}