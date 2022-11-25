import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        long pcount = s.chars().filter(c-> c == 'p' || c =='P').count();
        long ycount = s.chars().filter(c-> c == 'y' || c =='Y').count();
        
        return pcount == ycount;
    }
}