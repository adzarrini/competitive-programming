package baylorArchive;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P3829 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] t = new String[16];
		int m = 16;
		t[0] = "{}";
		t[1] = "{{}}";
		for (int i = 2; i < m; ++i){
			t[i] = "{";
			for (int j = 0; j < i; j++) {
				t[i] += t[j] +",";
			}
			t[i] = t[i].substring(0, t[i].length()-1);
			t[i]+="}";
		}
		String line = "";
		int temp = 0;
		for (int i = 0; i < n; ++i){
			temp = 0;
			for (int k = 0; k < 2; k++){
				line = br.readLine();
				for (int j = 0; j < t.length; j++){
					if(line.equals(t[j])){
						temp+=j;
						break;
					}
				}
			}
			System.out.println(t[temp]);
		}

	}

}
