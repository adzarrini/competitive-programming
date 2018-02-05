package baylorArchive;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P3045 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n==0) break;
			double temp = Math.sqrt(8*n + 1)/2-0.5;
			int m = (int)Math.floor(temp);
			int x = m*(m+1)/2;
			int tot=m*(m+1)*(2*m+1)/6;
			tot+=(m+1)*(n-x);
			System.out.println(Integer.toString(n) + " " + Integer.toString(tot));
		}
	}
}
