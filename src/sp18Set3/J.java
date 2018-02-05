package sp18Set3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.StringTokenizer;
// Smallest Multiple
public class J {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String l = "";
		while ((l=br.readLine())!=null) {
			StringTokenizer s = new StringTokenizer(l);
			ArrayList<BigInteger> nums = new ArrayList<BigInteger>();
			while(s.hasMoreTokens()) {
				nums.add(new BigInteger(s.nextToken()));
			}
			if (nums.size() == 1) {
				System.out.println(nums.get(0).toString());
				continue;
			}
			
			System.out.println(lcmm(nums).toString());
		}
	}
	public static BigInteger gcd(BigInteger a, BigInteger b) {
		while(!b.equals(BigInteger.ZERO)) {
			BigInteger t = b;
			b = a.mod(b);
			a = t;
		}
		return a;
	}
	
	public static BigInteger lcm(BigInteger a, BigInteger b) {
		return (a.multiply(b)).divide(gcd(a,b));
	}
	
	public static BigInteger lcmm(ArrayList<BigInteger> nums) {
		if (nums.size() == 2) {
			return lcm(nums.get(0),nums.get(1));
		}
		else {
			BigInteger val = nums.get(nums.size()-1);
			nums.remove(nums.size()-1);
			return lcm(val, lcmm(nums));
		}
	}
}
