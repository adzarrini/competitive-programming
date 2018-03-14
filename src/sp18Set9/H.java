package sp18Set9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//Chess
public class H {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++) {
			StringTokenizer s = new StringTokenizer(br.readLine());
			int x1 = s.nextToken().charAt(0) - 'A' + 1;
			int y1 = Integer.parseInt(s.nextToken());
			int x2 = s.nextToken().charAt(0) - 'A' + 1;
			int y2 = Integer.parseInt(s.nextToken());
			if(x1 == x2 && y1 == y2) {
				System.out.println("0 " + makeChar(x1) + " " + y1);
				continue;
			}
			if(impossible(x1,y1,x2,y2)) {
				System.out.println("Impossible");
				continue;
			}
			if(Math.abs(x1-x2) == Math.abs(y1-y2)) {
				System.out.println("1 " + makeChar(x1) + " " + y1 + " " + makeChar(x2) + " " + y2);
				continue;
			}
			int x3 = Math.abs(x2 - x1 + 1);
			int y3 = Math.abs(y2 - y1 + 1);
			int change, xm, ym;
			if(y3 > x3) {
				change = y3/2;
				if(Math.min(y1, y2) + change <= 8) {
					ym = Math.min(y1, y2) + change;
				}
				else ym = Math.max(y1, y2) - change;
				if(Math.min(x1, x2) + change <= 8) {
					xm = Math.min(x1, x2) + change;
				}
				else xm = Math.max(x1, x2) - change;
			}
			else {
				change = x3;
				if(Math.min(x1, x2) + change <= 8) {
					xm = Math.min(x1, x2) + change;
				}
				else xm = Math.max(x1, x2) - change;
				if(Math.min(y1, y2) + change <= 8) {
					ym = Math.min(y1, y2) + change;
				}
				else ym = Math.max(y1, y2) - change;
			}
			System.out.println("2 " + makeChar(x1) + " " + y1 + " " + makeChar(xm) + " " + ym + " " + makeChar(x2) + " " + y2);			
			
		}
	}
	
	public static boolean isOdd(int x) {
		return (x%2==1);
	}
	
	public static boolean isEven(int x) {
		return (x%2==0);
	}
	
	public static boolean impossible(int x1, int y1, int x2, int y2) {
		if(isOdd(x1)) {
			if(isOdd(y1)){
				if((isOdd(x2) && isOdd(y2)) || (isEven(x2) && isEven(y2))) {
					return false;
				}
			}
			else{
				if((isOdd(x2) && isEven(y2)) || (isEven(x2) && isOdd(y2))) {
					return false;
				}
			}
		}
		else {
			if(isEven(y1)){
				if((isOdd(x2) && isOdd(y2)) || (isEven(x2) && isEven(y2))) {
					return false;
				}
			}
			else{
				if((isOdd(x2) && isEven(y2)) || (isEven(x2) && isOdd(y2))) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static char makeChar(int x) {
		return (char)(('A'+x-1));
	}

}

