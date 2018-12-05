import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ClosestSums {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = 0;
        String line;
        while((line = br.readLine())!=null) {
            int n = Integer.parseInt(line);
            Integer arr[] = new Integer[n];
            for(int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }
            Arrays.sort(arr);
            int m = Integer.parseInt(br.readLine());
            System.out.println("Case " + ++c + ":");
            for(int i = 0; i < m; i++) {
                int t = Integer.parseInt(br.readLine());
                int l = 0;
                int r = n-1;
                int diff = Integer.MAX_VALUE;
                int lf = 0, rf= 0;
                while(r > l) {
                    if(Math.abs(arr[l]+arr[r] - t) < diff) {
                        diff = Math.abs((arr[l]+arr[r]-t));
                        lf = l;
                        rf = r;
                    }
                    if(arr[l]+arr[r] > t) {
                        r--;
                    }
                    else l++;
                }
                int out = arr[lf] + arr[rf];
                System.out.println("Closest sum to " + t + " is " + out + ".");
            }
        }
    }
}
