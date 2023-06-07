package com.ipt;

public class StringReverseOdd {
	
	public void stringReverse() {
		String s1="vignesh";
		String rev="";
		char ch;
		int j,b = 0;
		for (int i=s1.length()-1;i>=0;i--) {
			int a = i%2;
			if(a!=0) {
			rev=rev+s1.charAt(i);
			}
		}
		System.out.println("Given String:"+s1);
		System.out.println("Reversed String:"+rev);
		char[] arr=s1.toCharArray();
		char[] rev1=rev.toCharArray();
		for(int i=0; i<=s1.length()-1;i++) {
			int a = i%2;
			if(a!=0) {
				for(j=0;j<=rev.length()-1;)
				{
					j=b;
				ch=rev1[j];
				System.out.print(ch);
				break;
				}
				b++;
				}
		else {
			ch=arr[i];
			System.out.print(ch);
			}
		}
	}
	public static void main(String[] args) {
		StringReverseOdd odd = new StringReverseOdd();
		odd.stringReverse();
	}
	}