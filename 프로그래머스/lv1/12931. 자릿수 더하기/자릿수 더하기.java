import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        char[] num = String.valueOf(n).toCharArray();
        for(char v : num) {
            answer += (int)(v - '0');
        }
        return answer;
    }
}