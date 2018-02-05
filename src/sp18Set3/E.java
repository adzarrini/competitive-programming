package sp18Set3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
// Words for Numbers
public class E {	
	public static void main(String[] args) throws Exception {
		HashMap<Integer, String> m = new HashMap<Integer,String>();
		m.put(0, "zero"); m.put(1, "one"); m.put(2, "two"); m.put(3, "three"); m.put(4, "four"); m.put(5, "five"); m.put(6, "six"); m.put(7, "seven"); m.put(8, "eight") ;
		m.put(9, "nine"); m.put(10, "ten"); m.put(11, "eleven"); m.put(12, "twelve"); m.put(13, "thirteen"); m.put(14, "fourteen"); m.put(15, "fifteen"); 
		m.put(16, "sixteen"); m.put(17, "seventeen"); m.put(18, "eighteen"); m.put(19, "nineteen"); m.put(20, "twenty"); m.put(30, "thirty"); m.put(40, "forty"); 
		m.put(50, "fifty"); m.put(60, "sixty"); m.put(70, "seventy"); m.put(80, "eighty"); m.put(90, "ninety"); 

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String l = "";
		while((l=br.readLine())!=null) {
			String num = "";
			String out = l;
			int loc = 0;
			for (int i = 0; i < l.length(); i++) {
				if (Character.isDigit(l.charAt(i))) {
					if(i == l.length()-1) num = l.substring(i, i+1);
					else num = l.substring(i, i+2);
					num = num.trim();
					String inte = "";
					int val = Integer.parseInt(num);
					if (num.length() == 2 && val >= 20 && val%10 != 0) {
						inte = m.get(Integer.parseInt(("" + num.charAt(0)))*10) + "-" + m.get(Integer.parseInt(""+num.charAt(1)));
					}
					else {
						inte = m.get(val);
						if (num.length() == 1) inte += " ";
					}
					if(i == 0) {
						inte =  inte.substring(0, 1).toUpperCase() + inte.substring(1);
						out = inte + out.substring(2);
					}
					else {
						if (i == l.length()-1) out = out.substring(0, loc + i) + inte + out.substring(loc+i+1);
						else out = out.substring(0, loc + i) + inte + out.substring(loc+i+2);
					}
					loc += inte.length()-2;
					
					i++;
				}
			}
			System.out.println(out);
		}
	}
}
