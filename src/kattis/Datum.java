package kattis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Datum {
	public static void main(String[] args) throws Exception {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s= new StringTokenizer(b.readLine());
		int d = Integer.parseInt(s.nextToken());
		int m = Integer.parseInt(s.nextToken());
		
		HashMap<Integer,Integer> month = new HashMap<Integer,Integer>();
		HashMap<Integer,String> day = new HashMap<Integer,String>();
		day.put(1, "Thursday"); day.put(2, "Friday"); day.put(3, "Saturday"); day.put(4, "Sunday");
		day.put(5, "Monday"); day.put(6, "Tuesday"); day.put(0, "Wednesday");
		month.put(1, 0); month.put(2, 31); month.put(3, 59); month.put(4, 90); month.put(5, 120); month.put(6, 151);
		month.put(7, 181); month.put(8, 212); month.put(9, 243); month.put(10, 273); month.put(11, 304); month.put(12, 334);
		
		int sum = month.get(m) + d;
		System.out.println(day.get(sum%7));

	}

}
