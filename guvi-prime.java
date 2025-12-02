//Problem Statement:
//Given a number N, check whether it is prime or not. Print 'yes' if it is prime else print 'no'.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      int N=input.nextInt();
      boolean isPrime=true;
      if(N<=1){
         isPrime=false;
      }
      else{
          for(int i=2;i*i<=N;i++){
              if(N%i==0){
                  isPrime=false;
                  break;
              }
          }
      }
      if(isPrime){
          System.out.println("yes");
      }
      else{
          System.out.println("no");
      }
    }
}