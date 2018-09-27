import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Crne {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());
        long v = n/2;
        long h = n/2;
        if(n%2 == 1) {
            h++;
        }
        long out = ++v * ++h;
        System.out.println(out);
    }
}
