package baylorArchive;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P7816 {
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
		while(true){
			s = br.readLine().trim();
			int count = 0;
			StringTokenizer st = new StringTokenizer(s);
			int cuts = Integer.parseInt(st.nextToken());
			int keys = Integer.parseInt(st.nextToken());
			if(cuts == 0 && keys == 0){
				break;
			}
			s = br.readLine().trim();
			st = new StringTokenizer(s);
			int[] cSize = new int[cuts];
			for(int i = 0; i < cuts; i++){
				cSize[i] = Integer.parseInt(st.nextToken());
			}
			for(int i = 0; i < keys; i++){
				st = new StringTokenizer(br.readLine().trim());
				for(int j = 0; j < cuts; j++){
					if(Integer.parseInt(st.nextToken()) > cSize[j]) break;
					if(j == (cuts-1)) count++;
				}
				
			}
			System.out.println(count);
		}
	}
}
