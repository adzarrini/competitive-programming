package sp18Set4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Pachyderm Peanut Packing
public class D {
	static class Box {
		double x1;
		double y1;
		double x2;
		double y2;
		String size;
		Box(String x1, String y1, String x2, String y2, String size) {
			this.x1 = Double.parseDouble(x1);
			this.y1 = Double.parseDouble(y1);
			this.x2 = Double.parseDouble(x2);
			this.y2 = Double.parseDouble(y2);
			this.size = size;
		}
	}


	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) break;
			else System.out.println();
			Box[] boxes = new Box[n];
			StringTokenizer s;
			for(int i = 0; i < n; i++) {
				s = new StringTokenizer(br.readLine());
				boxes[i] = new Box(s.nextToken(), s.nextToken(), s.nextToken(), s.nextToken(), s.nextToken());
			}
			int m = Integer.parseInt(br.readLine());
			for(int i = 0; i < m; i++) {
				s = new StringTokenizer(br.readLine());
				double x = Double.parseDouble(s.nextToken());
				double y = Double.parseDouble(s.nextToken());
				String size = s.nextToken();
				System.out.print(size + " ");
				String peanut = "floor";
				for(int j = 0; j < n; j++) {
					if (boxes[j].x1 <= x && boxes[j].x2 >= x && boxes[j].y1 <= y && boxes[j].y2 >= y) {
						if(boxes[j].size.equals(size)) {
							peanut = "correct";
						}
						else {
							peanut = boxes[j].size;
						}
					}
				}
				System.out.println(peanut);
			}
		}
	}
}
