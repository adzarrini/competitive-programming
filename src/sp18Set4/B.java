package sp18Set4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Half a cookie
public class B {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String l = "";
		while((l=br.readLine()) != null) {
			StringTokenizer s = new StringTokenizer(l);
			double r = Double.parseDouble(s.nextToken());
			double x = Double.parseDouble(s.nextToken());
			double y = Double.parseDouble(s.nextToken());
			
			double rs = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
			if (rs > r) {
				System.out.println("miss\n");
				continue;
			}
			double A = Math.PI*Math.pow(r, 2);
			
			double ang = 2*Math.acos(rs/r);
			double area = (Math.pow(r, 2)/2)*(ang-Math.sin(ang));
			System.out.println(String.format("%f", (A-area)) + " " + String.format("%f", area));
			
		}
	}
}
