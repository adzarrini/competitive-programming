package kattis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Speed {
	public static void main(String[] args) throws Exception {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		String l = "";
		while (true) {
			l = b.readLine();
			if (l.equals("-1")) break;
			int n = Integer.parseInt(l);
			int c = 0;
			int d = 0;
			for (int i = 0; i < n; i++) {
				StringTokenizer s = new StringTokenizer(b.readLine());
				int sp = Integer.parseInt(s.nextToken());
				int h = Integer.parseInt(s.nextToken());
				d += sp*(h-c);
				c = h;
			}
			System.out.println(Integer.toString(d) + " miles");
		}
	}

}
