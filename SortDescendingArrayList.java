//Write a program to sort array list in descending order
package com.practiseQuestion;

import java.util.ArrayList;
import java.util.Collections;

public class SortDescendingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an ArrayList
        ArrayList<Integer> List = new ArrayList<>();

        // Add elements to the ArrayList
        List.add(67);
        List.add(23);
        List.add(81);
        List.add(10);
        List.add(70);
        List.add(40);
        List.add(90);

        // Sort the ArrayList in descending order
        Collections.sort(List, Collections.reverseOrder());

        // Print the sorted ArrayList
        System.out.println("Sorted ArrayList in descending order: " + List);
    }

	}


