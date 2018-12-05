import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class JudgingTrouble {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> ans = new HashMap<>();
        String l;
        for(int i = 0; i < n; i++) {
            l = br.readLine();
            if(ans.containsKey(l)) {
                ans.put(l, ans.get(l)+1);
            }
            else {
                ans.put(l,1);
            }
        }
        int same = 0;
        for(int i = 0; i < n; i++) {
            l = br.readLine();
            if(ans.containsKey(l) && ans.get(l) > 0) {
                ans.put(l,ans.get(l)-1);
                same++;
            }
        }
        System.out.println(same);
    }
}
