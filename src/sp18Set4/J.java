package sp18Set4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// Battle Simulation
public class J {
	
	public static boolean stringCompare(String a) {
		boolean same = true;
		if(a.charAt(0) == a.charAt(1) || a.charAt(1) == a.charAt(2) || a.charAt(2) == a.charAt(0)) same = false;
		return same;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String l = br.readLine();
		for(int i = 0; i < l.length(); i++) {
			if (i < l.length() - 2 && stringCompare(l.substring(i, i+3))) {
				bw.write('C');
				i += 2;
			}		
			else {
				switch(l.charAt(i)) {
				case 'R': 
					bw.write('S');
					break;
				case 'B': 
					bw.write('K');
					break;
				case 'L': 
					bw.write('H');
					break;
				}
			}
		}

		bw.flush();
	}
}
