//Write a program to traverse (or iterate ) Arraylist
package com.practiseQuestion;

import java.util.ArrayList;

public class ArrayListTraverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Grapes");
        arrayList.add("papaya");
        arrayList.add("Guava");
        arrayList.add("Apple");

        // Traverse the ArrayList using a for-each loop
        System.out.println("Elements in the ArrayList:");
        for (String element : arrayList) {
            System.out.println(element);
        }
    }

	}


