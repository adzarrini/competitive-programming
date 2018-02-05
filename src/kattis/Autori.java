package kattis;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Autori {
	public static void main(String[] args) throws Exception {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		String[] init = b.readLine().split("-");
		for (int i = 0; i < init.length; i++) {
			System.out.print(init[i].charAt(0));
		}
	}
}
