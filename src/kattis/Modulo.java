package kattis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Modulo {
	public static void main(String[] args) throws Exception {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		HashSet<Integer> s = new HashSet<Integer>();
		while((line = b.readLine()) != null) {
			int n = Integer.parseInt(line);
			s.add(n%42);
			
		}
		System.out.println(s.size());
	}
}
