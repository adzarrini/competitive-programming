package kattis;

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
			points[i] = new Point(Double.parseDouble(s.nextToken()),Double.parseDouble(s.nextToken()));
		}
		//System.out.println(Arrays.toString(points));
		Line l = new Line(points[1],points[2]);
		System.out.println(l);
	}
	
	static class Point {
		double x;
		double y;
		Point(double x, double y) {
			this.x = x;
			this.y = y;
		}
		
		public String toString() {
			return "x: "+this.x+" y: "+this.y;
		}
	}
	
	static class Line {
		double m;
		double b;
		Line(Point p1, Point p2) {
			m = (p2.y-p1.y)/(p2.x-p1.x);
			b = p1.y-m*p1.x;
		}
		public String toString() {
			return "m: "+this.m+" b: "+this.b;
		}
//		public Point intersect(Line l) {
//			double x = 
//		}
		
	}
}
