import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {0, 0};
        
        answer[0] = (int) Arrays.stream(num_list).filter(v-> v % 2 ==0).count();
        answer[1] = (int) Arrays.stream(num_list).filter(v-> v % 2 !=0).count();
        
        return answer;
    }
}