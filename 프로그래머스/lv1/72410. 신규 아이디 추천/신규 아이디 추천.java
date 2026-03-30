import java.util.*;

class Solution {
    public String solution(String new_id) {
        StringBuilder sb = new StringBuilder();
        String prev = "";
        
        for (char c : new_id.toCharArray()) {
            //1단계 new_id의 모든 대문자를 대응되는 소문자로 치환
            c = Character.toLowerCase(c);
            //2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
            if (!((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || 
                  c == '-' || c == '_' || c == '.')) {
                continue;
            }
            //3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
            if (c == '.' && prev.equals(".")) {
                continue;
            } else {
                sb.append(c); 
                prev = String.valueOf(c);
            }
        }
        
        // 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거
        if (sb.length() > 0 && sb.charAt(0) == '.') {
            sb.deleteCharAt(0);
        }
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '.') {
            sb.deleteCharAt(sb.length() - 1);
        }
        // 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입
        if (sb.length() == 0) {
            sb.append("a"); 
        }
        
        // 6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거
        // 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거
        if (sb.length() > 0 && sb.length() >= 16) {
            sb.setLength(15);
        }
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '.') {
            sb.deleteCharAt(sb.length() - 1);
        }
        
        // 7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복
        if (sb.length() > 0 && sb.length() < 3) {
            int cnt = 3 - sb.length();
            for (int idx = 0; idx < cnt; idx++) {
                sb.append(sb.charAt(sb.length() - 1));
            }
        }
        
        
        return sb.toString();
    }
}