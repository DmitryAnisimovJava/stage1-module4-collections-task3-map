package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
    	Map<String, Integer> resultMap = new HashMap<>();
    	for (Map.Entry<Integer, String> e : sourceMap.entrySet()) {
			int key = e.getKey();
			String value = e.getValue();
			if (!resultMap.containsKey(value)) {
				resultMap.put(value, key);
			} else {
				int checkValue = resultMap.get(value) < key ? 
						resultMap.get(value) : 
						key;
				resultMap.put(value, checkValue);
			}
		}
    	return resultMap;
    }
}
