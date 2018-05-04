package csci562;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// Panda Reserve, Problem G
public class PandaPreserve {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Point[] points = new Point[n];
		StringTokenizer s;
		for(int i = 0; i < n; i++) {
			s = new StringTokenizer(br.readLine());
			points[i] = new Point(Integer.parseInt(s.nextToken()),Integer.parseInt(s.nextToken()));
		}
		//System.out.println(Arrays.toString(points));
	}
	
	static class Point {
		int x;
		int y;
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public String toString() {
			return "x: "+this.x+" y: "+this.y;
		}
	}
}
