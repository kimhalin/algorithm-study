import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String[] b = br.readLine().split("");
        int sum = 0;
        for(int i =2; i >= 0; i--) {
            sum += a * Integer.parseInt(b[i]) * (Math.pow(10, (double)2 - i));
            System.out.println(a * Integer.parseInt(b[i]));
        }
        System.out.println(sum);
    }
}