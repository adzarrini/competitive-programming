import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prsteni {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer s = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(s.nextToken());
        int B;
        for (int i = 1; i < n; i++) {
            B = Integer.parseInt(s.nextToken());
            int g = gcd(A,B);
            System.out.print(A/g);
            System.out.print('/');
            System.out.println(B/g);
        }

    }

    public static int gcd(int a, int b) {
        if(a == 0) return b;
        if(b == 0) return a;
        return gcd(b,a%b);
    }
}
