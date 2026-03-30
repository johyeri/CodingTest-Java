import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        // 1. 큐에 (우선순위, 원래 위치) 넣기
        Queue<int[]> q = new LinkedList<>();
        for (int i=0; i<priorities.length; i++) {
            q.offer(new int[]{priorities[i], i});
        }
        
        // 2. 우선순위 배열 정렬
        Arrays.sort(priorities);
        
        // 3. 현재 큐 맨앞 문서의 priority와 정렬된 배열의 현재 최댓값 비교
        int index = priorities.length - 1;
        int count = 0;
        
        while(!q.isEmpty()) {
            int[] top = q.peek();
            
            // 4. 작으면 뒤로 보내고, 같으면 출력하기
            if (priorities[index] > top[0]) {
                q.offer(q.poll());
            } else {
                q.poll();
                count += 1;
                index -= 1;
                
                if (location == top[1]) {
                    return count;
                }
            }
        }
        
        return count;
    }
}