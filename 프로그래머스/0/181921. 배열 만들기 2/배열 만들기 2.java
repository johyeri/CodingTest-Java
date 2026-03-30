import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=l; i<=r; i++) {
            String strNum = Integer.toString(i);
            boolean isVaild = true;
            
            for(int j=0; j<strNum.length(); j++) {
                char chNum = strNum.charAt(j);
                if (chNum != '0' && chNum != '5') {
                    isVaild = false;
                    break;
                }
            }
            
            if (isVaild) {
                list.add(i);
            }
            
        }
        
        if (list.isEmpty()) {
            return new int[] {-1};
        }
        
        int[] answer = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        
        return answer;
    }
}