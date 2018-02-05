package kattis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Cannon {
	public static void main(String[] args) throws Exception {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(b.readLine());
		for (int i = 0; i < N; i++) {
			StringTokenizer s = new StringTokenizer(b.readLine());
			double v = Double.parseDouble(s.nextToken());
			double theta = Double.parseDouble(s.nextToken());
			double x = Double.parseDouble(s.nextToken());
			double h1 = Double.parseDouble(s.nextToken());
			double h2 = Double.parseDouble(s.nextToken());
			
			double t = x/(v*Math.cos(Math.toRadians(theta)));
			double y = v*t*Math.sin(Math.toRadians(theta)) - 0.5*t*t*9.81;
			
			if (y > (h1+1) && y < (h2-1)) System.out.println("Safe");
			else System.out.println("Not Safe");
		}
	}
}
