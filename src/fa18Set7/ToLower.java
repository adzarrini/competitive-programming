import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ToLower {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(br.readLine());
        int P = Integer.parseInt(s.nextToken());
        int T = Integer.parseInt(s.nextToken());
        int count = 0;
        boolean pass = false;
        for(int i = 0; i < P; i++) {
            pass = true;
            for(int j = 0; j < T; j++) {
                String line = br.readLine();
                for (int k = 1; k < line.length(); k++) {
                    if (Character.isUpperCase(line.charAt(k))) {
                        pass = false;
                        break;
                    }
                }
            }
            if(pass) count++;
        }
        System.out.println(count);
    }
}
