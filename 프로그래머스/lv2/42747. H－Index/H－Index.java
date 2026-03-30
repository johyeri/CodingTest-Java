import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int n = citations.length;
        
        //배열 정렬
        Arrays.sort(citations);
        
        //i번째 위치에서 
        for (int i=0; i < n; i++) {
            int target = citations[i];
            if (target >= n-i) {
                answer += 1;
            }
        }
        
        return answer;
    }
}