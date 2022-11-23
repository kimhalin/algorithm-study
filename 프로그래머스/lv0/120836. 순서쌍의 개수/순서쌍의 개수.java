class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int loop = 1; loop <= n; loop++) {
           if (n % loop == 0) 
              answer++;
        }
        return answer;
    }
}