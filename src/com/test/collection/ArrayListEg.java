package com.test.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class ArrayListEg {

	public static void main(String[] args) {
		ArrayList<Integer> lst = new ArrayList<Integer>();
		lst.add(1);
		lst.add(10);
		lst.add(10);
		lst.add(13);
		lst.add(2);
		lst.add(7);
		lst.trimToSize();
		//Normal iterator
		Iterator<Integer> iter = lst.iterator();
		iter.forEachRemaining(System.out::println);
		
		//List iterator
		ListIterator<Integer> lstIter = lst.listIterator();
		while (lstIter.hasNext()) {
            System.out.print(lstIter.next() + " ");
        }
		System.out.println();
		while (lstIter.hasPrevious()) {
            System.out.print(lstIter.previous() + " ");
        }
		
		System.out.println();

		Collections.sort(lst, Collections.reverseOrder());
		System.out.println(lst);
		
		lst = (ArrayList<Integer>) lst.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(lst);
		
		
		
	}
}
