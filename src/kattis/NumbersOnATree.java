package kattis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumbersOnATree {
	public static void main(String[] args) throws Exception {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s= new StringTokenizer(b.readLine());
		
		int H = Integer.parseInt(s.nextToken());
		long n = (long) Math.pow(2, H+1)-1;
		
		if(s.hasMoreTokens()) {
			String d = s.nextToken();
			long index = 1;
			for (int i = 0; i < d.length(); i++) {
				index *= 2;
				if (d.charAt(i) == 'R') index++;
			}
			System.out.println(n-index+1);
		}
		else {
			System.out.println(n);
		}

	}

}
