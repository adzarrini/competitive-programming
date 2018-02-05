package kattis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class Grass {
	public static void main(String[] args) throws Exception {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		double C = Double.parseDouble(b.readLine());
		int n = Integer.parseInt(b.readLine());
		double A = 0;
		for (int i = 0; i < n; i++) {
			StringTokenizer s= new StringTokenizer(b.readLine());
			A += Double.parseDouble(s.nextToken())*Double.parseDouble(s.nextToken());
		}
		A*=C;
		System.out.println(new DecimalFormat("#0.0000000").format(A));
	}
}
