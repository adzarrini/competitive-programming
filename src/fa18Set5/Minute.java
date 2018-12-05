import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Minute {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer s;
        double total = 0;
        double divide = 0;
        for(int i = 0; i < N; i++) {
            s = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(s.nextToken());
            int S = Integer.parseInt(s.nextToken());
            total += S / 60.0;
            divide += M;
        }
        if(total / divide <= 1) {
            System.out.println("measurement error");
        }
        else {
            System.out.println(total/divide);
        }
    }
}
