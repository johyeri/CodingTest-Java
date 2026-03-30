import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        
        // 오름차순으로 '배열'을 정렬
        // ASCII(유니코드) 기준 오름차순 정렬을 하면 다음과 같은 순서가 됨
        // 공백 < 숫자 < 대문자 < 소문자
        Arrays.sort(arr);
        
        for (int idx = arr.length - 1; idx > -1; idx--) {
            sb.append(arr[idx]);
        }
        
        // return sb.toString();
        return new StringBuilder(new String(arr)).reverse().toString();
    }
}