package cn.school.thoughtworks.section1;

import java.util.*;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        List<String> result = new ArrayList<>();
        for(int i = 0; i < collection1.size(); i++){
            for(String key:collection2.keySet()){
                List<String> value = collection2.get(key);
                for(int j = 0; j < value.size(); j++){
                    if(collection1.get(i) == value.get(j)){
                        result.add(collection1.get(i));
                    }
                }
            }
        }
        return result;
    }
}
