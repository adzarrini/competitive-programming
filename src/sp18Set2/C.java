package sp18Set2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

// Polish Notation
public class C {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String l = "";
		int counter = 0;
		while((l = br.readLine())!=null) {
			counter++;
			StringTokenizer s = new StringTokenizer(l);
			ArrayList<String> token = new ArrayList<>();
			while(s.hasMoreTokens()) {
				token.add(s.nextToken());
			}
			
			Stack<String> ops = new Stack<>();
			String ans = "";
			while(true) {
				for(int i = token.size()-1; i >= 0; i--) {
					if (token.get(i).equals("+") || token.get(i).equals("-") || token.get(i).equals("*")) {
						//System.out.println(token.get(i));
						ops.push(simplify(token.get(i), ops.pop(), ops.pop()));
					}
					else {
						ops.push(token.get(i));
					}
					//System.out.println(ops.toString());
				}
				if (ops.size() == 1) break;
			}
			

			
			ans = ops.pop();
			
			System.out.print("Case " + counter + ": ");
			System.out.println(ans);
			
		}
		

	}
	
	public static String simplify(String op, String e1, String e2) {
		if(!op.equals("+") && !op.equals("-") && !op.equals("*")) return op + " " + e1 + " " + e2;
		if(!e1.matches("-?\\d+")) return op + " " + e1 + " " + e2;
		if(!e2.matches("-?\\d+")) return op + " " + e1 + " " + e2;
		
		int out = 0;
		switch (op){
		case "*": out = Integer.parseInt(e1) * Integer.parseInt(e2); break;
		case "+": out = Integer.parseInt(e1) + Integer.parseInt(e2); break;
		case "-": out = Integer.parseInt(e1) - Integer.parseInt(e2); break;
		}
		
		return Integer.toString(out);
	}
	
	

}
