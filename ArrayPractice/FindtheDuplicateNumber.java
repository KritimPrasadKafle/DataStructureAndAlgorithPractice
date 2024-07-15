package ArrayPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindtheDuplicateNumber {
    public int findDuplicate(int[] arr) {

        //First Approach
//         for(int i = 0; i<arr.length; i++){
//             for(int j = i+1; j<arr.length; j++){
//                 if(arr[i] == arr[j]){
//                     return arr[i];
//                 }
//             }
//
//         }
//         return -1;
        //Second Approach

//         Map<Integer, Integer> map = new HashMap<>();
//         for(int i = 0; i<arr.length; i++){
//             map.put(arr[i],map.getOrDefault(arr[i],0) + 1);
//
//             }
//             for(Map.Entry<Integer,Integer> entry : map.entrySet()){
//                 if(entry.getValue() > 1){
//                     return entry.getKey();
//                 }
//             }
//
//         return -1;

        //Third Approach

        Set<Integer> set = new HashSet<>();
        for(Integer value : arr){
            if(set.contains(value)){
                return value;
            }
            set.add(value);
        }
        return -1;

    }

}
