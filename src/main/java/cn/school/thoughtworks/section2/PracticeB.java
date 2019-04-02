package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String,Integer> result = new HashMap<>();
        for(int i = 0; i < collection1.size(); i++){
            String key = collection1.get(i);
            int value = 1;

            if(collection1.get(i).contains("-")){
                key = collection1.get(i).split("-")[0];
                value = Integer.parseInt(collection1.get(i).split("-")[1]);
            }

            if(!result.containsKey(key)){
                result.put(key,value);
            }else{
                for(Map.Entry<String,Integer> entry : result.entrySet()){
                    if(key.equals(entry.getKey())) {
                        int value_final = entry.getValue() + value;
                        result.put(key, value_final);
                    }
                }
            }

        }

        return result;
    }
}
