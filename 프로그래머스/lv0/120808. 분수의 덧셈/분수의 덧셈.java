class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int denom = denom1 * denom2;
        int commonNum1 = numer1 * denom2;
        int commonNum2 = numer2 * denom1;
        int numer = commonNum1 + commonNum2;
        
        int gcd = 0;
        
        for (int i = 1; i <= denom && i <= numer; i++) {
            if (denom%i == 0 && numer%i == 0) {
                gcd = i;
            }
        }
        
        int[] answer = {numer/gcd, denom/gcd};
        
        return answer;
    }
}