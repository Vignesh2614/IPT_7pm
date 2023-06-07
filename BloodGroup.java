package com.ipt;

import java.util.Scanner;

public class BloodGroup {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the number:");
		int nextInt = scan.nextInt();
		if(nextInt>=1 && nextInt<=5) {
			System.out.println("Blood Group Type: A");
		}
		else if(nextInt>=6 && nextInt<=10) {
			System.out.println("Blood Group Type: B");
		}
		else if(nextInt>=11 && nextInt<=15) {
			System.out.println("Blood Group Type: AB");
		}
		else if(nextInt>=16 && nextInt<=20) {
			System.out.println("Blood Group Type: o-ve");
		}
		else {
			System.out.println("Blood Group Type: o+ve");
		}
			
	}

}
