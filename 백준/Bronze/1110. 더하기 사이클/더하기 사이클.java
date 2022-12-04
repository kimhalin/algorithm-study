import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        num = (num.length() == 1) ? "0" + num : num;
        String sum_n = num;
        int cycle = 0;
        while (true) {
            cycle++;
            String sum =Integer.toString((int) (sum_n.charAt(0) - '0') + (int) (sum_n.charAt(1) - '0'));
            String right = Character.toString((sum.length() == 1) ? sum.charAt(0) : sum.charAt(1));
            String left = Character.toString((sum_n.length() == 1) ? sum_n.charAt(0) : sum_n.charAt(1));
            sum_n = left + right;

            if(sum_n.equals(num)) {
                break;
            }
        }
        System.out.println(cycle);
    }
}