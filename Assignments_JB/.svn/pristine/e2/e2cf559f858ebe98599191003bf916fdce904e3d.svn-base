package com.bootcamp.corejava.collections.comparator;

import java.util.Comparator;

/**
 * @author Jagan Reddy
 *
 */
public class AlternatingOrdering implements Comparator {

	
	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 * user defined sorting logic to arrange the +ve numbers in ascending order and 
	 * -ve numbers in descending order 
	 */
	@Override
	public int compare(Object obj1, Object obj2) {

		Integer integerObj1 = (int) obj1;
		Integer integerObj2 = (int) obj2;

		if (integerObj1 > 0 && integerObj2 > 0) {
			if (integerObj1 == integerObj2)
				return 0;
			else if (integerObj1 > integerObj2)
				return 1;
			else
				return -1;

		} else if (integerObj1 < 0 && integerObj2 < 0) {

			if (integerObj1 == integerObj2)
				return 0;
			else if (integerObj1 < integerObj2)
				return 1;
			else
				return -1;
		} else {
			if (integerObj1 > 0)
				return 1;
			else
				return -1;
		}

	}

}
