package kattis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class CharacterDevelopment {
	public static void main(String[] args) throws Exception {
		BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(b.readLine());
		if (n == 1 || n == 0) {
			System.out.println(0);
			return;
		}
		BigInteger out = new BigInteger("1");
		for(int i = 2; i < n; i++) {
			BigInteger t = new BigInteger("1");
			for(int j = 2; j <= n; j++) {
				t = t.multiply(new BigInteger(Integer.toString(j)));
			}
			for(int j = 2; j <= (n-i); j++) {
				t = t.divide(new BigInteger(Integer.toString(j)));
			}
			for(int j = 2; j <= i; j++) {
				t = t.divide(new BigInteger(Integer.toString(j)));
			}
			
			out = out.add(t);
		}
		System.out.println(out.toString());
	}

}
