package sp18Set1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class I {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		int c = 0;
		while((line = br.readLine())!=null) {
			c++;
			StringTokenizer s = new StringTokenizer(line);
			int n1 = Integer.parseInt(s.nextToken());
			int n2 = Integer.parseInt(s.nextToken());
			System.out.print("Case " + c + ": ");
			int m1 = 365 - n1;
			int m2 = 687 - n2;
			if (n1 == n2 && n1 == 0) {
				System.out.println(0);
			}
			else if (m1 == m2) {
				System.out.println(m1);
			}
			else {
				int count = m1 % 365 + n2;
				//if (count == 0) count = n2;
				while (true) {
					count += 365;
					if (count % 687 == 0) break;
				}
				System.out.println(count - n2);
			}

			
		}
	}
}
