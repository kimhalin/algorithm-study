import java.util.*;

class Solution {
    public String solution(String phone_number) {
        char[] phone_num = phone_number.toCharArray();
        for (int i = 0; i < phone_num.length - 4; i++) {
            phone_num[i] = '*';
        }
        return new String(phone_num);
    }
}