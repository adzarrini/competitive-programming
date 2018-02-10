package sp18Set5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
// Falling Apart
public class D {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		ArrayList<Integer> c = new ArrayList<Integer>();
		StringTokenizer s = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			c.add(Integer.parseInt(s.nextToken()));
		}
		Collections.sort(c);
		Collections.reverse(c);
		for(int i = 0; i < n; i++) {
			if(i%2 == 0) a.add(c.get(i));
			if(i%2 == 1) b.add(c.get(i));
		}
		int sumA = 0;
		int sumB = 0;
		for(int i = 0; i < a.size(); i++) {
			sumA += a.get(i);
			if(i == b.size()) continue;
			sumB += b.get(i);
		}
		System.out.println(sumA + " " + sumB);
	}
}
