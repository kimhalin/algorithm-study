import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> mylist = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                mylist.add(arr[i]);
            }
        }
        if(mylist.size() == 0) {
            mylist.add(-1);
            return mylist.stream()
                    .mapToInt(i -> i)
                    .toArray();
        }
        mylist.sort(Comparator.naturalOrder());
        return mylist.stream()
                .mapToInt(i -> i)
                .toArray();


    }
}