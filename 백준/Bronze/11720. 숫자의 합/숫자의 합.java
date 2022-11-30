import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        String line = br.readLine();
        line = br.readLine();
        int answer = 0;
        char[] nums = line.toCharArray();
        for (char c : nums) {
            answer += (int) c - '0';
        }
        System.out.print(answer);
    }
}
