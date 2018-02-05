package kattis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Skener {
	public static void main(String[] args) throws Exception {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(b.readLine());
		
		int R = Integer.parseInt(s.nextToken());
		int C = Integer.parseInt(s.nextToken());
		int Zr = Integer.parseInt(s.nextToken());
		int Zc = Integer.parseInt(s.nextToken());
		char[][] grid = new char[R*Zr][C*Zc];
		for (int i = 0; i < R; i++) {
			String temp = b.readLine();
			for (int j = 0; j < C; j++) {
				char t = temp.charAt(j);
				for (int l = 0; l < Zr; l++) {
					for (int k = 0; k < Zc; k++) {
						grid[i*Zr+l][j*Zc + k] = t;
					}
				}
			}
		}
		
		for(int i = 0; i < R*Zr; i++) {
			for (int j = 0; j < C*Zc; j++) {
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}
	}
}
