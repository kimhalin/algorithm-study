import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String lines = br.readLine().toLowerCase();
        int[] alphabet = new int[26];
        for (int i = 0; i < lines.length(); i++) {
            alphabet[lines.charAt(i) - 'a']++;
        }
        int max = Arrays.stream(alphabet).max().getAsInt();
        int count = 0;
        String c = " ";
        for ( int i = 0; i < alphabet.length; i++) {
            if(alphabet[i] == max) {
                count++;
                c =Character.toString((char)(i + 'a'));
            }
            if(count > 1) {
                System.out.println("?");
                return;
            }
        }
        System.out.println(c.toUpperCase());
    }
}
