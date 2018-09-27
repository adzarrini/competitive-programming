import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Fridge2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        Map<Character,Integer> m = new HashMap<>();
        m.put('0',0); m.put('1',0); m.put('2',0); m.put('3',0); m.put('4',0); m.put('5',0); m.put('6',0); m.put('7',0); m.put('8',0); m.put('9',0);
        for(int i = 0; i < n.length(); i++) {
            m.put(n.charAt(i),m.get(n.charAt(i))+1);
        }
        char min = 'a';
        int minVal = Integer.MAX_VALUE;
        for(char a : m.keySet()) {
            if(m.get(a) < minVal) {
                min = a;
                minVal = m.get(a);
            }
        }
        String out = "";
        minVal++;
        if(min == '0') {
            out += "1";
            minVal--;
        }
        for(int i = 0; i < minVal+1; i++) {
            out += min;
        }
        System.out.println(out);

    }
}
