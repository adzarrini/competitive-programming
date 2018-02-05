package kattis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Akcija {
	public static void main(String[] args) throws Exception {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(b.readLine());
		Integer books[] = new Integer[n];
		for (int i = 0; i < n; i++){
			books[i] = Integer.parseInt(b.readLine());
		}
		Arrays.sort(books, Collections.reverseOrder());
		int sum = books[0];
		for (int i = 1; i < n; i++) {
			if ((i+1) % 3 == 0) continue;
			sum += books[i];
		}
		System.out.println(sum);
		
	}
}
