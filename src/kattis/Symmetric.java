package kattis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Symmetric {
	public static void main(String[] args) throws Exception {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		String l = "";
		int c = 0;
		while (true) {
			c++;
			l = b.readLine();
			if (l.equals("0")) break;
			int n = Integer.parseInt(l);
			ArrayList<String> set = new ArrayList<String>();
			for (int i = 0; i < n; i++) {
				set.add(b.readLine());
			}
			ArrayList<String> out = new ArrayList<String>();
			for(int i = 0; i < n; i+=2) {
				out.add(set.get(i));
			}
			if (n%2 != 0) n--;
			for(int i = n-1; i > 0; i-=2) {
				out.add(set.get(i));
			}
			
			System.out.println("SET " + c);
			for(String s : out) {
				System.out.println(s);
			}
		}
	}
}
