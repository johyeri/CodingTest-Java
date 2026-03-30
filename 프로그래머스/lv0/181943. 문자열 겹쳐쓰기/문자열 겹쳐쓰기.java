class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        String before = my_string.substring(0,s);
        String after = my_string.substring(s + overwrite_string.length());
        
        answer = before + overwrite_string + after;
        
        
        return answer;
    }
}