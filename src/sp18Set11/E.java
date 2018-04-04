package sp18Set11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class E {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(s.nextToken());
		int B = Integer.parseInt(s.nextToken());
		int C = Integer.parseInt(s.nextToken());
		int D = Integer.parseInt(s.nextToken());
		boolean dog1;
		boolean dog2;
		s = new StringTokenizer(br.readLine());
		int[] deliver = new int[3];
		deliver[0] = Integer.parseInt(s.nextToken());
		deliver[1] = Integer.parseInt(s.nextToken());
		deliver[2] = Integer.parseInt(s.nextToken());
		int d1 = A+B;
		int d2 = C+D;
		
		for(int i = 0; i < 3; i++) {
			dog1 = false;
			dog2 = false;
			int t1 = deliver[i]%d1;
			int t2 = deliver[i]%d2;
			if(t1 <= A && t1 != 0) dog1 = true;
			if(t2 <= C && t2 != 0) dog2 = true;
			
			if(dog1 && dog2) {
				System.out.println("both");
				continue;
			}
			if(dog1 || dog2) {
				System.out.println("one");
				continue;
			}
			System.out.println("none");
		}
	}
}
