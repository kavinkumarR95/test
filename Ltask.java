package org.collection;

import java.util.ArrayList;
import java.util.List;

public class Ltask {
	public static void main(String[] args) {
		
		List k = new ArrayList();
		
		k.add(10);
		k.add(20);
		k.add(30);
		k.add("ram");
		k.add(30);
		k.add('d');
		k.add(true);
		
		System.out.println(k);
		
		// to find the size of list
		int size = k.size();
		System.out.println(size);
		
		// to get the value for particular index
		Object get = k.get(3);
		System.out.println(get);
		
		// to add the value in particular index
		k.add(2, "kavin");
		System.out.println(k);
		
		// to remove the value in particular index
		Object remove = k.remove(5);
		System.out.println(remove);
		System.out.println(k);
		
		// to replace the value in particular index
		Object set = k.set(3,"kumar");
		System.out.println(k);
		
		k.add(6, "ram");
		System.out.println(k);
		
		// to fine the index position(first position)
		int indexOf = k.indexOf("ram");
		System.out.println(indexOf);
		
		// to fine the index position(last position)
		int lastIndexOf = k.lastIndexOf("ram");
		System.out.println(lastIndexOf);
		
		// to check whether the value present or not 
		boolean contains = k.contains("kavin");
		System.out.println(contains);
		
		System.out.println(k);
		
		for (int i = 0; i <k.size() ; i++) {
			Object object = k.get(i);
			System.out.println(object);		
				
			}
		
		System.out.println("==================");
		
		for (Object object1 : k) {
			
			System.out.println(object1);	
		}
		
		List<String> a = new ArrayList<String>();
		
		a.add("ravi");
		a.add("20");
		a.add("50");
		
		System.out.println(a);
		
		// to add new list to old list
	     k.addAll(a);
		 System.out.println(k);
		 
		// to remove the common value
		 k.removeAll(a);
		 System.out.println(k);
		 
		// to retain the common value
		 k.retainAll(a);
		System.out.println(k);
		
				
	}

}
