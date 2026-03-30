import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int result = n;
        
        while(result >= 1) {
            list.add(result);
            
            if (result == 1) {
                break;
            } else if (result % 2 == 0) {
                result = result / 2;
            } else if (result % 2 != 0) {
                result = 3 * result + 1;
            }
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}