package kattis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FeastCats {
	public static void main(String[] args) throws Exception {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(b.readLine());
		for (int i = 0; i < n; i++) {
			StringTokenizer s = new StringTokenizer(b.readLine());
			int m = Integer.parseInt(s.nextToken());
			int c = Integer.parseInt(s.nextToken());
			int[][] adj = new int[c][c];
			for (int j = 0; j < c*(c-1)/2; j++) {
				s = new StringTokenizer(b.readLine());
				adj[Integer.parseInt(s.nextToken())][Integer.parseInt(s.nextToken())] = Integer.parseInt(s.nextToken());
			}
			for (int j = 0; j < c; j++) {
				for (int k = j+1; k < c; k++) {
					adj[k][j] = adj[j][k];
				}
			}
			int out = 0;
			int[] mst = new int[c];
			for (int j = 1; j < c; j++) {
				mst[j] = adj[0][j];
			}
			for(int j = 1; j < c; j++) {
				int index = -1;
				int min = Integer.MAX_VALUE;
				for (int k = 0; k < c; k++) {
					if (mst[k] == 0) continue;
					if (mst[k] < min) {
						min = mst[k];
						index = k;
					}
				}
				out += mst[index];
				for (int k = 0; k < c; k++) {
					mst[k] = Math.min(mst[k], adj[index][k]);
				}
			}
			out += c;
			if (out > m) System.out.println("no");
			else System.out.println("yes");
			
		}

	}

}
