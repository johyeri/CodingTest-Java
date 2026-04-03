/**
 * 접근: DFS(백트래킹)로 만들 수 있는 모든 숫자를 생성하고, 소수인 경우 Set에 저장한다.
 * 시간복잡도: 숫자 개수를 n이라고 할 때, 모든 순열 조합을 생성하므로 대략 O(n! * √m)
 *
 * 풀이 메모:
 * - 처음에는 DFS 구조를 잡았지만, 재귀 호출 시 인자를 빠뜨렸고 방문 처리도 시작점에서 누락됨
 * - current가 빈 문자열일 때 parseInt를 호출하면 예외가 발생하므로 먼저 빈 문자열 여부를 확인해야 함
 * - 중복 숫자가 나올 수 있으므로 Set으로 관리
 * - 소수 판별은 2부터 num-1까지가 아니라 √num까지만 검사하도록 최적화 가능
 */

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