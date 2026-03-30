import java.util.*;

class Solution {
    boolean solution(String s) {
        int pCnt = 0;
        int yCnt = 0;
        
        for (char chr : s.toCharArray()) {
            if (Character.toUpperCase(chr) == 'P') {
                pCnt++;  
            } else if (Character.toUpperCase(chr) == 'Y') {
                yCnt++;
            }
        }
        
        return pCnt == yCnt ? true : false;
    }
}