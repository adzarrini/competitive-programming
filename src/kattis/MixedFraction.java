package kattis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MixedFraction {
	public static void main(String[] args) throws Exception {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		while(true) {
			line = b.readLine();
			if (line.equals("0 0")) break;
			StringTokenizer s = new StringTokenizer(line);
			int n = Integer.parseInt(s.nextToken());
			int m = Integer.parseInt(s.nextToken());
			System.out.println(Integer.toString(n/m) + " " + Integer.toString(n%m) + " / " + Integer.toString(m));
		}
	}
}
