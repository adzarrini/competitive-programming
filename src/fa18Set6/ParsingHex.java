import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ParsingHex {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String l;
        while((l= br.readLine())!=null){
            String num = "";
            String low = l.toLowerCase();
            int i = 0;
            while((i = low.indexOf("0x")) != -1) {
                num = "";
                String start = l.substring(i, i + 2);
                l = l.substring(i + 2);
                System.out.println(l);
                if(l.length() == 0) break;
                low = l.toLowerCase();
                for (int j = 0; j < ((l.length() < 8)?l.length():8) ; j++) {
                    if ((low.charAt(j) <= 'f' && low.charAt(j) >= 'a') || (low.charAt(j) >= '0' && low.charAt(j) <= '9')) {
                        num += l.charAt(j);
                    } else {
                        break;
                    }
                }
                int n = Integer.parseInt(num, 16);
                num = start + num;
                System.out.println(num + " " + Integer.toString(n));
            }
        }
    }
}
