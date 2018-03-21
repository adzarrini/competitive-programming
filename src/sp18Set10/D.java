package sp18Set10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String l = "";
		int xMax = Integer.parseInt(br.readLine());
		int xGrid = 0; int yGrid = 0;
		int x = 0; int y = 0;
		while((l=br.readLine())!=null){
			//System.out.println(xMax);
			StringTokenizer s = new StringTokenizer(l);
			int xTemp = Integer.parseInt(s.nextToken());
			//System.out.println(xTemp);
			if(xTemp == -1) {
				System.out.println(xGrid + " x " + (y+yGrid));
				xMax = Integer.parseInt(br.readLine());
				if(xMax == 0) break;
				x = 0; y = 0; xGrid = 0; yGrid = 0;
				continue;
			}
			int yTemp = Integer.parseInt(s.nextToken());
			if(x + xTemp > xMax) {
				x = xTemp;
				xGrid = Math.max(x, xGrid);
				yGrid += y;
				y = yTemp;
			}
			else {
				x += xTemp;
				xGrid = Math.max(xGrid, x);
				y = Math.max(y, yTemp);
			}
			
			//System.out.println(x);
		}
	}
}
