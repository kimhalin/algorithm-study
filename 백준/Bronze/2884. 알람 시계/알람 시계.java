import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int h = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        if (m < 45) {
            if( h == 0 ) {
                System.out.println(23 + " " + (15 + m));
            }
            else {
                System.out.println((h-1) + " " + (15 + m));
            }
        }
        else {
            System.out.println(h + " " + (m - 45));
        }
    }
}