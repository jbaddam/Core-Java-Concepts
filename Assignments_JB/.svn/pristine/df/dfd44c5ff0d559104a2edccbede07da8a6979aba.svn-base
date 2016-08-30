package com.bootcamp.corejava.collections.lists;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Jagan Reddy
 * this class has functionalities to print the list in 
 * insertion order
 * reverse order 
 */
public class ListOfFruites {

	/**
	 * @param fruiteList
	 * this method will print the given list in insertion order
	 */
	public static void printInsertionOrder(List<String> fruiteList) {

		for (String fruite : fruiteList) {
			System.out.println(fruite);
		}
	}

	/**
	 * @param fruiteList
	 * this method will print the given list in reverse order
	 */
	public static void printReverseOrder(List<String> fruiteList) {

		ListIterator<String> itr = fruiteList.listIterator(fruiteList.size());

		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}

	}

	/**
	 * @param fruiteList
	 * @param elementToBeInsert
	 * @param beforeElement
	 * @param afterElement
	 * @return the list after inserting the desiring value in between two values
	 */
	public static List<String> insertInBetween(List<String> fruiteList, String elementToBeInsert,
			String beforeElement, String afterElement) {

		int index = fruiteList.indexOf(beforeElement);

		for (String str : fruiteList) {

			if (fruiteList.get(index + 1).equals(afterElement)) {

				fruiteList.add(index + 1, elementToBeInsert);
				break;
			}

		}
		return fruiteList;

	}

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("pear");
		list.add("banana");
		list.add("tangerine");
		list.add("strawberry");
		list.add("blackberry");

		System.out.println("Insertion order");
		printInsertionOrder(list);

		System.out.println("\n\nReverse order\n");
		printReverseOrder(list);

		System.out.println("\n\nsecond banana added; elements are:");
		List<String> inputlist = insertInBetween(list, "banana", "tangerine", "strawberry");

		System.out.println(inputlist);

	}
}
