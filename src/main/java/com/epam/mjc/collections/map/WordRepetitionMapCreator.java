package com.epam.mjc.collections.map;


import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
    	Map<String, Integer> resultMap = new HashMap<>();
    	if(sentence.isEmpty()) {
    		return resultMap;
    	}
    	String[] sentenceArray = sentence.trim().replaceAll("[\\W&&[^\\s]]+", "").split("\\s+");
    	for (int i = 0; i < sentenceArray.length; i++) {
    		int counter = 0;
			if (!resultMap.containsKey(sentenceArray[i].toLowerCase())) {
				counter++;
				resultMap.put(sentenceArray[i].toLowerCase(), counter);
			} else {
				int value = resultMap.get(sentenceArray[i].toLowerCase());
				value++;
				resultMap.put(sentenceArray[i].toLowerCase(), value);
			}
		}
    	return resultMap;
    }
}
