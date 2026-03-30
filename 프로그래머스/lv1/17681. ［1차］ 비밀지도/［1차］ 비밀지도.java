class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        
        String[] answer = new String[n];
        
        for (int i=0; i<n; i++) {        
            int combined = arr1[i] | arr2[i];
            String binary = Integer.toBinaryString(combined);
            
            while (binary.length() < n) {
                binary = "0" + binary;
            }
            
            answer[i] = binary.replace("1", "#").replace("0", " ");
        }
        
        return answer;
    }
}