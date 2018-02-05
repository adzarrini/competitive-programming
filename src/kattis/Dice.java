package kattis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Dice {
	public static void main(String[] args) throws Exception {
		HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(b.readLine());
		int N = Integer.parseInt(s.nextToken());
		int M = Integer.parseInt(s.nextToken());
		for(int i = 2; i  <= N+M; i++) {
			m.put(i, 0);
		}
		for(int i = 1; i <= N; i++) {
			for (int j = 1; j <= M; j++) {
				m.put(i+j, m.get(i+j)+1);
			}
		}
		int mVal = 0;
		for (int f : m.keySet()) {
			if (m.get(f) > mVal) mVal = m.get(f);
		}
		for (int f : m.keySet()) {
			if (m.get(f) == mVal) System.out.println(f);
		}
	}
}
