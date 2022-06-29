package com.kody.collection;

import java.util.Hashtable;

/**
 * @objective 
 * @Developer Nikhar
 * @Date 24-Jun-2022
*/
public class HashTable {

	public static void main(String[] args) {
		Hashtable<Integer,String> ht=new Hashtable<Integer, String>();
		ht.put(101,"Nikhar");
		ht.put(102,"Raam");
		ht.put(103,"Panshul");
		
		System.out.println(ht);
		
		ht.remove(102);
		
		System.out.println("After Remove ");
		
		System.out.println(ht);
	}
}
