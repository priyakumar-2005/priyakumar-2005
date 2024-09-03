package practice.com;

import java.util.Scanner;

public class amstrongornot {
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		int n,rem,sum=0,i;
		n=sc.nextInt();
		int count=0;
		int originial=n;
		while(n>0) {
			n/=10;
			count++;
		}
		n=originial;
		while(n>0)
		{
			rem=n%10;
			sum+=(int)Math.pow(rem, count);
			n=n/10;}
			System.out.print(count);
		
		
		if(sum==originial) {
			System.out.println(" is amstrong number");
			
		}
		else {
			System.out.println("is not amstrong number");
		}
	}

}
