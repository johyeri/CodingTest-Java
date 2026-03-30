import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int[] result = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int target = commands[i][2];
            
            // 1.자르기
            int[] arr = Arrays.copyOfRange(array, start - 1, end);
            
            // 2.순서
            Arrays.sort(arr);
            
            // 3.뽑아서 넣기
            result[i] = (arr[target-1]);
        }
        
        return result;
    }
}