package com.ipt;

public class StringMemory {

	public static void main(String[] args) {
		String s1="hello";
		String s2="hello";
		StringBuffer s3 = new StringBuffer("hello");
		String s4=s1.concat(" world");
		s3.append(" world");
		System.out.println(s1.concat(" world"));
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
//		String constant pool memory
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
	}

}
