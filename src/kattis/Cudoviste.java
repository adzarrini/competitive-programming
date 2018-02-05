package kattis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Cudoviste {
	public static void main(String[] args) throws Exception {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		String line = b.readLine();
		StringTokenizer s = new StringTokenizer(line);
		int R = Integer.parseInt(s.nextToken());
		int C = Integer.parseInt(s.nextToken());
		String[] grid = new String[R];
		for (int i = 0; i < R; i++) {
			grid[i] = b.readLine();
		}
		
		int cars[] = new int[5];
		for (int i = 0; i < R-1; i++) {
			for (int j = 0; j < C-1; j++) {
				String t = "";
				t += grid[i].substring(j, j+2);
				t += grid[i+1].substring(j, j+2);
				for (int k = 0; k < 5; k++) {
					if (t.contains("#")) break;
					String temp = t;
					temp = temp.replace("X", "");
					if ((t.length() - temp.length()) == k) {
						cars[k]++;
					}
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(cars[i]);
		}
		
	}

}
