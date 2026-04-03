import java.util.*;

class Solution {
    Set<Integer> set = new HashSet<>();
    
    // 소수인지 판단하는 코드
    public boolean solve(int num) {
        // 2 미만인 경우 소수가 아님
        if (num < 2) return false;
        
        // 2부터 Num-1까지 나눠보기
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public void dfs(String current, boolean[] visited, String numbers) {
        if (!current.equals("")) {
            int currentNum = Integer.parseInt(current);
        
            if(solve(currentNum)) {
                set.add(currentNum);
            }
        }
        
        for (int i = 0; i < numbers.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(current + numbers.charAt(i), visited, numbers);
                visited[i] = false;
            }
        }
    }
    
    public int solution(String numbers) {
        boolean[] visited = new boolean[numbers.length()];
        dfs("", visited, numbers);
        
        return set.size();
    }
}