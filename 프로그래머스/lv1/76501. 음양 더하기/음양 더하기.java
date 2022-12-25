import java.util.*;
class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            answer = answer + ((signs[i]) ? +absolutes[i] : -absolutes[i]);
        }
        return answer;
    }
}