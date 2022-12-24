import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[] {-1};
        }
        List<Integer> mylist
                = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList());
        mylist.remove(Collections.min(mylist));
        return mylist.stream().mapToInt(i -> i).toArray();
    }
}