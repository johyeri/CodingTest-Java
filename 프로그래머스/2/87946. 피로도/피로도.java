/**
 * 접근: DFS로 방문 가능한 던전을 하나씩 선택하면서 최대 방문 개수를 구한다.
 * 시간복잡도: O(n!)
 *
 * 풀이 메모:
 * - 각 던전을 한 번씩만 방문할 수 있으므로 visited 배열로 방문 여부를 관리
 * - 현재 피로도로 입장 가능한 던전만 선택해서 다음 DFS로 진행
 * - count는 전역변수가 아니라 파라미터로 전달해서 각 탐색 경로의 상태를 독립적으로 유지
 * - 탐색이 끝나면 visited를 false로 되돌려 다른 경우의 수를 탐색
 */

import java.util.*;

class Solution {
    int result = 0;
    
    public void dfs(int k, boolean[] visited, int count, int[][] dungeons) {
        result = Math.max(result, count);
        
        for (int j = 0; j < dungeons.length; j++) {
            int a = dungeons[j][0];
            int b = dungeons[j][1];
            
            if (!visited[j] && k >= a) {
                visited[j] = true;
                dfs(k - b, visited, count + 1, dungeons);
                visited[j] = false;
            }
        }
    }
    
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        dfs(k, visited, 0, dungeons);
        
        return result;
    }
}