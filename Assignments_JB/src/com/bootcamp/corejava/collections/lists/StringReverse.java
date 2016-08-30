package com.bootcamp.corejava.collections.lists;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Jagan Reddy
 * this class has a functionality reverse the strings in the given list
 */
public class StringReverse {

	/**
	 * @param list
	 * @return
	 * This method returns the list of strings after reversed
	 */
	public List<String> reverseString(List<String> list) {

		for (String str : list) {

			StringBuilder s = new StringBuilder(str);
			list.set(list.indexOf(str), s.reverse().toString());
			list.remove(str);
		}

		return list;
	}

	
	
	public static void main(String[] args) {

		StringReverse rvr = new StringReverse();

		List<String> inputList = new ArrayList<String>();
		inputList.add("how");
		inputList.add("are");
		inputList.add("you");

		List<String> resultList = rvr.reverseString(inputList);

		System.out.println(resultList);
	}

}
