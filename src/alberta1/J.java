package alberta1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J {
	public static void main(String[] args) throws Exception {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(b.readLine());
		double A = Double.parseDouble(s.nextToken());
		double N = Double.parseDouble(s.nextToken());
		
		if (N > 2*Math.sqrt(A*Math.PI)) {
			System.out.println("Diablo is happy!");
		}
		else {
			System.out.println("Need more materials!");
		}
	}
}
