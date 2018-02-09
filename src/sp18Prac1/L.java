package sp18Prac1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// Stand on Zanzibar
public class L {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(b.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer s = new StringTokenizer(b.readLine());
            int f = Integer.parseInt(s.nextToken());
            int tot = 0;
            while(true) {
                int c = Integer.parseInt(s.nextToken());
                if (c == 0) break;
                
                if (c > 2*f) tot += c - 2*f;
                
                f = c;
            }
            System.out.println(tot);
        }
    }
}