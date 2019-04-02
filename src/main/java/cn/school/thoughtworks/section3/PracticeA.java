package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        Map<String,Integer> result = collectionA;
        for(Map.Entry<String,Integer> entry : collectionA.entrySet()){
            for(Map.Entry<String,List<String>> entry2 : object.entrySet()){
                List<String> item = entry2.getValue();
                for(int i = 0; i < item.size(); i++){
                    if(entry.getKey() == item.get(i)){
                        result.put(entry.getKey(),entry.getValue()-1);
                    }
                }
            }
        }

        return result;
    }
}
