package com.capgemini.lab7.exercise1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortHashmap {
	Map<String, Integer> map = new HashMap<String, Integer>();
	
	public void createmap()
	{
		map.put("Apple", 65000);  
		map.put("HP", 20000);  
		map.put("Dell", 32000);  
		map.put("Asus", 21478);  
		map.put("Samsung", 36546);  
		map.put("Lenovo", 19990);  
		//System.out.println("Before sorting: ");  
		//printMap(map); 
		
	}
	public void sorthashmap()
	{
	
		Collection<Integer> values = map.values();
		List<Integer> listOfValues = new ArrayList<Integer>(values);
		Collections.sort(listOfValues);
		for (Integer value : listOfValues) 
        { 
            System.out.println(value); 
        } 
         
		
	          
	      }
		
	}
	


