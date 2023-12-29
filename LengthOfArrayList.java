//Write a program to find the lengt of the ArrayList
package com.practiseQuestion;

import java.util.ArrayList;

public class LengthOfArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        arrayList.add("Burger");
        arrayList.add("Pizza");
        arrayList.add("Cold Drink");
        arrayList.add("Coffee");
        arrayList.add("Choclate");
        arrayList.add("Ice Cream");

        // Find the length (size) of the ArrayList
        int length = arrayList.size();

        // Print the length of the ArrayList
        System.out.println("Length of the ArrayList: " + length);
    }


	}


