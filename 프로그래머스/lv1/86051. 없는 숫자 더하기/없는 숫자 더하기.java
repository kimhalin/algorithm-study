import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int[] intarr = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < numbers.length; i++) {
            if (intarr[numbers[i]] != 0) {
                intarr[numbers[i]] = 0;
            }
        }
        return Arrays.stream(intarr).sum();
    }
}