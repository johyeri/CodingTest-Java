class Solution {
    public int solution(int num1, int num2) {
        double dnum1 = num1;
        double dnum2 = num2;
        
        int answer = (int)(dnum1 / dnum2 * 1000);
        return answer;
    }
}