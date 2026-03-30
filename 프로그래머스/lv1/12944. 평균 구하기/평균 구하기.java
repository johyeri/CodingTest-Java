import java.util.*;

class Solution {
    public double solution(int[] arr) {
        int sum = 0;
            
        for (int num : arr) {
            sum += num;
        }
        
        double answer = (double)sum / arr.length;
        return answer;
        // return Arrays.stream(arr).average().getAsDouble();
    }
}