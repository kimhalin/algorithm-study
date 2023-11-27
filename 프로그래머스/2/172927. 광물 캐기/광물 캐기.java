import java.util.*;

class Solution {
    class Mineral {
        int score;
        int dia;
        int iron;
        int stone;
        
        public Mineral() {
            score = 0;
            dia = 0;
            iron = 0;
            stone = 0;
        }
        public int getTired(int pick) {
            if (pick == 0)
                return dia + iron + stone;
            if (pick == 1)
                return dia * 5 + iron + stone;
            else
                return dia * 25 + iron * 5 + stone;
            
        }
    }
    public int solution(int[] picks, String[] minerals) {
        int sum = Arrays.stream(picks).sum();
        int mineralsLen = minerals.length;
        if (sum * 5 < mineralsLen)
            mineralsLen = sum * 5;
        Mineral[] mineralList = new Mineral[(mineralsLen - 1) / 5 + 1];

        for (int i = 0; i < mineralsLen; i++) {
            if (mineralList[i/5] == null)
                mineralList[i/5] = new Mineral();
            Mineral temp = mineralList[i/5];
            
            if (minerals[i].equals("diamond")) {
                temp.dia++;
                temp.score += 25;
            }
            else if (minerals[i].equals("iron")) {
                temp.iron++;
                temp.score += 5;
            }
            else if (minerals[i].equals("stone")) {
                temp.stone++;
                temp.score++;
            }
        }
        
        Arrays.sort(mineralList, new Comparator<>() {
            @Override
            public int compare(Mineral m1, Mineral m2) {
                return m2.score - m1.score;
            }
        });
        
        int answer = 0;
        
        for (int i = 0; i < mineralList.length; i++){
            if (picks[0] > 0) {
                answer += mineralList[i].getTired(0);
                picks[0]--;
            }
            else if (picks[1] > 0) {
                answer += mineralList[i].getTired(1);
                picks[1]--;                
            }
            else if (picks[2] > 0) {
                answer += mineralList[i].getTired(2);
                picks[2]--;                
            }
            else {
                return answer;
            }
        }
        
        return answer;
    }
}