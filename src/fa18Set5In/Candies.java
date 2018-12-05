import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Candies {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());
        for(int i = 0; i < c; i++) {
            br.readLine();
            int n = Integer.parseInt(br.readLine());
            BigInteger sum = new BigInteger("0");
            for(int j = 0; j < n; j++) {
                sum = sum.add(new BigInteger(br.readLine()));
            }
            if(sum.mod(new BigInteger(Integer.toString(n))) == BigInteger.ZERO) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
