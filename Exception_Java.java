package com.exceptions;

public class Exception_Java {
	
	public int method(int m,int n) {
		int div = m/n;
		return div;
	}

	public static void main(String[] args) {
		Exception_Java ob = new Exception_Java();
		
		try {
			System.out.println(ob.method(45, 0));
		}finally {
			System.out.println("Finally");
		}
			System.out.println("Remaining Codes");
	}
	
}
