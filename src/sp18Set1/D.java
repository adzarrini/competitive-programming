package sp18Set1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			StringTokenizer s = new StringTokenizer(br.readLine());
			System.out.print(s.nextToken() + " ");
			int m = Integer.parseInt(s.nextToken());
			System.out.print(m*(m+1)/2 + " ");
			System.out.print(m*m + " ");
			System.out.println(m*(m+1) + " ");
		}
	}
}
