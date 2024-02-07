import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean solution(String[] phoneBook) {

        Map<String, Integer> map = new HashMap<>();


        for (String str : phoneBook) 
            map.put(str, 0);
        
        for (int i = 0; i < phoneBook.length; i++)
            for (int j = 0; j < phoneBook[i].length(); j++)
                if (map.containsKey(phoneBook[i].substring(0, j)))
                    return false;

        return true;
    }
}