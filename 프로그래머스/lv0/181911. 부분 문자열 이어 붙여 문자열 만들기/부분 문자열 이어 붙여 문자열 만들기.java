import java.util.*;

class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder answer = new StringBuilder();
        
        for (int i=0; i < my_strings.length; i++) {
            String myString = my_strings[i];
            int startNum = parts[i][0];
            int lastNum = parts[i][1];
            String str = myString.substring(startNum, lastNum + 1);
            answer.append(str);
        }
        
        return answer.toString();
    }
}