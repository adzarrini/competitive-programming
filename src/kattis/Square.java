package kattis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Square {
	public static void main(String[] args) throws Exception {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		ArrayList<Integer> x = new ArrayList<Integer>();
		ArrayList<Integer> y = new ArrayList<Integer>();
		int minx = Integer.MAX_VALUE;
		int miny = Integer.MAX_VALUE;
		for(int i = 0; i < 3; i++) {
			StringTokenizer s = new StringTokenizer(b.readLine());
			int x1 = Integer.parseInt(s.nextToken());
			int y1 = Integer.parseInt(s.nextToken());
			x.add(x1); y.add(y1);
		}
		for (int i = 0; i < 3; i++) {
			minx = Math.min(minx, Math.abs(x.get(i)-x.get((i+1)%3)));
			miny = Math.min(miny, Math.abs(y.get(i)-y.get((i+1)%3)));
		}
		System.out.println(minx + " " + miny);
	}
}
