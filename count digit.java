import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       int count=0;
       int temp=num;
       if(num==0){
           count=1;
       }
       else{
           if(num<0){
               temp=-num;
           }
           while(temp>0){
               temp/=10;
               count++;
           }
       }
       System.out.print(count);
    }
}