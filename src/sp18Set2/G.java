package sp18Set2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// The Backslash Problem
public class G {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String l = "";
		while ((l = br.readLine())!=null) {
			int n = Integer.parseInt(l);
			l = br.readLine();
			for (int i = 0; i < n; i++) l = back(l);
			System.out.println(l);
		}

	}
	
	public static String back(String l) {
		int c = 0;
		String s = l;
		for (int i = 0; i < l.length(); i++) {
			if (l.charAt(i) >= '!' && l.charAt(i) <= '*') {
				s = s.substring(0, i+c) + "\\" + s.substring(i+c,s.length());
				c++;
			}
			if (l.charAt(i) >= '[' && l.charAt(i) <= ']') {
				s = s.substring(0, i+c) + "\\" + s.substring(i+c,s.length());
				c++;
			}
		}
		return s;
	}

}
