class Solution {
    public int solution(int n) {
        // 어떤 수를 7로 나누면 나머지가 0부터 6까지만 있기 때문에 6을 더해준다
        return (n + 6) / 7;
    }
}