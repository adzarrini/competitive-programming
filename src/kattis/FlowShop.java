package kattis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FlowShop {
	public static void main (String[] args) throws Exception {
		BufferedReader b = new BufferedReader(new InputStreamReader (System.in));
		String line = b.readLine();
		StringTokenizer s = new StringTokenizer(line);
		int N = Integer.parseInt(s.nextToken());
		int M = Integer.parseInt(s.nextToken());
		int c = 0;
		int P[][] = new int[N][];
		while (c < N) {	
			line = b.readLine();
			String js[] = line.split("\\s+");
			int j[] = new int[M];
			for (int i = 0; i < M; i++) {
				j[i] = Integer.parseInt(js[i]);
			}
			P[c] = j;
			c++;
		}
		String out = "";
		for (int i = 0; i < N; i++) {
			for (int j = 0; j< M; j++) {
				int t = P[i][j];
				while (t> 0 && i!=j) {
					t--;
					if (j > 0 && i + 1 < N) {
						P[i+1][j-1]--;
					}
				}
				
			}
			//out += Integer.toString(t) + " ";
		}
		//System.out.println(out.substring(0, out.length()-1));
		for (int i = 0; i < N; i++) {
			for (int j = 0; j< M; j++) {
				System.out.print(P[i][j] + " ");
			}
			System.out.println("");
		}
		
		int sum = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j< M; j++) {
				sum += P[i][j];
			}
			out += Integer.toString(sum) + " ";
		}
		System.out.println(out.substring(0, out.length()-1));
	}
}
