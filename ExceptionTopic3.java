package com.exceptions;

public class ExceptionTopic3 {
	public static void findSquare(int num) throws InterruptedException {
		Thread.sleep(3000);
		int sq = 0;
		if(num>0) {
			sq = num*num;
			System.out.println(sq);
		}
		else {
			try {
			throw new ArithmeticException("The given number is negative");
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		findSquare(-5);
		System.out.println("Remaining codes");
	}

}
