//Anagram Count for kabali
//Problem Statement:
//Given a number N and an array of N strings, find the number of strings that are an anagram of 'kabali'.If there exists no anagram for the given string print '0'.

import java.util.*;
public class Main {
    public static String sortString(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        String target = "kabali";
        String sortedTarget = sortString(target);  
        for (int i = 0; i < N; i++) {
            String s = sc.next();
            if (s.length() == target.length()) {  
                if (sortString(s).equals(sortedTarget)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}