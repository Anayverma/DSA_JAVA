import java.util.*;
class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        NavigableMap<Integer, Integer> map = new TreeMap<>();
        
        for (int[] item: items) {
            if (map.containsKey(item[0])) {
                map.put(item[0], Math.max(item[1], map.get(item[0])));
            } else {
                map.put(item[0], item[1]);
            }
        }
        
        int maxSoFar = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            maxSoFar = Math.max(maxSoFar, entry.getValue());
            entry.setValue(maxSoFar);
        }   
            
        for (int i = 0; i < queries.length; ++ i) {
            Map.Entry<Integer, Integer> entry = map.floorEntry(queries[i]);
            if (entry == null) {
                queries[i] = 0;
            } else {
                queries[i] = entry.getValue();
            }
        }
        
        return queries;
    }
}