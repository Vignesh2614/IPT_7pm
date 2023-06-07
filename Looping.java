package com.ipt;

public class Looping {

	public void nestedLoop() {
		int i,j;
		System.out.println("====NestedForLoop====");
		for (i=1;i<=5;i++) {
			for (j=1;j<=5;j++) {
				
				System.out.println(i+" "+j);
				
				
			}
		}
	}
	public static void main(String[] args) {
		Looping obj = new Looping();
		obj.nestedLoop();
		

	}

}
