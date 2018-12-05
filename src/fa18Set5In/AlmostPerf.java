import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class AlmostPerf {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while ((line = b.readLine())!= null) {
            int p = Integer.parseInt(line);
            HashSet<Integer> d = new HashSet<Integer>();
            d.add(1);
            for (int i = 2; i < Math.sqrt(p)+1; i++) {
                if (p%i == 0) {
                    d.add(i);
                    d.add(p/i);
                }
            }
            int sum = 0;
            for (int i : d) {
                sum+= i;
            }
            if (p == sum) {
                System.out.println(p + " perfect");
            }
            else if (sum >= (p-2) && sum <= (p+2)) {
                System.out.println(p + " almost perfect");
            }
            else {
                System.out.println(p + " not perfect");
            }
        }

    }

}