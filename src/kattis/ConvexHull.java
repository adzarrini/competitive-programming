package kattis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.Stack;

// Convex Hull, to be implemented
public class ConvexHull {
	
	static class Point {
		int x;
		int y;
		Point() {
			x = 0;
			y = 0;
		}
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public String toString() {
			return x + " " + y;
		}
	}

	static class SortbyLow implements Comparator<Point> {
		@Override
		public int compare(Point p1, Point p2) {
			if (p1.y == p2.y) {
				return p1.x - p2.x;
			}
			return p1.y-p2.y;
		}
	}
	
	static class SortbyAng implements Comparator<Point> {
		@Override
		public int compare(Point p1, Point p2) {
			if (Math.atan2(p1.y, p1.x) - Math.atan2(p2.y, p2.x) < 0) return -1;
			else if (Math.atan2(p1.y, p1.x) - Math.atan2(p2.y, p2.x) > 0) return 1;
			return 0;
			
		}
	}
	
	public static int ccw(Point p1, Point p2, Point p3) {
		return (p2.x - p1.x)*(p3.y-p1.y)-(p2.y-p1.y)*(p3.x-p1.x);
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) break;
			StringTokenizer s;
			ArrayList<Point> points = new ArrayList<Point>();
			Point start = new Point(Integer.MAX_VALUE, Integer.MAX_VALUE);
			for(int i = 0; i < n; i++) {
				s = new StringTokenizer(br.readLine());
				Point p = new Point(Integer.parseInt(s.nextToken()), Integer.parseInt(s.nextToken()));
				points.add(p);
				if(new SortbyLow().compare(start, p) > 0) start = p;
			}
			Collections.sort(points, new SortbyLow());

			Stack<Point> ps = new Stack<>();
			ps.push(points.get(0));
			
		}
	}
}


