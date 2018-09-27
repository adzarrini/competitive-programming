import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soda {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(br.readLine());
        int e = Integer.parseInt(s.nextToken());
        int f = Integer.parseInt(s.nextToken());
        int c = Integer.parseInt(s.nextToken());

        int bottles = e+f;
        int drank = 0;
        while(bottles>=c) {
            drank += bottles / c;
            int temp = bottles / c;
            bottles %= c;
            bottles += temp;
        }
        System.out.println(drank);
    }
}
