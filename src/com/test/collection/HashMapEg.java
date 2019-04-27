package com.test.collection;

import java.util.HashMap;

public class HashMapEg {

	public static void main(String[] args) {
		HashMap<Data, String> values = new HashMap<>();
		values.put(null, "Test");
		values.put(new Data(1),"Val1");
		values.put(new Data(2),"Val2");
		values.put(new Data(1),"Val11");
		values.put(new Data(7),"Val7");
		values.put(new Data(20),"Val7");
		values.put(new Data(21),null);
		System.out.println(values);
		@SuppressWarnings("unchecked")
		HashMap<Data, String> copyValues = (HashMap<Data, String>)values.clone();
		System.out.println(copyValues.values());
		copyValues.put(new Data(20), "Val20");
		System.out.println(values);
		System.out.println(copyValues.remove(new Data(1), "Val1"));
		values.merge(new Data(21), "abc",String::concat);
		System.out.println(values);
		values.clear();
		System.out.println(values);
		
		//replace all
		copyValues.replaceAll((k,v) -> v+" copy" );
		System.out.println(copyValues);
		
	}
}

class Data{
	int num;
	String value;
	
	Data(int val){
		this.num=val;
	}
	public int hashCode() {
		return num*49;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Data) {
			Data d = (Data)o;
			return this.num == d.num;
		}
		return false;
	}
}
