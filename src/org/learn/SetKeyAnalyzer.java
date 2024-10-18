package org.learn;

import java.util.*;

public class SetKeyAnalyzer implements KeyAnalyzer{
    Set<String> keys;
    SetKeyAnalyzer(){
    // keys=new HashSet<>();
       // keys=new LinkedHashSet<>();
        keys=new TreeSet<>();
    }
    @Override
    public void store(String key) {
        keys.add(key);
    }

    @Override
    public List<String> fetchKeys() {
        return List.copyOf(keys);
    }
}
