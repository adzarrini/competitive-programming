package sp18Set4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
// Amsterdam Distance
public class A {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(s.nextToken());
		int N = Integer.parseInt(s.nextToken());
		double R = Double.parseDouble(s.nextToken());
		s = new StringTokenizer(br.readLine());
		int ax = Integer.parseInt(s.nextToken());
		int ay = Integer.parseInt(s.nextToken());
		int bx = Integer.parseInt(s.nextToken());
		int by = Integer.parseInt(s.nextToken());
		
		
		double dang = Math.PI / M;
		double dr = (R / N);
		
		double[][] grid = new double[M][N];
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				grid[i][j] = Double.MAX_VALUE;
			}
		}
		ArrayList<Double> adj = new ArrayList<Double>();
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				if((ax+i)%M+1 < M) adj.add(grid[(ax+i)%M+1][(ay+j)%N]+dang*((ay+j)%N));
				if((ax+i)%M-1 >= 0) adj.add(grid[(ax+i)%M-1][(ay+j)%N]+dang*((ay+j)%N));
				if((ay+j)%N+1 < N) adj.add(grid[(ax+i)%M][(ay+j)%N+1]+dr);
				if((ay+j)%N-1 >= 0) adj.add(grid[(ax+i)%M][(ay+j)%N-1]+dr);
				double min = Double.MAX_VALUE;
				for (int k = 0; k < adj.size(); k++) {
					if(min > adj.get(k)) min = adj.get(k);
				}
				grid[i][j] = Math.min(min, grid[(ax+i)%M][(ay+j)%N]);
			}
			
		}

		System.out.println(grid[bx][by]);
	}
	
}
