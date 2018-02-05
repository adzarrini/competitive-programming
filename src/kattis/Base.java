package kattis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Base {
	public static void main(String[] args) throws Exception {
		HashMap<Integer, String> base = new HashMap<Integer, String>();
		HashMap<String, Integer> val = new HashMap<String,Integer>();
		for (int i = 1; i <= 36; i++) {
			if (i < 10) {
				base.put(i, Integer.toString(i));
				val.put(Integer.toString(i), i);
			}
			else {
				base.put(i, Character.toString((char) ('a' + i - 10)));
				val.put(Character.toString((char) ('a'+i-10)), i);
			}
		}
		base.put(36, "0");
		val.put("0", 0);
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(b.readLine());
		for (int i = 0; i < n ; i++) {
			StringTokenizer s = new StringTokenizer(b.readLine());
			String x = s.nextToken();
			String op = s.nextToken();
			String y = s.nextToken();
			s.nextToken();
			String z = s.nextToken();
			String max = "";
			int great = 0;
			for(int k = 0; k < x.length(); k++) {
				int cur = (int)x.charAt(k);
				if (cur > great) {
					great = cur;
				}
				max = Character.toString((char) great);
			}
			for(int k = 0; k < y.length(); k++) {
				int cur = (int)y.charAt(k);
				if (cur > great) {
					great = cur;
				}
				max = Character.toString((char) great);
			}
			for(int k = 0; k < z.length(); k++) {
				int cur = (int)z.charAt(k);
				if (cur > great) {
					great = cur;
				}
				max = Character.toString((char) great);
			}
			String out = "";
			for (int j = 1; j <= 36; j++) {
				int x1 = 0;
				int y1 = 0;
				int z1 = 0;
				for(int k = 0; k < x.length(); k++) {
					x1 += val.get(Character.toString(x.charAt(k)))*Math.pow(j, x.length()-1-k);
				}
				for(int k = 0; k < y.length(); k++) {
					y1 += val.get(Character.toString(y.charAt(k)))*Math.pow(j, y.length()-1-k);
				}
				for(int k = 0; k < z.length(); k++) {
					z1 += val.get(Character.toString(z.charAt(k)))*Math.pow(j, z.length()-1-k);
				}
				switch (op) {
				case "+": 
					if(x1 + y1 == z1) out+= base.get(j);
					break;
				case "-": 
					if(x1 - y1 == z1) out+= base.get(j);
					break;
				case "*": 
					if(x1 * y1 == z1) out+= base.get(j);
					break;
				case "/": 
					if(x1 / y1 == z1) out+= base.get(j);
					break;
				}
			}
			if (out.isEmpty()) System.out.println("invalid");
			else System.out.println(out);
		}

	}

}
