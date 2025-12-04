// Sorted Elements Less Than K
//Problem Statement 
//Given 2 numbers N,K followed by N elements print all the elements lesser than K in sorted order.If the elements could not be found print -1

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (num < K) {
                result.add(num);
            }
        }
        if (result.isEmpty()) {
            System.out.println("-1");
        } else {
            Collections.sort(result);
            for (int i = 0; i < result.size(); i++) {
                System.out.print(result.get(i));
                if (i != result.size() - 1) System.out.print(" ");
            }
        }
    }
}
