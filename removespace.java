//Remove Extra Spaces
//Problem Statement:
//Given a sentence S take out the extra spaces.If no extra space is present print the same as output.

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        boolean spaceFound = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                sb.append(ch);
                spaceFound = false;
            } else {
                if (!spaceFound) {   
                    sb.append(' ');
                    spaceFound = true;
                }
            }
        }
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ' ') {
            sb.deleteCharAt(sb.length() - 1);
        }

        System.out.print(sb.toString());
    }
}
