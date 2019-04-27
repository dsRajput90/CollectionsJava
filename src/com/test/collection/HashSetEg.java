package com.test.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;
import java.util.stream.Collectors;

public class HashSetEg {

	public static void main(String[] args) {
		/**
		 * Default Initial Capacity of HashSet Object : 16
		 * Initial Load Factor of HashSet Object : 0.75
		 * */
		HashSet<String> hashSets = new HashSet<>();
		hashSets.add("Darshana");
		hashSets.add("Raj");
		hashSets.add("Amit");
		System.out.println(hashSets);
		//No duplicates allowed
		hashSets.add("Darshana");
		System.out.println(hashSets);
		
		//cloning
		Set<String> copySet = (HashSet<String>) hashSets.clone();
		System.out.println(copySet);
		hashSets.add("New entry");
		copySet.add("Copy entry");
		hashSets.remove("Raj");
		copySet.add(null);
		System.out.println("Updated HashSet :: " + hashSets);
		System.out.println("Updated CopySet :: " + copySet);
		System.out.println(hashSets.contains("Copy entry"));
		System.out.println(copySet.contains(null));
		copySet.clear();
		System.out.println(hashSets.isEmpty());
		
		//stream
		copySet = hashSets.stream().filter(s -> s.startsWith("D")).collect(Collectors.toSet());
		
		//split iterator for parallelism
		Spliterator<String> split = copySet.spliterator();
		split.forEachRemaining(System.out::println);
		
		//removeif
		System.out.println(hashSets);
		hashSets.removeIf(s -> s.startsWith("D"));
		System.out.println(hashSets);
		
		
		//Fail fast iterator hashset
		Iterator<String> iter = hashSets.iterator();
		while(iter.hasNext()) {
			iter.remove();
			System.out.println(iter.next());
		}
		
	}
}
