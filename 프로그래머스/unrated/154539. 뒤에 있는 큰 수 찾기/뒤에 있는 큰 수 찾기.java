import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int[] numbers) {
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[numbers.length];
        for (int i = numbers.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= numbers[i]) stack.pop();
            answer[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.add(numbers[i]);
        }

        return answer;
    }
}