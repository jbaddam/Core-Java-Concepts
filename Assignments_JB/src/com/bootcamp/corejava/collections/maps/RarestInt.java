package com.bootcamp.corejava.collections.maps;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Jagan Reddy
 * this class has a functionality return the rarest element in the given map
 */
public class RarestInt {
	
/**
 * @param map
 * @return
 * this method will take map as input and
 * return the integer which is appeared less times than remaining integers
 */
public static int rarest(Map<String, Integer> map){
		
		int rarest = 0;
		int result = 0;
		
		Set<Integer> set = new HashSet<Integer>();
		Map<Integer, Integer> newMap =  new HashMap<Integer, Integer>();

		for(Entry<String, Integer> mapEntry:map.entrySet()){
			
			set.add(mapEntry.getValue());
		}
			
		
		for(Integer str: set){
			int count=0;
			for(Entry<String, Integer> mapEntry:map.entrySet()){
				if(mapEntry.getValue().equals(str)){
					count ++;
					newMap.put(mapEntry.getValue(), count);
				}
			}
		}
		
		for(Entry<Integer, Integer> mapEntry:newMap.entrySet()){
			if(rarest == 0){
				rarest = mapEntry.getValue();
				result = mapEntry.getKey();
			}
			if(mapEntry.getValue() < rarest){
				rarest = mapEntry.getValue();
				result = mapEntry.getKey();
			}
			else if(mapEntry.getValue() == rarest){
				if(mapEntry.getKey() < result)
					result = mapEntry.getKey();
			}
				
		}
		
		return result;
	}

public static void main(String[] args) {
	Map<String, Integer> map = new HashMap<String, Integer>();
	
	map.put("Alyss", 22);
	map.put("Char", 25);
	map.put("Dan", 25);
	map.put("Jeff", 20);
	map.put("Kasey", 20);
	map.put("Kim", 20);
	map.put("Morgan", 25);
	map.put("Ryan", 25);
	map.put("Stef", 22);
	
	int rerestElement = rarest(map);
	
	System.out.println("Rarest number in the map is : "+rerestElement);
}

}
