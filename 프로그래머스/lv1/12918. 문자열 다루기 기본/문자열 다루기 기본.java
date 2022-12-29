import java.io.*;

class Solution {
    public boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6) {
            try {
                int a = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                return false;
            }
            return true;
        } else {
            return false;
        }
    }
}