package sp18Set6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


//Secret Chamber at Mount Rushmore
public class A {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(s.nextToken());
		int n = Integer.parseInt(s.nextToken());
		Map<Character,Character> trans = new HashMap<>();
		for (int i = 0; i < m; i++) {
			s = new StringTokenizer(br.readLine());
			trans.put(s.nextToken().charAt(0), s.nextToken().charAt(0));
		}
		boolean pass = true;
		for (int i = 0; i < n; i++) {
			String s1 = s.nextToken();
			String s2 = s.nextToken();
			if (s1.length() != s2.length()) pass = false;
			else {
				for (int j = 0; j < s1.length(); j++) {
					if(s1.charAt(j) == s2.charAt(j)) continue;
					else {
						while (pass) {
							
						}
					}		
				}
			}
		}
	}
}
