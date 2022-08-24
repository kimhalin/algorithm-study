import java.util.Arrays;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};

        Arrays.sort(strings, (String s1, String s2) -> {
            if ((int) s1.charAt(n) - (int) s2.charAt(n) > 0) {
                return 1;
            } else if ((int) s1.charAt(n) - (int) s2.charAt(n) < 0) {
                return -1;
            } else {
                return s1.compareTo(s2);
            }
        });
        answer = strings;
        return answer;
    }
}