package sp18Set3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Different Distances
public class F {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		while (true) {
			line = br.readLine();
			if (line.equals("0")) break;
			StringTokenizer s = new StringTokenizer(line);
			
			double x1 = Double.parseDouble(s.nextToken());
			double y1 = Double.parseDouble(s.nextToken());
			double x2 = Double.parseDouble(s.nextToken());
			double y2 = Double.parseDouble(s.nextToken());
			double p = Double.parseDouble(s.nextToken());
			
			System.out.printf("%.10f\n", Math.pow(Math.pow(Math.abs(x1 - x2), p) + Math.pow(Math.abs(y1 - y2), p), 1/p));
		}
	}
}
