import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArmyStrength {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(b.readLine());
        for (int i = 0; i < n; i++) {
            b.readLine();
            StringTokenizer s = new StringTokenizer(b.readLine());
            int Ng = Integer.parseInt(s.nextToken());
            int Nm = Integer.parseInt(s.nextToken());
            s = new StringTokenizer(b.readLine());
            int Mg = Integer.MIN_VALUE;
            int Mm = Integer.MIN_VALUE;
            for (int j = 0; j < Ng; j++) {
                int t = Integer.parseInt(s.nextToken());
                if (t > Mg) Mg = t;
            }
            s = new StringTokenizer(b.readLine());
            for (int j = 0; j < Nm; j++) {
                int t = Integer.parseInt(s.nextToken());
                if (t > Mm) Mm = t;
            }
            if (Mm > Mg) System.out.println("MechaGodzilla");
            else System.out.println("Godzilla");
        }

    }

}