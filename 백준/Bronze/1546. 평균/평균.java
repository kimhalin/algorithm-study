import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] scores = Arrays.stream(br.readLine().split(" ")).mapToInt(i -> Integer.parseInt(i)).toArray();
        int max = Arrays.stream(scores).max().getAsInt();

        double[] prints = new double[num];
        for(int i = 0; i < num; i++) {
            prints[i] =  ( (double)scores[i] / max ) * 100;
        }
        System.out.println(Arrays.stream(prints).average().getAsDouble());
    }
}