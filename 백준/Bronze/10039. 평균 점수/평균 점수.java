
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] scores = new int[5];

        for (int i = 0; i < scores.length; i++) {
            int n = Integer.parseInt(br.readLine());
            if(n < 40) {
                scores[i] = 40;
                continue;
            }
            scores[i] = n;
        }

        System.out.println(Arrays.stream(scores).sum() / 5);

    }
}