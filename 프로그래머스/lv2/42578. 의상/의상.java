import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        
        // 1. 종류별 개수 카운팅
        for (String[] str : clothes) {
            map.put(str[1], map.getOrDefault(str[1], 0) + 1);
        }
        
        int result = 1;
        
        for (int i : map.values()) {
            result = result * (i+1);
        }
        
        return result - 1;
    }
}