package minesPractice1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class B {
	public static void main(String[] args) throws Exception {
		HashMap<String, Character> asc = new HashMap<>();
		String zero = "xxxxx"+"x...x"+"x...x"+"x...x"+"x...x"+"x...x"+"xxxxx";
		String one = "....x"+"....x"+"....x"+"....x"+"....x"+"....x"+"....x";
		String two = "xxxxx"+"....x"+"....x"+"xxxxx"+"x...."+"x...."+"xxxxx";
		String three = "xxxxx"+"....x"+"....x"+"xxxxx"+"....x"+"....x"+"xxxxx";
		String four = "x...x"+"x...x"+"x...x"+"xxxxx"+"....x"+"....x"+"....x";
		String five = "xxxxx"+"x...."+"x...."+"xxxxx"+"....x"+"....x"+"xxxxx";
		String six = "xxxxx"+"x...."+"x...."+"xxxxx"+"x...x"+"x...x"+"xxxxx";
		String seven = "xxxxx"+"....x"+"....x"+"....x"+"....x"+"....x"+"....x";
		String eight = "xxxxx"+"x...x"+"x...x"+"xxxxx"+"x...x"+"x...x"+"xxxxx";
		String nine = "xxxxx"+"x...x"+"x...x"+"xxxxx"+"....x"+"....x"+"xxxxx";
		String plus = "....."+"..x.."+"..x.."+"xxxxx"+"..x.."+"..x.."+".....";
		
		asc.put(zero, '0');
		asc.put(one, '1');
		asc.put(two, '2');
		asc.put(three, '3');
		asc.put(four, '4');
		asc.put(five, '5');
		asc.put(six, '6');
		asc.put(seven, '7');
		asc.put(eight, '8');
		asc.put(nine, '9');
		asc.put(plus, '+');
		
		HashMap<Character, String> reverse = new HashMap<>();
		reverse.put('0', zero);
		reverse.put('1', one);
		reverse.put('2', two);
		reverse.put('3', three);
		reverse.put('4', four);
		reverse.put('5', five);
		reverse.put('6', six);
		reverse.put('7', seven);
		reverse.put('8', eight);
		reverse.put('9', nine);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		for (int i = 0; i < 7; i++){
			line += br.readLine();
		}
		int N = line.length()/7;
		int n = (N+1)/6;
		String[] vars = new String[n];
		for (int i=0; i < n; i++){
			vars[i]="";
			for (int j = 0; j < 7; j++){
				vars[i] += line.substring(j*N + i*6, j*N + i*6 + 5); 
			}
		}
		
		String expr = "";
		for (int i = 0; i < n; i++){
			expr += Character.toString((asc.get(vars[i])));
		}
		
		String[] nums = expr.split("\\+");
		int total = Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]);
		
		String t = Integer.toString(total);
		String temp;
		for(int i = 0; i < 7; i++){
			temp = "";
			for(int j = 0; j < t.length(); j++){
				temp += reverse.get(t.charAt(j)).substring(i*5, i*5 + 5) + ".";
			}
			temp = temp.substring(0, temp.length() - 1);
			System.out.println(temp);
		}
	}
}
