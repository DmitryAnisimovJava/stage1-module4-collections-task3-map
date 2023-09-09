package com.epam.mjc.collections.map;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        for (Map.Entry<Integer, Integer> element : functionMap.entrySet()) {
			if (element.getValue() == requiredValue) {
				return true;
			}
		}
        return false;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
    	Map<Integer, Integer> functionMap = new TreeMap<>();
    	if (sourceList.isEmpty()) {
			return functionMap;
		}
    	for (Iterator<Integer> iterator = sourceList.iterator(); iterator.hasNext();) {
			int intSource = (int) iterator.next();
			int function = 5 * intSource + 2;
			functionMap.put(intSource, function);
		}
    	return functionMap;
    }
}
