package sp18Set7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Progressive Scramble
public class F {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++) {

			String line = br.readLine();
			String out;
			if(line.charAt(0) == 'e') {
				out = encrypt(line.substring(2));
			}
			else out = decrypt(line.substring(2));
			System.out.println(out);
		}

	}
	
	public static String encrypt(String mes) {
		int[] u = new int[mes.length()];
		u[0] = (int) mes.charAt(0) -'a' + 1;
		if(mes.charAt(0) == ' ') u[0] = 0;
		for(int i = 1; i < mes.length(); i++) {
			u[i] = u[i-1] + mes.charAt(i) - 'a' + 1;
			if (mes.charAt(i) == ' ') u[i] = u[i-1];
		}
		String out = "";
		for(int i = 0; i < mes.length(); i++) {
			if(u[i]%27 == 0) {
				out += ' ';
				continue;
			}
			out += (char)('a' + u[i]%27 - 1);
			
		}

		
		return out;
	}
	
	public static String decrypt(String mes) {
		int[] v = new int[mes.length()];
		v[0] = (int) mes.charAt(0) -'a' + 1;
		if(mes.charAt(0) == ' ') v[0] = 0;
		int[] u = new int[mes.length()];
		for(int i = 1; i < mes.length(); i++) {
			v[i] = mes.charAt(i) - 'a' + 1;
			if (mes.charAt(i) == ' ') v[i] = 0;
			v[i] += i*27;
		}

		u[0] = v[0];
		for(int i = 1 ; i < mes.length(); i++) {
			u[i] = v[i] - v[i-1];
			u[i]%=27;
		}
		
		String out = "";
		for(int i = 0; i < mes.length(); i++) {
			if(u[i]%27 == 0) {
				out += ' ';
				continue;
			}
			out += (char)('a' + u[i]%27 - 1);
			
		}
		
		
		return out;
	}


}
