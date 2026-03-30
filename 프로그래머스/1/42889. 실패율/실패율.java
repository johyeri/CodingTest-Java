import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        HashMap<Integer, Double> map = new HashMap<>();
        
        for (int thisStage = 1; thisStage <= N; thisStage++) {  
            int num = 0;
            int den = 0;
            
            for (int i : stages) {
                if (i >= thisStage) den++;
                if (i == thisStage) num++;
            }
                
            Double rate = (den == 0) ? 0.0 : (double) num / den;
            map.put(thisStage, rate);
        }
        
        //map을 정렬한다.
        List<Map.Entry<Integer, Double>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> {
            int cmp = Double.compare(b.getValue(), a.getValue());
            if (cmp != 0) return cmp;
            return Integer.compare(a.getKey(), b.getKey());
        });
        
        int[] answer = new int[N];
        for (int i=0; i<N; i++) {
            answer[i] = list.get(i).getKey();
        }
        
        return answer;
    }
}