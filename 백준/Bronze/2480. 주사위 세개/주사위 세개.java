import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[] {1,2,3,4,5,6};
        while (st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        for (int n : arr) {
            if(Collections.frequency(list, n) == 3) {
                System.out.print(10000 + n * 1000);
                return;
            }
            if(Collections.frequency(list, n) == 2) {
                System.out.print(1000 + n * 100);
                return;
            }
        }
        System.out.print(Collections.max(list) * 100);
    }
}