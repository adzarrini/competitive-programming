package baylorArchive;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P3822 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String line = "";
		String out = "";
		for (int i = 0; i < n; i++) {
			out = "";
			line = br.readLine();
			char p = line.charAt(0);
			char c;
			int t = 1;
			for (int j = 1; j < line.length(); j++) {
				c = line.charAt(j);
				if (p == c) {
					t++;
				}
				else {
					out += Integer.toString(t) + Character.toString(p);
					p = c;
					t = 1;
				}
			}
			out += Integer.toString(t) + Character.toString(p);
			System.out.println(out);
		}
	}

}
