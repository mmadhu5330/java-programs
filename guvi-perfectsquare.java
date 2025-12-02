//Perfect Square Product
//Problem Statement:
//Given 2 numbers N,M. Print 'yes' if their product is a perfect square else print 'no'.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int Product=N*M;
        int root=(int)Math.sqrt(Product);
        if(root*root==Product){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}