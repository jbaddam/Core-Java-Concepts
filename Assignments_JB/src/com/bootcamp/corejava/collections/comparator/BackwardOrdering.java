package com.bootcamp.corejava.collections.comparator;

import java.util.Comparator;

/**
 * @author Jagan Reddy
 *
 */
public class BackwardOrdering implements Comparator {

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 * user defined sorting logic to arrange the numbers in descending order
	 */
	@Override
	public int compare(Object obj1, Object obj2) {

		Integer integerObject1 = (Integer) obj1;
		Integer integerObject2 = (Integer) obj2;

		if (integerObject1 == integerObject2) {
			return 0;
		} else if (integerObject1 < integerObject2) {
			return 1;
		} else {
			return -1;
		}
	}

}
