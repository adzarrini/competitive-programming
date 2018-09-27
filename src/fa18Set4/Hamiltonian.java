import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hamiltonian {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(s.nextToken());
        String a = s.nextToken();
        String b = s.nextToken();

        int[] a1 = new int[n];
        int[] b1 = new int[n];

        for(int i = 0; i < n; i++) {
            a1[i] = Integer.parseInt(Character.toString(a.charAt(i)));
            b1[i] = Integer.parseInt(Character.toString(b.charAt(i)));
        }

        long aval = a1[0] * (long)Math.pow(2,n-1);
        long bval = b1[0] * (long)Math.pow(2,n-1);
        for(int i = 1; i < n; i++) {
            a1[i] ^= a1[i-1];
            b1[i] ^= b1[i-1];
            aval += a1[i] * (long)Math.pow(2, n-i-1);
            bval += b1[i] * (long)Math.pow(2, n-i-1);
        }

        System.out.println(Math.abs(bval - aval)-1);
    }
}
