import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class AlienNumbers {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            System.out.print("Case #"+(i+1)+": ");
            StringTokenizer s = new StringTokenizer(br.readLine());
            String input = s.nextToken();
            String source = s.nextToken();
            String target = s.nextToken();
            HashMap<Character,Integer> sourceCode = new HashMap<>();
            HashMap<Integer,Character> targetCode = new HashMap<>();
            for(int j = 0; j < source.length(); j++) {
                sourceCode.put(source.charAt(j), j);
            }
            for(int j = 0; j < target.length(); j++) {
                targetCode.put(j, target.charAt(j));
            }
            int num = 0;
            for(int j = 0; j < input.length(); j++) {
                num += sourceCode.get(input.charAt(input.length() - j - 1)) * Math.pow(source.length(),j);
            }
            String out = "";
            while(num != 0) {
                out += targetCode.get(num% target.length());
                num /= target.length();
            }
            out = new StringBuilder(out).reverse().toString();
            System.out.println(out);
        }
    }
}
