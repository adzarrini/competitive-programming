package baylorArchive;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P8024 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int T = Integer.parseInt(line);
		while(T--> 0) {
			line = br.readLine();
			int s = line.length();
			int[][] dp = new int[s][s];
			for (int i = s-1; i >= 0; i--) {
				for (int j = 0; j < s; j++) {
					if (i > j) dp[i][j] = 0;
					else if (j == i) dp[i][j] = 2;
					else {
						if (line.charAt(i) == line.charAt(j)) dp[i][j] = dp[i][j-1];
						else {
							int m = Integer.MAX_VALUE;
							for (int a = i; a < j; a++) {
								m = Math.min(m,  dp[i][a] + dp[a+1][j]);
							}
							dp[i][j] = m;
						}
					}
				}		
			}
			for (int i = 0; i < s; i++) {
				for (int j = 0; j < s; j++) {
					System.out.print(dp[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println(dp[0][s-1] + s);
		}		
	}
}
