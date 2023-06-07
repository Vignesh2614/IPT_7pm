package com.ipt;

public class ArrayLogic {
	public void arrayLogic1() {
		int arr[]= {5,6,7,8,10,11,12,13,14};
		for (int a:arr) {
			System.out.println(a);
		}
		System.out.println("=============");
		for (int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
			if(arr[i]%2==0) {
				System.out.println("This is even number");
			}
			else {System.out.println("This is odd number");
		}
		}
		for (int i=0;i<arr.length;i++) {
			if(i%2==0) {
				System.out.println("Even index value of array is:"+arr[i]);
			}
			else {System.out.println("Odd index value of array is:"+arr[i]);
		}
	}
		
	}
	public void arrayLogic2(){
		int arr[]= {2,4,5,1,12,10,14,8,50,20,11,3};
		System.out.println("Before Sorting:");
		for(int a:arr) {
		System.out.println(a);}
		for (int i=0;i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {				
				if (arr[i]>arr[j]) {
					int c=arr[j];
					arr[j]=arr[i];//c=b;-->b=a;-->a=c; Swapping
					arr[i]=c;										
				}				
			}
		}
		System.out.println("After sorting:");
		for(int a:arr) {
			System.out.println(a);
		}
		int secondLargest=arr[arr.length-2];
		int thridLargest=arr[arr.length-3];
		System.out.println("Second Largest Array value:"+secondLargest);
		System.out.println("Third Largest Array Value:"+thridLargest);
		
	}
	public void arrayLogic3(){
		int arr[]= {2,4,5,1,12,10,14,8,50,20,11,3};
		System.out.println("Before Sorting:");
		for(int a:arr) {
		System.out.println(a);}
		for (int i=0;i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {				
				if (arr[i]<arr[j]) {
					int c=arr[j];
					arr[j]=arr[i];//c=b;-->b=a;-->a=c; Swapping
					arr[i]=c;										
				}				
			}
		}
		System.out.println("Desending Order:");
		for(int a:arr) {
			System.out.println(a);
		}
		int secondLargest=arr[arr.length-11];
		int thridLargest=arr[arr.length-10];
		System.out.println("Second Largest Array value:"+secondLargest);
		System.out.println("Third Largest Array Value:"+thridLargest);
	}
	public void arrayLogic4() {
		int arr[]= {10,15,17,20};
		int brr[]= {10,15,17,20};
		int a=arr.length;
		int b=brr.length;
		int c=0;
		if(a==b) {
			for(int i=0;i<a;i++) {
				if(arr[i]==brr[i]) {
					c++;
			}			
		}
	}
		if(c==a) { System.out.println("Both arrays are equal");}
		else {System.out.println("Both arrays are not equal");}
	}	
	public void arrayLogic5() {
		int arr[]= {1,2,5,4,3,7,8,10};
//		int target =7;
		int a[]=new int[5];
		//Output={4,3},{2,5}
		System.out.println("The number which matches with the target"
				+ " are:");
		for (int i=0;i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if (arr[i]+arr[j]==7) {
					a[i]=arr[i];
					a[i+1]=arr[j];
					System.out.println("{"+a[i]+","+a[i+1]+"}");
				}
			}
		}
		
//		for (int b:a) {
//			System.out.println(b);
//		}
//		for (int i=1;i<a.length;i++) {
//			
//		}
	}	
	public static void main(String[] args) {
		ArrayLogic logic = new ArrayLogic();
		logic.arrayLogic5();//ascending		
}
}


