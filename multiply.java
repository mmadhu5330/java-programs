import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mul;
        for(int i=1;i<=15;i++){
            mul=n*i;
            System.out.println(n + "x" + i + "=" + mul);
        }
    }
}