package com.ipt;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to check Armstrong:");
		int num = scan.nextInt();
		int temp=num;
		int arm=0, rem=0;
		while(num!=0) {
			rem=num%10;
			arm=arm+rem*rem*rem;
			num=num/10;			
		}
		if (arm==temp) {
			System.out.println("Hi Armstrong");
		}
		else {
			System.out.println("I am not armstrong");
		}
		scan.close();
	}

}
