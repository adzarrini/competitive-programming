package sp18Set8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// Parking
public class G {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			int x[] = new int[n];
			StringTokenizer s = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				x[j] = Integer.parseInt(s.nextToken());
			}
			Arrays.sort(x);
			System.out.println(2*Math.abs(x[n-1]-x[0]));
		}
	}
}
