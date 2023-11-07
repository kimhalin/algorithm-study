class Solution {
    boolean[] visited;
    int value = 51;
    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];
        backTracking(begin, target, words, 0);
        if (value == 51)
            return 0;
        return value;
    }
    
    public void backTracking(String begin, String target, String[] words, int depth) {
        if (begin.equals(target)) {
            value = Math.min(depth, value);
            return;
        }
        
        for (int i = 0; i < words.length; i++) {
            if (check(begin, words[i]) && !visited[i]) {
                visited[i] = true;
                backTracking(words[i], target, words, depth + 1);
                visited[i] = false;
            }
        }
    }
    
    public boolean check(String s1, String s2) {
        int cnt = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                cnt++;
            }
        }
        
        return cnt <= 1;
    }
}