import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> lst = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        Collections.reverse(lst);
        return lst.stream().mapToInt(i->i).toArray();
    }
}