package practice.com;

import java.util.Scanner;

public class leapyear {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int n;
	n=sc.nextInt();
	if(n%4==0) {
		System.out.print("leap");
	}
	else{
		System.out.print("not leap");
	}
	

}}
