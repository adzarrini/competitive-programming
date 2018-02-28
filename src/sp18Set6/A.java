package sp18Set6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

//Secret Chamber at Mount Rushmore
public class A {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(s.nextToken());
		int n = Integer.parseInt(s.nextToken());
		Map<Character,ArrayList<Character>> trans = new HashMap<>();
		for (int i = 0; i < m; i++) {
			s = new StringTokenizer(br.readLine());
			char a = s.nextToken().charAt(0);
			if (trans.containsKey(a)) {
				ArrayList<Character> temp = trans.get(a);
				temp.add(s.nextToken().charAt(0));
				trans.put(a, temp);
			}
			else {
				ArrayList<Character> temp = new ArrayList<>();
				temp.add(s.nextToken().charAt(0));
				trans.put(a, temp);
			}
		}
		Map<Character, ArrayList<Character>> tran2 = new HashMap<>();
		for (char c : trans.keySet()) {
			Stack<Character> st = new Stack<>();
			ArrayList<Character> visited = new ArrayList<>();
			st.add(c);
			while(!st.empty()) {
				char u = st.pop();
				if(!visited.contains(u)) {
					visited.add(u);
					if(trans.containsKey(u)) {
						for (char c1 : trans.get(u)) {
							if(!visited.contains(c1)) st.add(c1);
						}
					}
				}
			}
			tran2.put(c, visited);			
		}
		//System.out.println(tran2.toString());
		
		boolean pass = true;
		for (int i = 0; i < n; i++) {
			s = new StringTokenizer(br.readLine());
			String s1 = s.nextToken();
			String s2 = s.nextToken();
			if (s1.length() != s2.length()) pass = false;
			else {
				for (int j = 0; j < s1.length(); j++) {
					char a = s1.charAt(j);
					char b = s2.charAt(j);
					if(tran2.containsKey(a)) {
						ArrayList<Character> temp = tran2.get(a);
						pass = temp.contains(b);
					}
					else pass = compare(a,b);
					
					if(!pass) break;
				}
			}
			if(pass) System.out.println("yes");
			else System.out.println("no");
		}
	}
	
	public static boolean compare(char a, char b) {
		return a == b;
	}
	
>>>>>>> 508fa22174d957ed6ec5a1436be899a719c64a81
}
