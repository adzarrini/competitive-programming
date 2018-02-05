package sp18Set1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class E {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n1 = Integer.parseInt(br.readLine());
		int n2 = Integer.parseInt(br.readLine());
		
		int o1 = Math.abs(n1 - n2);
		int o2 = Math.abs(360 - n1 + n2);
		int o3 = Math.abs(360 - n2 + n1);
		
		int o = Math.min(Math.min(o1, o2), o3);
		if (o == 180) {
			System.out.println(180);
		}
		else if (o == o1) {
			System.out.println(n2-n1);
		}
		else if (o == o2) {
			System.out.println(o);
		}
		else if (o == o3) {
			System.out.println(-o);
		}
		
	}

}
