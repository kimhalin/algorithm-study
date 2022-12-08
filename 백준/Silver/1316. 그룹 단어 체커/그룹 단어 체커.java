import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < num; i++) {
            int[] alphabet = new int[26];
            count++;
            char[] word = br.readLine().toCharArray();
            for (int j = 0; j < word.length; j++) {

                int a = (int)word[j] - 97;
                if(alphabet[a] >= 1 && word[j] != word[j-1]) {
                    count--;
                    break;
                }
                alphabet[a]++;
            }

        }
        System.out.println(count);
    }
}
