class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int p_len = p.length();
        long pNum = Long.parseLong(p);
        for (int i = 0; i <= t.length() - p_len; i++) {
            long tNum = Long.parseLong(t.substring(i, i+p_len));
            if (tNum <= pNum) {
                answer++;
            }
        }

        return answer;
    }
}