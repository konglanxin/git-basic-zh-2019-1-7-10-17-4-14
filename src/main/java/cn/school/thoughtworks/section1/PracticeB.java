package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        List<String> result = new ArrayList<>();
        for(int i = 0; i < collection1.size(); i++){
            for(int j = 0; j < collection2.size(); j++){
                for(int z = 0; z < collection2.get(j).size(); z++){
                    if(collection1.get(i) == collection2.get(j).get(z)){
                        result.add(collection1.get(i));
                    }
                }
            }
        }
        return result;
    }
}
