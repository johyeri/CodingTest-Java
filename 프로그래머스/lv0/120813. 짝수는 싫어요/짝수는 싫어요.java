class Solution {
    public int[] solution(int n) {
        int count = (n + 1) / 2;
        
        int[] answer = new int[count];
        
        for (int i=0; i<count; i++) {
            answer[i] = i * 2 + 1;
        }
        
        return answer;
    }
}