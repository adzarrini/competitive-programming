package kattis;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ABC {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] l = br.readLine().split("\\s+");
		String line = br.readLine();
		int a = Integer.parseInt(l[0]);
		int b = Integer.parseInt(l[1]);
		int c = Integer.parseInt(l[2]);
		int C = Math.max(a, Math.max(b, c));
		int A = Math.min(a, Math.min(b, c));
		int B = a + b + c - A - C;
		String out = "";
		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) == 'A') {
				out += Integer.toString(A) + " ";
			}
			if (line.charAt(i) == 'B') {
				out += Integer.toString(B) + " ";
			}
			if (line.charAt(i) == 'C') {
				out += Integer.toString(C) + " ";
			}
		}
		System.out.println(out.substring(0, out.length()-1));
		
	}

}
