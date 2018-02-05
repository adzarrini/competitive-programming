package sp18Set2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// Secret Message
public class H {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String l = br.readLine();
			
			int L = l.length();
			int m = (int) Math.ceil(Math.sqrt(L));
			int M = (int) Math.pow(m, 2);
			
			int jump = M - L;
			String t = l;
			for (int j = 0; j < jump; j++) {
				t += "*";
			}
			String out = "";
			for (int j = 0; j < m; j++) {
				for(int k = 0; k < m; k++) {
					char temp = t.charAt(M + j - m*(k+1));
					if (temp == '*') continue;
					out += temp;
				}
			}
			System.out.println(out);
			
		}

	}
}
