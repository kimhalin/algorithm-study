import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] alphabet = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String line = br.readLine();
        int count = 0;
        for ( String a : alphabet ) {
            while (line.contains(a)) {
                count++;
                line = line.replaceFirst(a, "*");
            }
        }
        line = line.replace("*", "");
        System.out.println(count + line.length());

    }
}