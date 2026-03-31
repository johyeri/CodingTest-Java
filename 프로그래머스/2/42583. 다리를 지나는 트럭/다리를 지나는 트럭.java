/**
 * 접근: 다리를 고정 길이 큐로 두고, 1초마다 한 칸씩 이동시키는 시뮬레이션으로 해결
 * 시간복잡도: O(n + bridge_length)
 *
 * 풀이 메모:
 * - 처음에는 트럭 기준 for문으로 돌리려고 했는데, 이 문제는 "트럭 처리"가 아니라 "시간 흐름" 기준으로 상태가 변해서 반복문 기준을 잡기 어려웠음
 * - 다리 위 상태를 어떻게 표현해야 할지도 고민했는데, 트럭만 넣는 큐가 아니라 "길이가 고정된 다리 칸" 자체를 큐로 보고 빈칸은 0으로 채우는 방식으로 정리함
 * - 초기에 현재 다리 무게 비교를 weight >= weightNow 로만 보려고 했는데, 실제로는 "현재 다리 무게 + 다음 트럭 무게 <= 제한 무게"를 비교해야 한다는 점을 놓쳤음
 * - 최종적으로는 bridge_length 크기의 큐를 0으로 초기화하고, 매 초마다 맨 앞을 빼면서 weightNow를 갱신한 뒤
 *   다음 트럭을 올릴 수 있으면 올리고, 못 올리면 0을 넣는 방식으로 구현함
 * - 모든 트럭을 다 올린 뒤에도 마지막 트럭이 다리에서 완전히 빠져나갈 시간이 필요해서,
 *   남아 있는 다리 무게(weightNow)가 0이 될 때까지 추가로 시간을 진행시킴
 */

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
        
        time += bridge_length;
        
        return time;
    }
}