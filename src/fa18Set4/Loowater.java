import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Loowater {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(;;) {
            StringTokenizer s = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(s.nextToken());
            int m = Integer.parseInt(s.nextToken());
            if(n == 0 && m == 0) break;

            int heads[] = new int[n];
            int knights[] = new int[m];

            for (int i = 0; i < n; i++) {
                heads[i] = Integer.parseInt(br.readLine());
            }
            Arrays.sort(heads);
            for (int i = 0; i < m; i++) {
                knights[i] = Integer.parseInt(br.readLine());
            }
            Arrays.sort(knights);
            if (n > m) {
                System.out.println("Loowater is doomed!");
                continue;
            }
            int sum = 0;
            boolean can = false;
            for(int i = 0; i < n; i++) {
                can = false;
                for(int j = 0; j < m; j++) {
                    if(heads[i] <= knights[j]) {
                        can = true;
                        sum += knights[j];
                        knights[j] = 0;
                        break;
                    }
                }
                if(!can) {
                    System.out.println("Loowater is doomed!");
                    break;
                }
            }
            if(!can) continue;
            System.out.println(sum);
        }
    }
}
