package org.learn;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface KeyAnalyzer {
    void store(String key);
    List<String> fetchKeys();
default Map<String,Integer> fetchKeysWithCount(){
    return null;
}
}
