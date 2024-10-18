package org.learn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListKeyAnalyzerImpl implements KeyAnalyzer{
    List<String> keys;
    ListKeyAnalyzerImpl(){
      //  keys=new ArrayList<>();
        keys=new LinkedList<>();
    }

    @Override
    public void store(String key) {
        keys.add(key);
    }

    @Override
    public List<String> fetchKeys() {
       return keys;
    }
}
