class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String single = "";
        String multi = "";
        
        for (int i=0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                multi += num_list[i];
            } else {
                single += num_list[i];
            }
        }
        
        answer = Integer.parseInt(single) + Integer.parseInt(multi);
        
        return answer;
    }
}