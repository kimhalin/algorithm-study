class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for(int j = left; j <= right; j++) {
            int count = 0;
            for (int i = 1; i * i <= j; i++) {
                if (i * i == j) count++;
                else if (j % i == 0) count += 2;
            }
            answer += (count % 2 == 0) ? j : (-j);
        }

        return answer;
    }
}