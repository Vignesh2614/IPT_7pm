package com.ipt;

public class StarPatterns {
	int i,j,k;
	public void pattern1() {
		System.out.println("===Pattern 1===");
		for (i=1;i<=5;i++) {
			
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void pattern5() {
		System.out.println("===Pattern 5===");
		for(i=1;i<=5;i++) {
			for(j=5;j>i;j--) {
			System.out.print(" ");
		}
			for(k=1;k<=(i*2-1);k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void pattern2() {
		System.out.println("===Pattern 2===");
		for(i=1;i<=5;i++) {
			for(j=5;j>i;j--) {
				System.out.print(" ");
			}
			for (k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}		
	}
	public void pattern3() {
		System.out.println("===Pattern 3===");
		for(i=1;i<=6;i++) {
			for(j=6;j>i;j--) {
			System.out.print("*");
		}
			for(k=1;k<=(i*2-1);k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	public void pattern6() {
		System.out.println("===Pattern 6===");
		for(i=5;i>=1;i--) {
			// Print star in decreasing order
			for(k=1;k<=i*2-1;k++) {
				System.out.print("*");
			}
			System.out.println();
			  // Print space in increasing order 
			for(j=5;j>=i;j--) {
				System.out.print(" ");
			}
		}
	}
	public void pattern7() {
		System.out.println("===Pattern 7===");
		for(i=1;i<=5;i++) {
			for(j=5;j>i;j--) {
			System.out.print(" ");
		}
			for(k=1;k<=(i*2-1);k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=4;i>=1;i--) {
			  // Print space in increasing order 
			for(j=4;j>=i;j--) {
				System.out.print(" ");
			}
			// Print star in decreasing order
			for(k=1;k<=i*2-1;k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
	
public static void main(String[] args) {
	StarPatterns obj = new StarPatterns();
	obj.pattern1();
	obj.pattern5();
	obj.pattern2();
	obj.pattern3();
	obj.pattern6();
	obj.pattern7();
	
}
}
