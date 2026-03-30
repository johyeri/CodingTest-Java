class Solution {
    public int solution(int a, int b) {
        int aa = 2*a*b;
        int bb = Integer.parseInt(a+""+b);
    
        return aa==bb ? bb : Math.max(aa, bb);
    }
}