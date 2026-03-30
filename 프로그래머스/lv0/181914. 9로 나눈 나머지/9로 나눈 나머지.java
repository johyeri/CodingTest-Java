class Solution {
    public int solution(String number) {
        int answer = 0;
        String[] strArr = number.split("");
        
        for(String str : strArr) {
            answer += Integer.parseInt(str);
        }
        
        answer = answer % 9;
        
        return answer;
    }
}