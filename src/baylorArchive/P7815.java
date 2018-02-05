package baylorArchive;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P7815 {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";;
		Double number;
		while((s = br.readLine()) != null){
			number = Double.parseDouble(s);
			if(number == 0){
				return;
			}
			if (number > 1000000 && number <= 5000000){
				number = number * 0.9;
			}
			else if(number > 5000000) {
				number = number*0.8;
			}
			System.out.println(number.intValue());
		}
	}
}
