class Solution {
    public String solution(String my_string, int[][] queries) {
        String[] arr = my_string.split("");
        
        for (int[] idx : queries) {
            int start = idx[0];
            int end = idx[1];
            
            while (start < end) {
                String temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                
                start++;
                end--;
            }
        }
        
        return String.join("", arr);
    }
}