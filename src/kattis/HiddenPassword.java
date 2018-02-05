package kattis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class HiddenPassword {
	public static void main(String[] args) throws Exception {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(b.readLine());
		String c = s.nextToken();
		String m = s.nextToken();
		int[] index = new int[c.length()];
		for (int i = 0; i < c.length(); i++) {
			index[i] = -1;
			for(int j = 0; j < m.length(); j++) {
				if(c.charAt(i) == m.charAt(j)) {
					index[i] = j;
					m = new StringBuffer(m).replace(j, j+1, "!").toString();
					break;
				}
			}
		}
		boolean p = true;
		for (int i = 0; i < index.length-1; i++) {
			if(index[i] < 0) p = false;
			if (index[i+1] < index[i]) p = false;
		}
		if(p) System.out.println("PASS");
		else System.out.println("FAIL");


	}

}
