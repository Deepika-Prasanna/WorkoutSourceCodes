package com.deepu.workouts;

import java.util.Iterator;

class MyCollections<T> implements Iterable<T> {

	T[] items;
	public MyCollections(T[] items) {
		this.items = items;
	}
	
	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {

			int index =0;
			
			@Override
			public boolean hasNext() {
				return index < items.length;
			}

			@Override
			public T next() {
				return items[index++];
			}
		};
	}
	
}

public class IterableForIntegerArray {
	public static void main(String[] args) {
		Integer[] array = {1, 2 , 3};
		MyCollections<Integer> collections = new MyCollections<>(array);
		
		for(int item : collections) {
			System.out.println(item);
		}
	}
}
