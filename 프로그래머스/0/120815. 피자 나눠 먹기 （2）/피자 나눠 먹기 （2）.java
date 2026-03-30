class Solution {
//     1. 유클리드호제법을 이용한 풀이
//     public int solution(int n) {
//         // 최소 공배수를 구하는 문제
//         return n * 6 / gcd(n,6) / 6;
//     }
    
//     public static int gcd (int a, int b) {
//         if (b == 0) return a;
//         else return gcd(b, a % b);
//     }
    
    public int solution(int n) {
        int answer = 1;
        while(true) {
            if ((answer * 6) % n == 0) break;
            answer++;
        }
        return answer;
    }
}