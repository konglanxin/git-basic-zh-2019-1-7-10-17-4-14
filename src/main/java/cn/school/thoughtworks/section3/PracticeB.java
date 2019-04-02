package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        Map<String,Integer> result = collectionA;
        for(Map.Entry<String,Integer> entry : collectionA.entrySet()){
            for(Map.Entry<String,List<String>> entry1 : object.entrySet()){
                List<String> item = entry1.getValue();
                for(int i = 0; i < item.size(); i++){
                    if(entry.getKey() == item.get(i)){
                        int value = entry.getValue() - entry.getValue() / 3;
                        result.put(entry.getKey(),value);
                    }
                }
            }
        }

        return result;
    }
}
