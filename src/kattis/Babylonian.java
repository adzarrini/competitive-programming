package kattis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Babylonian {
	public static void main(String[] args) throws Exception {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(b.readLine());
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> com = new ArrayList<Integer>();
			String l = b.readLine();
			int p = 0;
			for (int j = l.length()-1; j >= 0; j--) {
				if (l.charAt(j) == ',') {
					com.add(j);
					continue;
				}
			}
			com.add(-1);
			int num[] = new int[com.size()];
			if (com.isEmpty()) num[0] = Integer.parseInt(l);
			else if (l.charAt(l.length()-1) != ',') num[0] = Integer.parseInt(l.substring(com.get(0)+1));
			else num[0] = 0;
			for (int j = 1; j < com.size(); j++) {
				if (l.substring(com.get(j)+1, com.get(j-1)).length() > 0) num[j] = Integer.parseInt(l.substring(com.get(j)+1, com.get(j-1)));
				else num[j] = 0;
			}
			long out = 0;
			for (int j = 0; j < num.length; j++) {
				out+= Math.pow(60, j) * num[j];
			}
			System.out.println(out);
		}
	}
}
