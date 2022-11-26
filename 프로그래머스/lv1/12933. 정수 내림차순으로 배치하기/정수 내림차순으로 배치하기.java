import java.util.*;

class Solution {
    public long solution(long n) {
        char[] chars = Long.toString(n).toCharArray();
        Arrays.sort(chars);
        String reverse = new StringBuilder(new String(chars)).reverse().toString();
        return Long.parseLong(reverse);
    }
}