import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        StringBuffer sb = new StringBuffer();
        for (int i = 1; i < 10000; i++) {
            int dn = 1;
            while (true) {
                if (dn == i) {
                    sb.append(i + "\n");
                    break;
                }
                
                if (dn + dn/1000 + ((dn / 100) % 10) + ((dn / 10) % 10) + dn % 10 == i) {
                    break;
                }
                dn++;
            }
        }
        System.out.println(sb);
    }
}
