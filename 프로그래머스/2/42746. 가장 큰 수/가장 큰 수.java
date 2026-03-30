import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] arr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = numbers[i] + "";
        }
        
        Arrays.sort(arr, (a,b) -> {
            return (b + a).compareTo(a + b);
        });
        
        if (arr[0].equals("0")) return "0";
        
        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str);
        }
        
        return sb.toString();
    }
}