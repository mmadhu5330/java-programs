//Count String Occurrences
//Problem Statement 
//Given a sentence and string S, find how many times S occurs in the given sentence.If S is not found in the sentence print -1

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String sentence=sc.nextLine();
      String s=sc.next();
      int count=0;
       int lenSentence = sentence.length();
       int lenS = s.length();
       for (int i = 0; i <= lenSentence - lenS; i++) {
            boolean match = true;

            for (int j = 0; j < lenS; j++) {
                if (sentence.charAt(i + j) != s.charAt(j)) {
                    match = false;
                    break;
                }
            }
             if (match) {
                count++;
            }
        }

        if (count == 0)
            System.out.println(-1);
        else
            System.out.println(count);
    }
}