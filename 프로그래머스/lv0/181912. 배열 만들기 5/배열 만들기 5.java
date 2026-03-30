import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (String str : intStrs) {
            String idx = str.substring(s,s+l);
            int value = Integer.parseInt(idx);
            if (value > k) {
                arr.add(value);
            }
        }
        
        int[] answer = new int[arr.size()];
        
        for (int i = 0; i < arr.size() ; i++) {
            answer[i] = arr.get(i);
        }
        
        return answer;
    }
}