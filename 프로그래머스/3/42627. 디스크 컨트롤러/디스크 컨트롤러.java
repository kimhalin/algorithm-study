import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        int time = 0;

        PriorityQueue<int[]> workQue = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
        PriorityQueue<int[]> inQue = new PriorityQueue<>((o1, o2) -> o1[0] - o2[0]);
        for(int[] j : jobs)
            inQue.offer(j);

        while(!inQue.isEmpty() || !workQue.isEmpty()){
            while(!inQue.isEmpty() && inQue.peek()[0] <= time){
                workQue.offer(inQue.poll());
            }

            if(workQue.isEmpty()){ 
                time = inQue.peek()[0];
            }else{
                int[] j = workQue.poll();
                answer += time + j[1] - j[0];
                time += j[1];
            }
        }

        answer /= jobs.length;

        return answer;
    }
}