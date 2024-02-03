class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        // [4, 1, 2, 1]
        // 4, -4, -1, 1, -2, 2, -1, 1
        // 순서는 중요 X
        // dfs로 idx를 증가시켜가면서, left는 양수 right는 음수로 풀면 되지 않을까?
        
        dfs(numbers, 0, 0, target);
        return answer;
    }
    
    public void dfs(int[] numbers, int idx, int sum, int target) {
        if (idx == numbers.length && target == sum) {
            answer++;
            return;
        }
        
        if (idx == numbers.length) return;
        
        dfs(numbers, idx + 1, sum + numbers[idx], target);
        dfs(numbers, idx + 1, sum - numbers[idx], target);
    }
}