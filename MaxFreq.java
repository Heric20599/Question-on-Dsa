package HASHMAP;

import java.util.HashMap;

public class MaxFreq {
    public static void main(String[] args) {
        int [] arr={1,2,3,21,1,21,2,1,2,1221,3};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int el:arr){
            if(!map.containsKey(el)){
                map.put(el,1);
            }else{
                map.put(el, map.get(el) + 1);
            }
        }
        int max=0;
        int keyval=-1;
        for(var el:map.keySet()) {
            if (max > el.intValue()) {
                max = el.intValue();
                keyval = el;
            }
        }
        System.out.println(keyval);
    }

}
