package kattis;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Kemija {

	public static void main(String[] args) throws Exception {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		String l = b.readLine();
		for(int i = 0; i < l.length(); i++) {
			if (l.charAt(i) == 'a' || l.charAt(i) == 'e' || l.charAt(i) == 'i' || l.charAt(i) == 'o' || l.charAt(i) == 'u') {
				l = new StringBuffer(l).replace(i+1, i+3, "").toString();
			}
		}
		System.out.println(l);
	}

}
