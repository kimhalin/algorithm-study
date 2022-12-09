import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int num = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < num; i++) {
            String word = br.readLine();
            if (list.contains(word)){
                continue;
            }
            list.add(word);
        }
        list.sort((s1, s2) -> {
            if (s1.length() == s2.length()) {
                return s1.compareToIgnoreCase(s2);
            }
            return s1.length() - s2.length();
        });

        for (String s : list) {
            sb.append(s).append('\n');
        }
        System.out.println(sb);
    }
}