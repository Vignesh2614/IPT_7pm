package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatedProgram {

	public static void main(String[] args) {
//		Write a program to print all the words and their count in the given string
//	Steps:
//		=======
//		1.Assign the values to a String reference
// 		2.Use split function to split the complete string into individual words
//		3.Create a HashMap to store all the words
//		4.Use for each to iterate all the words from the array and store in map
//		5.Using containskey, check for presence of key in the Map
//		6.if it is already present, increment the value by 1
//		7.else-if it is not present first time value-assign value by 1
//		8.use entrySet() method to convert the map into entrySet
//		9.using for each and if condition to check the values greater than 1 using
//		getValue() method
//		10.Print the respective keys and values as per the matching by using if condition
		
		String s1="this is java class and java with selenium is taken today is";
		
		//java=2
		//is=3
		
		String[] words = s1.split(" ");
		
		Map<String,Integer> map = new HashMap<String, Integer>();
		for(String w:words)
		{
			if(map.containsKey(w))
					{
				Integer integer = map.get(w);
				map.put(w, integer+1);
					}
			else {
				map.put(w, 1);
			}
		}
		System.out.println("===Print all the words with their Occurences===");
		System.out.println(map);
		
		System.out.println("===Remove the duplicates and print only unique words===");
		System.out.println(map.keySet());
		
		System.out.println("===Repeated words in the Given String===");
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		
		for (Entry<String,Integer> entry:entrySet) {
			if(entry.getValue()>1) {
				String key = entry.getKey();
//				Integer value = entry.getValue();
				System.out.println(key);
			}
		}
	}

}
