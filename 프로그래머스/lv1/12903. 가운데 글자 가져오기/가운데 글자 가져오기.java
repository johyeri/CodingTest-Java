class Solution {
    public String solution(String s) {
        String answer = "";
        
        if (s.length() % 2 == 0) {
            int startNum = s.length() / 2 - 1;
            answer = s.substring(startNum, startNum + 2);
        } else {
            int startNum = s.length() / 2;
            answer = s.substring(startNum, startNum+1);
        }
        
        
        return answer;
    }
}