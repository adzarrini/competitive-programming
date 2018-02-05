package minesPractice1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class D {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String[] lw = br.readLine().split(" ");
		int l=Integer.parseInt(lw[0]);
		int w=Integer.parseInt(lw[1]);
		int[] positions = new int[n];
		for(int i=0;i<n;i++){
			positions[i]=Integer.parseInt(br.readLine());
		}
		Arrays.sort(positions);
		
		
		double result = 0;
		
		for(int i=0;i<n;i+=2){
			double target = l/((n/2)-1.0);
			double d1=Math.abs(positions[i]-target*(i/2));
			double d2=Math.abs(positions[i+1]-target*(i/2));
			result+= Math.min(d1, d2)+Math.sqrt(w*w+Math.pow(Math.max(d1, d2), 2));
		}
		
		System.out.println(result);
	}

}
