class Solution {
    public int solution(String[] board) {
        int[] num = new int[2];
        // X의 개수가 더 클 경우
        // 3개의 O가 있고, X의 개수가 O의 개수보다 크거나 같을 경우
        // 3개의 X가 있고, O의 개수가 X의 개수보다 클 경우
        
        // 3개의 연속된 표시가 있는지 확인
        // X의 개수부터 확인
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i].charAt(j) == 'O')
                    num[0]++;
                else if(board[i].charAt(j) == 'X')
                    num[1]++;
            }
        }
        if (num[0] < num[1]) {     
            return 0;            
        }

        if (num[0] - num[1] > 1) {
            return 0;
        }
        
        boolean xTic = win('X', board);
        boolean oTic = win('O', board);
        
        if (oTic && num[0] == num[1]) {
            return 0;
        }
        if (xTic && num[0] > num[1]) {
            return 0;
        }
        
        return 1;
        
    }
    public boolean win(char c, String[] map) {
        for(int i = 0; i < 3; i++)
        {
            if(map[i].charAt(0) == c && map[i].charAt(0) == map[i].charAt(1) && map[i].charAt(1) == map[i].charAt(2))
                return true;
            if(map[0].charAt(i) == c && map[0].charAt(i) == map[1].charAt(i) && map[1].charAt(i) == map[2].charAt(i))
                return true;
        }
        if(map[0].charAt(0) == c && map[0].charAt(0) == map[1].charAt(1) && map[1].charAt(1) == map[2].charAt(2))
            return true;
        if(map[0].charAt(2) == c && map[0].charAt(2) == map[1].charAt(1) && map[1].charAt(1) == map[2].charAt(0))
            return true;
        return false;
    }
}