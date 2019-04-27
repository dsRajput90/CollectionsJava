package com.test.collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayListRemoveDuplicate {

	public static void main(String[] args) {
		List<String> lists = new ArrayList<String>();
		lists.add("Darshana");
		lists.add("Rohan");
		lists.add("Mayur");
		lists.add("Rohan");
		System.out.println(lists);
		
		Set<String> sets = new LinkedHashSet<>(lists);
		
		lists.clear();
		lists.addAll(sets);
		System.out.println(lists);
	}
}
