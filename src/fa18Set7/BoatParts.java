import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BoatParts {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(br.readLine());
        int P = Integer.parseInt(s.nextToken());
        int N = Integer.parseInt(s.nextToken());
        Set<String> parts = new HashSet<>();
        Boolean complete = false;
        for(int i = 0; i < N; i++) {
            parts.add(br.readLine());
            if(parts.size() == P) {
                System.out.println(i + 1);
                complete = true;
                break;
            }
        }
        if(!complete) {
            System.out.println("paradox avoided");
        }
    }
}
