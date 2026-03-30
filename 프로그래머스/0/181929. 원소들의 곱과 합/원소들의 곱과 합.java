class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int plus = 0;
        int multiple = 1;
        
        for (int i = 0; i < num_list.length; i++) {
            plus += num_list[i];
            multiple *= num_list[i];
        }
        
        answer = Math.pow(plus, 2) > multiple ? 1 : 0;
        
        return answer;
    }
}