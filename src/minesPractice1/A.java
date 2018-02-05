package minesPractice1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class A {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String ab = " Abracadabra";
		for (int i = 1; i <= n; ++i){
			System.out.println(i + ab);
		}		
	}
}
