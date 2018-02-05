package sp18Set4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
// Estimating the Area of a Circle
public class H {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String l = "";
		while((l = br.readLine())!= null) {
			if (l.equals("0 0 0")) break;
			StringTokenizer s = new StringTokenizer(l);
			double r = Double.parseDouble(s.nextToken());
			int m = Integer.parseInt(s.nextToken());
			int c = Integer.parseInt(s.nextToken());
			bw.write(Math.PI*Math.pow(r, 2) + " " + (Math.pow(2*r, 2)*c)/m +"\n");
		}
		bw.flush();
	}
}
