package sp18Set9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// Incognito
public class J {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Map<String, Integer> disguise = new HashMap<>();
		for(int i = 0; i < n; i++) {
			int m = Integer.parseInt(br.readLine());
			for(int j = 0; j < m; j++) {
				StringTokenizer s = new StringTokenizer(br.readLine());
				s.nextToken();
				String l1 = s.nextToken();
				if(disguise.containsKey(l1)) {
					disguise.put(l1, disguise.get(l1)+1);
					continue;
				}
				disguise.put(l1, 1);
			}
			//System.out.println(disguise.toString());
			if(m == 0) {
				System.out.println(0);
				continue;
			}
			long[] dp = new long[disguise.size()];
			int[] dis = new int[disguise.size()];
			int c = 0;
			for(String st : disguise.keySet()) {
				dis[c] = disguise.get(st);
				c++;
			}
			dp[0] = dis[0];
			//System.out.println(dp[0]);
			for (int j = 1; j < dis.length; j++) {
				dp[j] = dp[j-1] + dis[j] +  dp[j-1]*dis[j];
				//System.out.println(dp[j]);
			}
			System.out.println(dp[dp.length-1]);
			disguise.clear();
		}
	}
}
