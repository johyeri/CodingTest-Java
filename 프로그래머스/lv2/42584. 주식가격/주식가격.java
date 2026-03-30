import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int len = prices.length;
        int[] answer = new int[len];
        Deque<int[]> stack = new ArrayDeque<>();
        
        for(int i = 0; i < len; i++) {
            int price = prices[i];
            while(!stack.isEmpty() && stack.peek()[1] > price) {
                int[] prev = stack.pop();
                int prevIdx = prev[0];
                answer[prevIdx] = i - prevIdx;
            }
            stack.push(new int[] {i, price});
        }
        
        while(!stack.isEmpty()) {
            int[] prev = stack.pop();
            int prevIdx = prev[0];
            answer[prevIdx] = len - prevIdx - 1;
        }
        
        return answer;
    }
}