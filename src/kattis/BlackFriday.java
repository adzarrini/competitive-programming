package kattis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BlackFriday {
	public static void main(String[] args) throws Exception {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(b.readLine());
		StringTokenizer s= new StringTokenizer(b.readLine());
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> c = new ArrayList<Integer>();
		HashSet<Integer> d = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			int t = Integer.parseInt(s.nextToken());
			c.add(t);
			if(a.contains(t)) {
				a.remove(new Integer(t));
				d.add(t);
			}
			else {
				if(!d.contains(t))
				a.add(t);
			}
		}
		if(a.isEmpty()) System.out.println("none");
		else {
			Collections.sort(a);
			Collections.reverse(a);
			System.out.println(c.indexOf(a.get(0))+1);
		}
	}

}
