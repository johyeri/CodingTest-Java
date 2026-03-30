class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for (char a : my_string.toCharArray()) {
            answer += String.valueOf(a).repeat(n);
        }
        return answer;
    }
}