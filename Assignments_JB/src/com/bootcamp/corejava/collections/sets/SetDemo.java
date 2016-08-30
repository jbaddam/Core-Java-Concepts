package com.bootcamp.corejava.collections.sets;


import java.util.HashSet;
import java.util.Set;

/**
 * @author Jagan Reddy
 *
 */
public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a set called mySet
		Set mySet = new HashSet();

		// Ensure that this set contains an interesting selection of fruit
		String fruit1 = "pear", fruit2 = "banana", fruit3 = "tangerine", fruit4 = "strawberry", fruit5 = "blackberry";
		mySet.add(fruit1);
		mySet.add(fruit2);
		mySet.add(fruit3);
		mySet.add(fruit2);
		mySet.add(fruit4);
		mySet.add(fruit5);

		System.out.println("mySet now contains:" +mySet);
		System.out.println("\nnumber of elements in set : " + mySet.size());
		mySet.remove(fruit4);
		mySet.remove(fruit5);
		System.out.println("\nmySet now contains: " + mySet);
		mySet.clear();
		System.out.println("\nMy set cleared");
		System.out.println("\nMy set is empty : " + mySet.isEmpty()  );
	}
}
