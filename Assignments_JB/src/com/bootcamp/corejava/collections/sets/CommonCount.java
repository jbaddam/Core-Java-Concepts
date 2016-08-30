package com.bootcamp.corejava.collections.sets;

import java.util.HashSet;

/**
 * @author Jagan Reddy
 * This class has functionality to count the number common numbers in the two list
 */
public class CommonCount {

	
	/**
	 * @param setOne
	 * @param setTow
	 * @return
	 * This method will return count the number common numbers in the two list
	 */
	public int countCommon(HashSet<Integer> setOne, HashSet<Integer> setTow) {

		int count = 0;

		for (int i : setOne) {
			for (int j : setTow) {
				if (i == j) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {

		HashSet<Integer> inputSet1 = new HashSet<Integer>();

		inputSet1.add(3);
		inputSet1.add(7);
		inputSet1.add(3);
		inputSet1.add(-1);
		inputSet1.add(2);
		inputSet1.add(3);
		inputSet1.add(7);
		inputSet1.add(2);
		inputSet1.add(15);
		inputSet1.add(15);

		HashSet<Integer> inputSet2 = new HashSet<Integer>();

		inputSet2.add(-5);
		inputSet2.add(15);
		inputSet2.add(2);
		inputSet2.add(-1);
		inputSet2.add(7);
		inputSet2.add(15);
		inputSet2.add(36);

		CommonCount count = new CommonCount();
		int result = count.countCommon(inputSet1, inputSet2);
		System.out.println("Number of comman elements in the two sets : " + result);
	}
}
