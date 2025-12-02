//Given a floating point number with 1 decimal place round it off to nearest greater integer and print it.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       double num=sc.nextDouble();
       int round=(int) Math.ceil(num);
       System.out.println(round);
    }
}