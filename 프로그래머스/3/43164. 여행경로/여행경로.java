import java.util.*;

class Solution {
    static ArrayList<String> list;
    static boolean[] useTicket;
    public String[] solution(String[][] tickets) {
        useTicket = new boolean[tickets.length];
        list = new ArrayList<>();
        
        dfs(0, "ICN", "ICN", tickets);
        Collections.sort(list);
        
        return list.get(0).split(" ");
    }
    
    static public void dfs(int depth, String now, String path, String[][] tickets) {
        if (depth == tickets.length) {
            list.add(path);
            return;
        }
        for (int i = 0; i < tickets.length; i++) {
            if (!useTicket[i] && tickets[i][0].equals(now)) {
                useTicket[i] = true;
                dfs(depth + 1, tickets[i][1], path + " " + tickets[i][1], tickets);
                useTicket[i] = false;
            }
        }
    }
}