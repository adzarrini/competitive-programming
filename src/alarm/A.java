package alarm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class A {
	public static void main(String[] args) {
		int arr[] = {10, 100,300,200,1000,20,30};
		minUnfairness(3, arr);
		
	}
	
	static String isPangram(String[] strings) {
		int n = Integer.parseInt(strings[0]);
		Set<Character> letter = new HashSet<>();
		String out = "";
		for (int i = 1; i < strings.length; i++) {
			String line = strings[i].replaceAll("\\s+", "");
			for (int j = 0; j < line.length(); j++) {
				letter.add(line.charAt(j));
			}
			if (letter.size() == 26) out += "1";
			else out += "0";
			letter.clear();
		}
		return out;
    }
	
	static int minUnfairness(int k, int[] arr) {
		Arrays.sort(arr);
		int unfair = Integer.MAX_VALUE;
		for (int i = k-1; i < arr.length; i++) {
			unfair = Math.min(unfair, arr[i]-arr[i-k+1]);
		}
		return unfair;
    }
	
	static void superStack(String[] operations) {
		ArrayList<Integer> supStack = new ArrayList<>();
		for (int i = 0; i < operations.length; i++) {
			StringTokenizer s = new StringTokenizer(operations[i]);
			switch (s.nextToken()) {
			case "push":
				int val = Integer.parseInt(s.nextToken());
				supStack.add(val);
				break;
			case "pop":
				supStack.remove(0);
				break;
			case "inc":
				int num = Integer.parseInt(s.nextToken());
				int inc = Integer.parseInt(s.nextToken());
				for (int j = supStack.size()-num; j < supStack.size(); j++) {
					supStack.set(j, supStack.get(j)+inc);
				}
			}
		}
		
    }
	
	
}
