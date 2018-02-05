package kattis;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bishop {
	public static void main(String[] args) throws Exception{
		BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
		String l = "";
		while((l = b.readLine())!=null) {
			int c = Integer.parseInt(l);
			if (c == 1) {
				System.out.println(1);
				continue;
			}
			System.out.println(2*(c-1));
		}
		
	}
}
