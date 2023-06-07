package com.ipt;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(50);
		list.add(30);
		list.add(100);
		System.out.println(list);
		int size = list.size();
		System.out.println("Size of the list is: "+size);
		Integer integer = list.get(1);
		System.out.println("value in the index 1: "+integer);
		list.set(2, 200);
		System.out.println("List after replacing the in the index 2:"+list);
		list.remove(0);
		System.out.println("List after removing the value from index 0:"+list);
		int indexOf = list.indexOf(200);
		System.out.println("Index of the value 200 :"+indexOf);
		boolean contains =list.contains(200);
		System.out.println("Check list contains 200 opr or not: "+contains);
		list.clear();
		System.out.println("List after clear method: "+list);
		boolean empty=list.isEmpty();
		System.out.println("Check for empty or not: "+empty);
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(50);
		list2.add(30);
		list2.add(100);
		boolean equals =list.equals(list2);
		System.out.println("Check two list are equal or not: "+equals);
	}

}
