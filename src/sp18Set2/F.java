package sp18Set2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.SortedSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

//Compound Words
public class F {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        ArrayList<String> a = new ArrayList<String>();
        while((line = b.readLine())!=null) {
            StringTokenizer s = new StringTokenizer(line);
            while (s.hasMoreTokens()) {
                a.add(s.nextToken());
            }
        }
        Collections.sort(a);
        SortedSet<String> s = new TreeSet<String>();
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.size(); j++) {
                if (i==j) continue;
                s.add(a.get(i) + a.get(j));
            }
        }
        for (String k : s) {
            System.out.println(k);
        }
    }

}
