package com.deepu.workouts;

import java.util.Iterator;

class MyCollection implements Iterable<String> {
    private String[] elements = {"A", "B", "C"};

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < elements.length;
            }

            @Override
            public String next() {
                return elements[index++];
            }
        };
    }
}

public class IterableForStringArray {
    public static void main(String[] args) {
        MyCollection myCollection = new MyCollection();
        
        for (String element : myCollection) {
            System.out.println(element);
        }
    }
}




