package sp18Set4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

// Engineering English
public class I {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		HashSet<String> set = new HashSet<String>();
		while((line=br.readLine())!=null) {
			StringTokenizer s = new StringTokenizer(line);
			while(s.hasMoreTokens()) {
				String l1 = s.nextToken();
				String l = l1.toLowerCase();
				if (set.contains(l)) {
					System.out.print(".");
				}
				else {
					set.add(l);
					System.out.print(l1);
				}
				
				if(s.hasMoreTokens()) {
					System.out.print(" ");
				}
				else{
					System.out.println();
				}
			}
			
		}

	}

}
