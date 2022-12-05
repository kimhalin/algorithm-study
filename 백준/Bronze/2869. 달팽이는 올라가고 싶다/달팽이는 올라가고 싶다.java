import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().split(" ");
        int up = Integer.parseInt(lines[0]);
        int down = Integer.parseInt(lines[1]);
        int length = Integer.parseInt(lines[2]);

        int day = (length - down) / (up - down);
        if ((length - down) % (up - down) != 0)
            day++;

        System.out.println(day);
    }
}