package kattis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bee {

	public static void main(String[] args) throws Exception {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		String l  = "";
		while (true) {
			l = b.readLine();
			if(l.equals("0 0")) break; 
			StringTokenizer s = new StringTokenizer(l);
			int w = Integer.parseInt(s.nextToken());
			int o = Integer.parseInt(s.nextToken());
			if((w+o) == 13) System.out.println("Never speak again.");
			else if(w > o) System.out.println("To the convention.");
			else if(w < o) System.out.println("Left beehind.");
			else System.out.println("Undecided.");
		}
	}
}
