package com.bootcamp.corejava.collections.lists;


import java.util.Arrays;
import java.util.List;

/**
 * @author Jagan Reddy
 * This class has a functionality swap the odd , even positions in the given list
 */
public class OddEvenSwapList {

	/**
	 * @param list
	 * @return the list after the odd , even positions are swapped in the given list
	 */
	public static List<String> swapOddAndEvenList(List<String> list) {

		String temp;

		for (int i = 0; i < list.size(); i += 2) {

			if (i != list.size() - 1) {
				temp = list.get(i);
				list.set(i, list.get(i + 1));
				list.set(i + 1, temp);
			}
		}

		return list;
	}

	public static void main(String[] args) {

		List<String> list = Arrays.asList("how", "are", "you?", "I", "am", "doing", "fine");

		System.out.println(swapOddAndEvenList(list));
		

	}

}
