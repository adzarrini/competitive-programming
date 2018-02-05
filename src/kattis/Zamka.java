package kattis;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zamka {
	public static void main(String[] args) throws Exception {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(b.readLine());
		int D = Integer.parseInt(b.readLine());
		int X = Integer.parseInt(b.readLine());
		
		int N = 0;
		int M = 0;
		
		boolean first = true;
		for (int i = L; i <= D; i++) {
			int s = sum(i);
			if(s == X) {
				M = i;
				if(first) {
					N = i;
					first = false;
				}
			}
		}
		System.out.println(N);
		System.out.println(M);

	}
	
	public static int sum(int n) {
		int sum = 0;
		while(n > 0) {
			sum += n%10;
			n /= 10;
		}
		return sum;
	}

}
