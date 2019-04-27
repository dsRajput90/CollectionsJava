package com.test.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSublist {

	public static void main(String[] args) {
		ArrayList<String> lists = new ArrayList<>();
		lists.add("C++");
		lists.add("Scala");
		lists.add("Java");
		lists.add("Python");
		lists.add("Ruby");

		lists.trimToSize();
		System.out.println(lists);
		List<String> sublist = lists.subList(1, 4);
		System.out.println(sublist);
		sublist.remove(0);
		System.out.println(lists);
		
		
	}
}
