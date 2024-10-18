package org.learn;

import java.util.*;

public class HashMapKeyAnalyzerImpl implements KeyAnalyzer{

   HashMap<String, KeyWord> keyWithCountMap;
    Queue<KeyWord> queue;

    public HashMapKeyAnalyzerImpl(){
//        keyWithCountMap = new HashMap<>();
        keyWithCountMap = new LinkedHashMap<>();
        queue = new PriorityQueue<>((a, b) -> b.getCount() - a.getCount());
        ;
    }



    @Override
    public void store(String key) {
        if(keyWithCountMap.containsKey(key)){
            // queue will also have the data
            KeyWord KeyWord = keyWithCountMap.get(key);
           // queue.remove(KeyWord);
            KeyWord newKeyWord = new KeyWord(key, keyWithCountMap.get(key).getCount()+1);
            keyWithCountMap.put(key, newKeyWord);
            //queue.add(newKeyWord);
        }else{
            KeyWord KeyWord = new KeyWord(key, 1);
            keyWithCountMap.put(key,KeyWord);
           // queue.add(KeyWord);
        }
    }
    
    @Override
    public List<String> fetchKeys() {
        queue.addAll(keyWithCountMap.values());
        System.out.println(queue);
        
        return null; // write how can keys be returned
    }

    @Override
    public Map<String, Integer> fetchKeysWithCount() {
        Map<String, Integer> returnMap = new HashMap<>();
        for(Map.Entry<String, KeyWord> entry: keyWithCountMap.entrySet()){
            returnMap.put(entry.getKey(), entry.getValue().getCount());
        }
        return returnMap;
    }


}