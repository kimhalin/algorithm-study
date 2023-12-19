import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = Integer.MAX_VALUE;
        
        if (s.length() == 1) return 1;
        
        for (int i = 1; i <= s.length() / 2; i++) {
            String pattern = s.substring(0, i);
            String reStr = "";
            int cnt = 1;
            
            for (int j = i; j <= s.length() - i; j += i) {
                if (pattern.equals(s.substring(j, i+j)))
                    cnt++;
                else {
                    if (cnt > 1) {
                        reStr += "" + cnt;
                    }
                    reStr += pattern;
                    pattern = s.substring(j, i+j);
                    cnt = 1;
                }
            }
            
            if (cnt > 1) {
                reStr += "" + cnt;
            }
            reStr += pattern;
            
            int rest = s.length() % i;
            answer = Math.min(answer, rest + reStr.length());
        }
        
        return answer;
    }
}