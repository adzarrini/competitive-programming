package sp18Set2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

// Stacking Cups
public class L {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		TreeMap<Integer, String> bin = new TreeMap<Integer, String>();
		
		for (int i = 0; i < n; i++) {
			StringTokenizer s = new StringTokenizer(br.readLine());
			String one = s.nextToken();
			String two = s.nextToken();
			if (one.matches("\\d+")) {
				bin.put(Integer.parseInt(one)/2, two);
			}
			else bin.put(Integer.parseInt(two), one);
		}
		for (int k : bin.keySet()) {
			System.out.println(bin.get(k));
		}
	}
}
