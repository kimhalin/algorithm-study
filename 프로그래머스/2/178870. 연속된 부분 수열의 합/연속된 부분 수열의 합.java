class Solution {
    public int[] solution(int[] sequence, int k) {
        // 오름차순 수열에서 부분 수열 탐색하기
        // 부분 수열의 합은 k
        // 합이 k인 부분 수열이 여러 개인 경우 길이가 짧은 수열을 찾기
        // 길이가 짧은 수열이 여러 개라면, 앞쪽 수열 찾기
        if (sequence[0] == k) return new int[]{0, 0};
        int answerLeft = 0, answerRight = 0, answerLen = 1000001;
        int left = 0;
        int right = 1;
        int sum = sequence[left] + sequence[right];
        
        while (left <= right && right < sequence.length) {
            int len = right - left + 1;
            if (sum == k && len < answerLen) {
                answerLeft = left;
                answerRight = right;
                answerLen = len;
            }
            else if (sum < k) {
                right++;
                if (right < sequence.length) {
                    sum += sequence[right];
                    if (sequence[right] == k)
                        return new int[]{right, right};
                }

            }
            else {
                sum -= sequence[left];
                left++;
            }
            
        }
        return new int[]{answerLeft, answerRight};
    }
}