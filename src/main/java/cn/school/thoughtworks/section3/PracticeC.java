package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        Map<String,Integer> result = new HashMap<>();
        for(int i = 0; i < collectionA.size(); i++){
            if(!result.containsKey(collectionA.get(i))){
                result.put(collectionA.get(i),1);
            }else{
                for(Map.Entry<String,Integer> entry : result.entrySet()){
                    if(collectionA.get(i).equals(entry.getKey())){
                        int value = entry.getValue() + 1;
                        result.put(collectionA.get(i),value);
                    }
                }
            }
        }

        Map<String,Integer> final_result = result;

        for(Map.Entry<String,Integer> entry1 : result.entrySet()){
            for(Map.Entry<String,List<String>> entry2 : object.entrySet()){
                List<String> item = entry2.getValue();
                for(int i = 0; i < item.size(); i++){
                    if(entry1.getKey().equals(item.get(i))){
                        int final_value = entry1.getValue() - entry1.getValue() / 3;
                        final_result.put(entry1.getKey(),final_value);

                    }
                }

            }
        }

        return final_result;
    }
}
