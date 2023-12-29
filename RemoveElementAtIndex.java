//write a program to remove element from specified index of arraylist
package com.practiseQuestion;

//write a program to remove element from specified index of arraylist
import java.util.ArrayList;

public class RemoveElementAtIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        arrayList.add("Pink");
        arrayList.add("Blue");
        arrayList.add("Red");
        arrayList.add("Brown");
        arrayList.add("Green");
        arrayList.add("Coral");
        arrayList.add("Yellow");

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + arrayList);

        // Index of the element to be removed
        int indexToRemove = 2;

        // Check if the index is valid before removing
        if (indexToRemove >= 0 && indexToRemove < arrayList.size()) {
            // Remove the element at the specified index
            arrayList.remove(indexToRemove);
            System.out.println("Element at index " + indexToRemove + " removed.");
        } else {
            System.out.println("Invalid index. No element removed.");
        }

        // Print the modified ArrayList
        System.out.println("ArrayList after removal: " + arrayList);
    }

	}


