import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LastFactorialDigit {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            int T = Integer.parseInt(br.readLine());
            int out = 1;
            for(int j = 1; j <= T; j++) {
                out *= j;
                out %= 10;
            }
            System.out.println(out);
        }
    }
}
