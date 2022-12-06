import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] num = br.readLine().split(" ");

        int count = 0;
        for (String v : num) {
            int value = Integer.parseInt(v);
            count++;
            if (value == 2) {
                continue;
            }
            if (value == 1) {
                count--;
                continue;
            }
            for (int j = 2; j < value; j++){
                if (value % j == 0) {
                    count--;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}