package sp18Set4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// Battle Simulation
public class J {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String l = br.readLine();
		String out = "";
		for(int i = 0; i < l.length(); i++) {
			if(l.charAt(i) == 'R') out += 'S';
			if(l.charAt(i) == 'B') out += 'K';
			if(l.charAt(i) == 'L') out += 'H';
			
			String temp = "";
			if (i < l.length() - 2) temp = l.substring(i, i+3);
			else temp = l.substring(i);
			
			for(int j = 0; j < temp.length(); j++) {
				
			}
			if(temp.contains("R") && temp.contains("B") && temp.contains("L")) {
				out += 'C';
				i += 2;
			}
			else {
				if(i == out.length()-3) {
					out += temp;
					break;
				}
				else out += temp.charAt(0);
			}
			
			
		}

		bw.write(out);
		bw.flush();
	}

}
