import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int x=0;
		int original=n;
		while(original!=0){
		    original/=10;
		    ++x;
		}
		original=n;
		while(original!=0){
		   int rem=original%10;
           sum+=Math.pow(rem,x);
           original/=10;
		}
		if(sum==n){
		    System.out.print("Armstrong number");
		}
		else{
		    System.out.print("Not Armstrong number");
		}
	}
}