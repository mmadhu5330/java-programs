//First Occurrence of Character
//Problem Statement 
//Given a string 'S' and a character 'K', find at what position the character 'K' occurs for the first time in 'S'.(Assume the index of string starts at 1).If the character is not found in 'S' then print -1

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNext()) { 
            System.out.println(-1);
            return;
        }
        String S = sc.next(); 
        if (!sc.hasNext()) {   
            System.out.println(-1);
            return;
        }
        char K = sc.next().charAt(0);
        int pos = -1;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == K) {
                pos = i + 1;  
                break;
            }
        }
        System.out.println(pos);
    }
}
