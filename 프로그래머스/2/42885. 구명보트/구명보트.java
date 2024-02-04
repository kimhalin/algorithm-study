import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        // 구명보트 최대 2명, 무게 제한 존재
        // 구명보트를 최대한 적게 사용해 "모든 사람" 구출
        
        // 한 사람 person을 넣고, limit - person인 사람이 있으면 넣기 -> +1
        // 정렬을 한 후에 first와 end idx를 가지고 넣으면 되지 않을까?
        
        // left와 right를 더했을 때, 넘는다면 +1 한후 right--
        // left와 right를 더했을 때, 넘지않는다면 left++, right--
        // 
        Arrays.sort(people);
        int left = 0, right = people.length - 1;
        while (left <= right) {
            if (left == right) {
                answer++;
                break;
            }
            if (people[left] + people[right] > limit) {
                answer++;
                right--;
            }
            else {
                answer++;
                left++;
                right--;
            }
        }

        return answer;
    }
}