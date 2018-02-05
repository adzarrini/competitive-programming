package sp18Set1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class H {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		int co = 0;
		while((line = br.readLine()) != null) {
			co++;
			StringTokenizer s = new StringTokenizer(line);
			int a = Integer.parseInt(s.nextToken());
			int b = Integer.parseInt(s.nextToken());
			s = new StringTokenizer(br.readLine());
			int c = Integer.parseInt(s.nextToken());
			int d = Integer.parseInt(s.nextToken());
			int mult = a*d - b*c;
			a /= mult;
			b /= -mult;
			c /= -mult;
			d /= mult;
			System.out.println("Case " + co + ":");
			System.out.println(d + " " + b);
			System.out.println(c + " " + a);
			br.readLine();
		}
	}
}
