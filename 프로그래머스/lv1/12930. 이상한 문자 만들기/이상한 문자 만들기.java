import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        
        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                sb.append(ch);
                idx = 0;
            } else if (idx % 2 == 0) {
                // char은 기본형이라서 메서드를 가질 수 없음. 정적 메서드를 사용해야 한다.
                // int와 Integer의 차이와 동일함
                sb.append(Character.toUpperCase(ch));
                idx++;
            } else {
                sb.append(Character.toLowerCase(ch));
                idx++;
            }
        }
        
        return sb.toString();
    }
}