package sp18Set3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// How Many Digits?
public class I {
	public static void main(String[] args) throws Exception {
		long[] dp = new long[1000001];
		dp[0] = 1;
		double num = 1;
		for (int i = 1; i <= 1000000; i++) {
			num *= i;
			int z = ((int) num + "").length()-1;
			num /= Math.pow(10, z);
			dp[i] = dp[i-1] + z;
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		while ((line = br.readLine())!=null) {
			System.out.println(dp[Integer.parseInt(line)]);
		}
	}
}
