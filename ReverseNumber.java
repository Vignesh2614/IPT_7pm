package com.ipt;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void palindrome(int number) {
		int temp=number;
		int rem=0;
		int rev=0;
		while(number!=0) {
			rem = number%10;
			rev = rev*10+rem;
			number = number/10;
		}		
		if(temp==rev) {
			System.out.println("It is palindrome");
			System.out.println();
		}
		else {
			System.out.println("It is not palindrome");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Reverse Program");
		int rev =0;
		int rem=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Type the number to be reversed:");		
		int number = scan.nextInt();
		palindrome(number);
		while(number!=0) {
		rem = number%10;
		rev = rev*10+rem;
		number = number/10;
	}
System.out.println("The reversed number:"+rev);
}
}

