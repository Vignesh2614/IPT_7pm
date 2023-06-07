package com.ipt;

public class StringLogic {
	public void stringReverse1() {
		String s1="java";
		String rev="";
		for (int i=s1.length()-1;i>=0;i--) {
			rev=rev+s1.charAt(i);
		}
		System.out.println("Reversed String:"+rev);		
	}

public void stringReverse4() {
	String str="Hi Hello";
	StringBuilder sb = new StringBuilder(str);
	System.out.println("Reversed String By Inbuilt Function:"+sb.reverse());
}
public void stringReverse2() {
	String s1="hello world";
	String rev="";
	for(int i=s1.length()-1;i>=0;i--) {
		rev=rev+s1.charAt(i);
	}
	System.out.println("Reversed:"+rev);
}
public void stringReverse3() {
	int i=0,j=0;
	char c, e;
	String sb="hello world";
	String rev="";
	for(i=sb.length()-1;i>=0;i--) {
		rev=rev+sb.charAt(i);
	}
	char[] charArray1= rev.toCharArray();
	char[] charArray2=rev.toCharArray();
	for(char d:charArray1) {
		System.out.println(d);
	}
//	for(int k=0;k<=10;k++) {
	for( i=0;i<5;i++) {
		 charArray2[i]=charArray1[i];
		 System.out.println("CharArray2:"+charArray2[i]);
		 }
//	for(j=10;j>6;j--) {
//		e =charArray2[i];
//		}
	String string1=new String();
	String string2=new String();
//	}
//	rev.replace("dlrow", "olleh");
	System.out.println("Reversed: "+rev);
		
}
public void charToString() {
	//character array  
	char[] ch = {'w', 'e', 'l', 'c', 'o', 'm', 'e', ' ' , 't', 'o', ' ', 'J', 'a', 'v', 'a', 't', 'p', 'o', 'i', 'n', 't'};  
	//constructor of the String class that parses char array as a parameter  
	String string = new String(ch);  
	//prints the string  
	System.out.println(string);  
}
public static void main(String[] args) {
	StringLogic logic = new StringLogic();
	logic.stringReverse1();
//	logic.charToString();
}
}
