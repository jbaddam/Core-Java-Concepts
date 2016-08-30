package com.bootcamp.corejava.collections.lists;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jagan Reddy 
 * This class has functionality to double the given list
 */
public class DoubleList {

	/**
	 * @param list
	 * @return newList This method takes list as input and make that as double
	 *  and return another list
	 */
	public List<String> doubleList(List<String> list) {

		List<String> newList = new ArrayList<String>();

		for (String str : list) {
			newList.add(str);
			newList.add(str);
		}

		return newList;
	}

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("How");
		list.add("Are");
		list.add("You ?");

		List<String> doubleList = new DoubleList().doubleList(list);
		System.out.println(doubleList);

	}
}
