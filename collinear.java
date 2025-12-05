//Collinearity of Three Points
//Problem Statement:
//Given 3 points check whether they lie on the same line.If they lie on the same line print 'yes' Otherwise print 'no'.

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a1=sc.nextInt();
        int b1=sc.nextInt();
        int a2=sc.nextInt();
        int b2=sc.nextInt();
        int a3=sc.nextInt();
        int b3=sc.nextInt();
        int collinear=a1*(b2-b3)+a2*(b3-b1)+a3*(b1-b2);
        if(collinear==0){
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
    }
}