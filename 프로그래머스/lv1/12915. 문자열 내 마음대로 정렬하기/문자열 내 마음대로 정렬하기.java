import java.util.Arrays;
class Solution {
    public String[] solution(String[] strings, int n) {
        
        Arrays.sort(strings, (String s1, String s2) -> {
            if ((int) s1.charAt(n) == (int) s2.charAt(n)){
                return s1.compareTo(s2);
            }
            else{
                return ((int) s1.charAt(n) - (int) s2.charAt(n));
            }
        });
        
        return strings;
    }
}