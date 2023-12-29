//Given an element write a program to check if element (value) exists in Array list
package com.practiseQuestion;

import java.util.ArrayList;

public class ArrayListExist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an ArrayList
        ArrayList<String> List = new ArrayList<>();

        // Add elements to the ArrayList
        List.add("Cookies");
        List.add("Shampoo");
        List.add("Kurkure");
        List.add("Chips");
        List.add("DiaryMilk");

        // Element to check
        String elementToCheck = "Chips";

        // Check if the element exists in the ArrayList
        boolean exists = List.contains(elementToCheck);

        // Print the result
        if (exists) {
            System.out.println(elementToCheck + " exists in the ArrayList.");
        } else {
            System.out.println(elementToCheck + " does not exist in the ArrayList.");
        }
    }


	}


