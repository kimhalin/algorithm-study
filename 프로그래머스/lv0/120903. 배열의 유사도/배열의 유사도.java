import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (String s : s2) {
            answer += Arrays.stream(s1).filter(v -> v.equals(s)).toArray().length;
        }
        return answer;
    }
}