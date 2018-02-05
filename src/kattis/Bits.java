package kattis;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bits {
	public static void main(String[] args) throws Exception{
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(b.readLine());
		for (int i = 0; i < n; i++) {
			String l = b.readLine();
			int out = 0;
			for (int j = 0; j < l.length(); j++) {
				out = Math.max(out, Integer.toBinaryString(Integer.parseInt(l.substring(0, j+1))).replace("0", "").length());
			}
			System.out.println(out);
		}
	}
}
