package com.bootcamp.corejava.collections.maps;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Jagan Reddy
 * This class has functionality to count the number of persons for each city.
 */
public class CityCount {

	/**
	 * @param map
	 * @return
	 * This method takes map as input and counts the
	 * number of person in each city.
	 *and stores the cities and count in a new map and returns that new map
	 */
	public static Map<String, Integer> cityCount(Map<String, String> map) {

		Set<String> set = new HashSet<String>();
		Map<String, Integer> newMap = new HashMap<String, Integer>();

		for (Map.Entry<String, String> mapEntry : map.entrySet()){
			
			set.add(mapEntry.getValue());
		}

		for (String str : set) {
			
			int count = 0;
			
			for (Map.Entry<String, String> mapEntry : map.entrySet()) {
				
				if (mapEntry.getValue().equals(str)) {
					count++;
					newMap.put(mapEntry.getValue(), count);
				}
			}
		}

		return newMap;
	}

	public static void main(String[] args) {

		Map<String, String> address = new HashMap<>();

		address.put("John", "Dallas");
		address.put("Babbar", "NewYork City");
		address.put("Akbar", "Houston");
		address.put("Rizwan", "Dallas");
		address.put("Jorge", "Paris");
		address.put("Roshan", "Dallas");
		address.put("Sujit", "Houston");

		Map<String, Integer> resultMap = cityCount(address);

		for (String str : resultMap.keySet()) {
			System.out.println(str + " --- " + resultMap.get(str));
		}

	}

}
