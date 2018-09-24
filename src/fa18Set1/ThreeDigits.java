import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ThreeDigits {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseUnsignedLong(br.readLine());
        long res = 1;
        long pow2 = 0;
        for (long i = 1; i <= n; i++) {
            long temp = i;
            while (temp % 2 == 0) {
                pow2++;
                temp /= 2;
            }
            while (temp % 5 == 0) {
                pow2--;
                temp /= 5;
            }
            res *= temp;
            res %= 1000;
        }
        System.out.println("RES " + res);
        res *= (long) Math.pow(2,pow2);
        res%=1000;
        if(n < 8) System.out.println(res);
        else {
            String out = Long.toString(res);
            switch (out.length()) {
                case 0:
                    System.out.println("000");
                    break;
                case 1:
                    System.out.println("00"+out);
                    break;
                case 2:
                    System.out.println("0"+out);
                    break;
                default:
                    System.out.println(out);
                    break;
            }
        }
    }
}
