//Second Smallest Element
//Problem Statement 
//Given a number N followed by N elements, find the second smallest element.If it cannot be found then print -1

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N < 2) {
            System.out.println(-1);
            return;
        }
        long first = Long.MAX_VALUE;
        long second = Long.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            long x = sc.nextLong();
            if (x < first) {
                second = first;
                first = x;
            } else if (x > first && x < second) {
                second = x;
            }
        }
        if (second == Long.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(second);
        }
    }
}
