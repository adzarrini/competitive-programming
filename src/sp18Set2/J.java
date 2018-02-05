package sp18Set2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

// Quick Brown Fox
public class J {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			ArrayList<Character> alph = new ArrayList<Character>();
			for (int j = 0; j < 26; j++) {
				alph.add((char) ('a' + j));
			}
			
			String l = br.readLine();
			for (int j = 0; j < l.length(); j++) {
				char t = Character.toLowerCase(l.charAt(j));
				if (alph.contains(t)) {
					alph.remove(alph.indexOf(t));
				}
			}
			if (alph.isEmpty()) System.out.println("pangram");
			else {
				System.out.print("missing ");
				for (int j = 0; j < alph.size(); j++) {
					System.out.print(alph.get(j));
				}
				System.out.println();
			}
		}
	}
}
