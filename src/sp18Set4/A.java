package sp18Set4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// Amsterdam Distance
public class A {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(s.nextToken());
		int N = Integer.parseInt(s.nextToken());
		double R = Double.parseDouble(s.nextToken());
		s = new StringTokenizer(br.readLine());
		int ax = Integer.parseInt(s.nextToken());
		int ay = Integer.parseInt(s.nextToken());
		int bx = Integer.parseInt(s.nextToken());
		int by = Integer.parseInt(s.nextToken());
		
		
		double dang = Math.PI / M;
		double dr = (R / N);
		
		double dist1 = Math.abs(ax-bx)*dang*Math.min(ay, by)*dr + Math.abs(ay-by)*dr;
		double dist2 = ay*dr+by*dr;

		System.out.println(Math.min(dist1,dist2));
	}
}
