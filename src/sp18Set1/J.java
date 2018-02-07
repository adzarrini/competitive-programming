package sp18Set1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		int c = 0;
		while((line = br.readLine()) != null) {
			c++; 
			
			StringTokenizer s = new StringTokenizer(line);
			int m = Integer.parseInt(s.nextToken());
			int n = Integer.parseInt(s.nextToken());
			char grid[][] = new char[m][n];
			for (int i = 0; i < m; i++) {
				line = br.readLine();
				for (int j = 0; j < n; j++) {
					grid[i][j] = line.charAt(j);
				}
			}
			
			int star = 0;
			
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					if (grid[i][j] == '-') {
						star++;
						fillStar(grid, i, j);
					}
				}
			}

			
			System.out.print("Case " + c + ": ");
			System.out.println(star);	
			
		}

	}
	
	public static void fillStar(char grid[][], int p, int q) {
		grid[p][q] = '#';
		if (p > 0 && grid[p-1][q] == '-') fillStar(grid, p-1, q);
		if (p < grid.length-1 && grid[p+1][q] == '-') fillStar(grid, p+1, q);
		if (q > 0 && grid[p][q-1] == '-') fillStar(grid, p, q-1);
		if (q < grid[p].length-1 && grid[p][q+1] == '-') fillStar(grid, p, q+1);
		
		return;

	}

}
