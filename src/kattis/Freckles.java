package kattis;

import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class Freckles {
	public static void main(String[] args) throws Exception {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(b.readLine());
		for(int i = 0; i < n; i++) {
			b.readLine();
			int m = Integer.parseInt(b.readLine());
			double[][] adj = new double[m][m];
			Point2D.Double[] p = new Point2D.Double[m];
			for (int j = 0; j < m; j++) {
				StringTokenizer s = new StringTokenizer(b.readLine());
				p[j] = new Point2D.Double(Double.parseDouble(s.nextToken()), Double.parseDouble(s.nextToken()));
			}
			for(int j = 0; j < m; j++) {
				for(int k = j+1; k < m; k++) {
					adj[j][k] = Point2D.distance(p[j].getX(), p[j].getY(), p[k].getX(), p[k].getY());
					adj[k][j] = adj[j][k];
				}
			}
			double[] mst = new double[m];

			double out = 0;
			for (int j = 1; j < m; j++) {
				mst[j] = adj[0][j];
			}
			for (int j = 1; j < m; j++) {
				int index = -1;
				double min = Double.MAX_VALUE;
				for (int k = 0; k < m; k++) {
					if (mst[k] != 0) {
						if (mst[k] < min) {
							min = mst[k];
							index = k;
						}
					}
				}
				out += min;
				for (int k = 0; k < m; k++) {
					mst[k] = Math.min(mst[k], adj[index][k]);
				}
			}
			System.out.printf("%.2f",out);
			System.out.println();
		}
	}
}
