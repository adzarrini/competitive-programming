package sp18Set4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// Splat
public class C {
	
	static class Drop {
		double x;
		double y;
		double r;
		String color;
		
		Drop(String x, String y, String v, String color) {
			this.x = Double.parseDouble(x);
			this.y = Double.parseDouble(y);
			double V = Double.parseDouble(v);
			this.r = Math.sqrt(V/Math.PI);
			this.color = color;
		}
	}
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int c = Integer.parseInt(br.readLine());
		for(int i = 0; i < c; i++) {
			int n = Integer.parseInt(br.readLine());
			Drop[] drops = new Drop[n];
			StringTokenizer s;
			for(int j = 0; j < n; j++) {
				s = new StringTokenizer(br.readLine());
				drops[j] = new Drop(s.nextToken(), s.nextToken(), s.nextToken(), s.nextToken());
			}
			int m = Integer.parseInt(br.readLine());
			for (int j = 0; j < m; j++) {
				String out = "white";
				s = new StringTokenizer(br.readLine());
				double x = Double.parseDouble(s.nextToken());
				double y = Double.parseDouble(s.nextToken());
				for (int k = 0; k < n; k++) {
					if ((Math.pow(drops[k].x - x, 2) + Math.pow(drops[k].y - y, 2)) < Math.pow(drops[k].r, 2)) {
						out = drops[k].color;
					}
				}
				System.out.println(out);
			}
		}
	}
}
