package kattis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Bela {
	public static void main(String[] args) throws Exception {
		HashMap<Character, Integer> dominant = new HashMap<Character, Integer>();
		HashMap<Character, Integer> notD = new HashMap<Character, Integer>();
		dominant.put('A', 11); dominant.put('K', 4); dominant.put('Q', 3); dominant.put('J', 20);
		dominant.put('T', 10); dominant.put('9', 14); dominant.put('8', 0); dominant.put('7', 0);
		notD.put('A', 11); notD.put('K', 4); notD.put('Q', 3); notD.put('J', 2);
		notD.put('T', 10); notD.put('9', 0); notD.put('8', 0); notD.put('7', 0);
		
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(b.readLine());
		int N = Integer.parseInt(s.nextToken());
		char B = s.nextToken().charAt(0);
		String l = "";
		int tot = 0;
		for(int i = 0; i < 4*N; i++) {
			l = b.readLine();
			if (l.charAt(1) == B) tot += dominant.get(l.charAt(0));
			else tot += notD.get(l.charAt(0));
		}
		System.out.println(tot);
	}
}
