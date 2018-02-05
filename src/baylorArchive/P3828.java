package baylorArchive;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P3828 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		while (true) {
			line = br.readLine();
			if (line.equals("0")){
				break;
			}
			
			String[] a = line.split("\\s");
			int l = Integer.parseInt(a[0]);
			int[] out = new int[l];
			for (int i = 0; i < l; i++){
				out[i] = Integer.parseInt(a[i+1]);
			}
			int k = 1;
			while (k < l) {
				int s[] = new int[k];
				int d[] = new int[k];
				for (int i = 0; i < k; i++){
					s[i] = out[i];
					d[i] = out[i+k];
				}
				for (int i = 0; i < k; i++){
					out[2*i] = (s[i] + d[i])/2;
					out[2*i+1] = s[i] - out[2*i];
				}
				k *= 2;
			}
			String temp = "";
			for (int i = 0; i < out.length; i++){
				temp+= Integer.toString(out[i]) + " ";
			}
			temp = temp.substring(0, temp.length()-1);
			System.out.println(temp);
			
			
		}

	}

}
