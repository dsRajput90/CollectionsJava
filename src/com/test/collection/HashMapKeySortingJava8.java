package com.test.collection;

import static java.util.Map.Entry.comparingByKey;
import static java.util.stream.Collectors.toMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapKeySortingJava8 {

	public static void main(String[] args) {
		HashMap<String, String> maps = new HashMap<>();
		maps.put("Darshanas", "A0");
		maps.put("Darshana", "A1");
		maps.put("Pooja", "A2");
		maps.put("Sidhi", "A3");
		maps.put("Divya", "A4");
		System.out.println(maps);
		
		Map<String, String> sorted = maps.entrySet().stream().
				sorted(Collections.reverseOrder(comparingByKey())).
				collect(toMap(Map.Entry::getKey, Map.Entry::getValue, 
						(e1,e2) -> e2, LinkedHashMap::new));

		System.out.println(sorted);
	}
}
