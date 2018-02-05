package sp18Set2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// Sideways Sorting
public class N {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String l = br.readLine();
			if (l.equals("0 0"))break;
			else System.out.println();
			
			StringTokenizer s = new StringTokenizer(l);
			int r = Integer.parseInt(s.nextToken());
			int c = Integer.parseInt(s.nextToken());
			
			String[] norm = new String[r];
			String[] side = new String[c];
			
			for (int j = 0; j < c; j++) {
				side[j] = "";
			}

			for (int i = 0; i < r; i++) {
				norm[i] = br.readLine();
				for (int j = 0; j < c; j++) {
					side[j] += norm[i].charAt(j);
				}
			}
			
			Arrays.sort(side, String.CASE_INSENSITIVE_ORDER);
			norm = new String[r];
			for (int i = 0; i < r; i++) {
				norm[i] = "";
			}
			
			for (int i = 0; i < c; i++) {
				for (int j = 0; j < r; j++) {
					norm[j] += side[i].charAt(j);
				}
			}
			for (int j = 0; j < r; j++) {
				System.out.println(norm[j]);
			}
		}
	}
}
