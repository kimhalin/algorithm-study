import java.util.HashMap;
class Solution {
    public String solution(String[] survey, int[] choices) {
                String answer = "";
        String[] mbti = {"R", "T", "C", "F", "J", "M", "A", "N"};
        HashMap<String, Integer> map = new HashMap<>();
        map.put("R", 0);
        map.put("T", 0);
        map.put("C", 0);
        map.put("F", 0);
        map.put("J", 0);
        map.put("M", 0);
        map.put("A", 0);
        map.put("N", 0);

        for (int i = 0; i < survey.length; i++) {
            // "모르겠음" 은 그냥 넘어가기
            if(choices[i] == 4)
                continue;

            // "AN" -> ["A", "N"]
            String[] strArr = survey[i].split("");
            
            if (choices[i] < 4) {
                map.replace(strArr[0], map.get(strArr[0]) + (4 - choices[i]));
            } else {
                map.replace(strArr[1], map.get(strArr[1]) + (choices[i]) - 4);
            }
        }

        for (int i = 0; i < mbti.length; i += 2) {
            String subStr = mbti[i];
            if(map.get(mbti[i]) < map.get(mbti[i + 1])){
                subStr = mbti[i + 1];
            }

            answer += subStr;
        }

        return answer;
    }
}