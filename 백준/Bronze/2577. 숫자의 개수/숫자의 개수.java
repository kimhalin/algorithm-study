import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = 1;
        int[] arr = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < 3; i++) {
            n *= Integer.parseInt(br.readLine());
        }
        String[] num = Integer.toString(n).split("");

        for (int i = 0; i < num.length; i++) {
            arr[Integer.parseInt(num[i])]++;
        }

        for (int i : arr) {
            sb.append(i + "\n");
        }

        System.out.println(sb);
    }
}