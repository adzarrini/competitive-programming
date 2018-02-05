package kattis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Cetiri {

	public static void main(String[] args) throws Exception {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(b.readLine());
		int[] num = new int[4];
		
		for (int i = 0; i < 3; i++) {
			num[i] = Integer.parseInt(s.nextToken());
		}
		Arrays.sort(num);
		int diff = Math.min(num[2]-num[1], num[3] - num[2]);
		num[0] = 200;
		Arrays.sort(num);
		for (int i = 0; i < 3; i++) {
			if(num[i+1] - num[i] != diff) {
				if (num[i] + diff > 100) {
					System.out.println(num[0] - diff);
				}
				else System.out.println(num[i] + diff);
				break;
			}
		}
	}
}
