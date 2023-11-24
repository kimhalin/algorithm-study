import java.util.*;

class Solution {
    class Subject implements Comparable<Subject> {
        String name;
        int start, playTime;
        
        Subject(String name, int start, int playTime) {
            this.name = name;
            this.start = start;
            this.playTime = playTime;
        }
        
        @Override
        public int compareTo(Subject s) {
            return this.start - s.start;
        }
    }
    public String[] solution(String[][] plans) {
        String[] answer = {};
        
        answer = new String[plans.length];
        int idx = 0;
        PriorityQueue<Subject> q = new PriorityQueue<>((o1, o2) -> (o1.start - o2.start));
        for (String[] p : plans) {
            q.add(new Subject(p[0], convertTime(p[1]), Integer.parseInt(p[2])));
        }
        
        Subject s = q.poll();
        int now = s.start;
        
        Stack<Subject> stack = new Stack<>();
        while (true) {
            if (!q.isEmpty() && now + s.playTime > q.peek().start) {
                // 과제 중지
                stack.push(new Subject(s.name, s.start, s.playTime - (q.peek().start - now)));
                now = q.peek().start;
                
                s = q.poll();
            }
            else {
                // 과제 완료
                answer[idx++] = s.name;
                now += s.playTime;
                
                // 새로운 과제
                if (!q.isEmpty() && now == q.peek().start)
                    s = q.poll();
                
                // 멈춰둔 과제
                else if(!stack.isEmpty())
                    s = stack.pop();
                else if(!q.isEmpty()) {
                    s = q.poll();
                    now = s.start;
                }
                else break;
            }
        }
        
        return answer;
    }
    
    public int convertTime(String t) {
        String[] str = t.split(":");
        int min = Integer.parseInt(str[0]) * 60 + Integer.parseInt(str[1]);
        return min;
    }
}