package sp18Set8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Best Compression Ever
public class I {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		long N = Long.parseLong(s.nextToken());
		int b = Integer.parseInt(s.nextToken());
		
		if(Math.pow(2, b+1)-1 < N) System.out.println("no");
		else System.out.println("yes");
	}
}