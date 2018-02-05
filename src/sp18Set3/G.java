package sp18Set3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;
// Anagram Counting
public class G {
	public static void main(String[] args) throws Exception  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		while((line = br.readLine())!=null) {
			int n = line.length();
			HashMap<Character,Integer> m = new HashMap<Character,Integer>();
			for (int i = 0; i < n; i++) {
				if (m.containsKey(line.charAt(i))) {
					m.put(line.charAt(i),m.get(line.charAt(i))+1);
				}
				else {
					m.put(line.charAt(i), 1);
				}
			}
			BigInteger out = BigInteger.ONE;
			for (int i = n; i > 1; --i) {
				out = out.multiply(new BigInteger("" + i));
			}
			for (char c: m.keySet()) {
				for (int i = 1; i <= m.get(c); i++) {
					out = out.divide(new BigInteger(""+i));
				}
			}
			System.out.println(out.toString());
		}
	}

}
