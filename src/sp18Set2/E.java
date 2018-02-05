package sp18Set2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

// ICPC Awards
public class E {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		HashMap<String,String> m = new HashMap<String,String>();
		ArrayList<String> order = new ArrayList<String>();
		int c = 0;
		for (int i = 0; i < n; i++) {
			StringTokenizer s = new StringTokenizer(br.readLine());
			String k = s.nextToken();
			if (m.containsKey(k)) continue;
			else c++;
			m.put(k, s.nextToken());
			order.add(k);
			if (c == 12) break;
		}
		for (String s : order) {
			System.out.println(s + " " + m.get(s));
		}
	}
}
