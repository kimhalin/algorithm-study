class Solution {
    boolean[] visit;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visit = new boolean[n];
        
        for (int i =0; i < n; i++) {
            if (visit[i] == false) {
                answer++;
                dfs(computers, n, i);
            }
        }
        return answer;
        
    }
    
    public void dfs(int computers[][], int n, int idx) {
        visit[idx] = true;
        
        for (int i = 0; i < n; i++) {
            if (visit[i] == false && computers[idx][i] == 1)
                dfs(computers, n, i);
        }
    }
}