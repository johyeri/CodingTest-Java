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
                dfs(k-b, visited, count + 1, dungeons);
                visited[j] = false;
            }
        }
    }
    
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        int count = 0;
        
        for(int i = 0; i < dungeons.length; i++) {
            dfs(k, visited, count, dungeons);
            result = Math.max(result, count);
            count = 0;
        }
        
        return result;
    }
}