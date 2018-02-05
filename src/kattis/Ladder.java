package kattis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ladder {
	public static void main(String[] args) throws Exception {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(b.readLine());
		
		int h = Integer.parseInt(s.nextToken());
		int v = Integer.parseInt(s.nextToken());
		
		int l = (int) Math.ceil((double) h/ Math.sin(Math.toRadians(v)));
		System.out.println(l);
	}
}
