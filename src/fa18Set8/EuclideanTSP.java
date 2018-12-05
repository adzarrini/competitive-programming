import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EuclideanTSP {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        double p = Double.parseDouble(st.nextToken());
        double s = Double.parseDouble(st.nextToken());
        double v = Double.parseDouble(st.nextToken());

        double c = Math.log(s/n);
        c /= Math.log(Math.log(n));
        c /= Math.sqrt(2);

        double t = Math.log(s)+Math.log(p)+Math.log(Math.pow(10,9))-Math.log(n);
        t /= Math.sqrt(2);
        t /= Math.log(Math.log(n)/Math.log(2));
        System.out.println(c);
    }
}
