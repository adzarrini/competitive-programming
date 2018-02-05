package kattis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BottledUp {
	public static void main(String[] args) throws Exception {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(b.readLine());
		int S = Integer.parseInt(s.nextToken());
		int v1 = Integer.parseInt(s.nextToken());
		int v2 = Integer.parseInt(s.nextToken());
		
		int n = S/v1;
		int o1 = -1;
		int o2 = -1;
		for (int i = n; i >= 0; i--) {
			int temp = S - i*v1;
			if (temp%v2 == 0) {
				o1 = i;
				o2 = temp/v2;
				break;
			}
		}
		if(o1 < 0) System.out.println("Impossible");
		else System.out.println(o1 + " " + o2);
	}

}
