//Roman Numeral to Integer Conversion
//Problem Statement 
//Given a roman numeral N, convert it into integer.Take L=50, C=100.If it is not a valid roman numeral print '-1'

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine().trim();
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int total = 0;
        int n = N.length();
        boolean valid = true;
        for (int i = 0; i < n; i++) {
            char c = N.charAt(i);
            if (!romanMap.containsKey(c)) {
                valid = false;
                break;
            }
        }
        if (!valid) {
            System.out.println("-1");
            return;
        }
        for (int i = 0; i < n; i++) {
            int current = romanMap.get(N.charAt(i));
            int next = (i + 1 < n) ? romanMap.get(N.charAt(i + 1)) : 0;
            if (current < next) {
                total -= current;
            } else {
                total += current;
            }
        }
        System.out.println(total);
    }
}