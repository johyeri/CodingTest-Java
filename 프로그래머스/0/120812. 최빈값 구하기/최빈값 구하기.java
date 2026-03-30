import java.util.*;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : array) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        int maxCount = 0;
        int maxValue = -1;
        boolean duplicated = false;
        
        for (int key : map.keySet()) {
            int cnt = map.get(key);
            
            if (cnt > maxCount) {
                maxCount = cnt;
                maxValue = key;
                duplicated = false;
            } else if (cnt == maxCount) {
                duplicated = true;
            }
        }
        return duplicated ? -1 : maxValue;
    }
}