import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SmallSchedule {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(br.readLine());
        int Q = Integer.parseInt(s.nextToken());
        int M = Integer.parseInt(s.nextToken());
        int S = Integer.parseInt(s.nextToken());
        int L = Integer.parseInt(s.nextToken());
        int time = 0;
        while(L > 0 || S > 0) {
            if(L >= M) {
                L -= M;
                time += Q;
            }
            else if(L < M && L != 0) {
                int left = M - L;
                L = 0;
                time += Q;
                S -= left*Q;
            }
            else if(L == 0) {
                S -= M;
                time++;
            }
        }
        System.out.println(time);
    }
}
