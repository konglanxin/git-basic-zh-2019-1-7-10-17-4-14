package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        Map<String,Integer> result = new HashMap<>();
        for(int i = 0; i < collection1.size(); i++){
            if(!result.containsKey(collection1.get(i))){
                result.put(collection1.get(i),1);
            }else{
                for(Map.Entry<String,Integer> entry : result.entrySet()){
                    if(collection1.get(i) == entry.getKey()){
                        int value = entry.getValue() + 1;
                        result.put(collection1.get(i),value);
                    }
                }
            }
        }
        return result;
    }
}
