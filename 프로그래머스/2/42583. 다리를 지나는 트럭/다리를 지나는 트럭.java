import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        //큐를 모두 0으로 선언
        for (int i = 0; i < bridge_length; i++) {
            bridge.offer(0);
        }
        
        int idx = 0;
        int time = 0;
        int weightNow = 0;
        
        // 반복문 돌리기
        while (truck_weights.length > idx) {
            time++;
            weightNow -= bridge.poll();
            
            if (weight >= weightNow + truck_weights[idx]) {
                bridge.offer(truck_weights[idx]);
                weightNow += truck_weights[idx];
                idx++;
            } else {
                bridge.offer(0);
            }
        }
        
        while (weightNow != 0) {
            time++;
            weightNow -= bridge.poll();
        }
        
        return time;
    }
}