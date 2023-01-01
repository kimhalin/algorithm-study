class Solution {
    public int solution(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            count++;
            for(int j = 2; j <= (int)Math.sqrt(i); j++) {
                if (i % j == 0 && i != j) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}