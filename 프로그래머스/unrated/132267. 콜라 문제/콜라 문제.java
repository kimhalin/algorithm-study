class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (n >= a) {
            int rest = n % a;
            int bottle = (n/a) * b;
            answer += bottle;
            n = bottle + rest;
        }
        return answer;
    }
}