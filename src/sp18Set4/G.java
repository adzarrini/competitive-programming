package sp18Set4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;
// Not Amused
public class G {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String l = "";
		int day = 0;
		TreeMap<String, Integer> count = new TreeMap<String, Integer>();
		while((l=br.readLine())!=null) {
			if(l.equals("OPEN")) {
				day++;
				System.out.println("Day " + day);
				continue;
			}
			if(l.equals("CLOSE")) {
				for (String n : count.keySet()) {
					System.out.printf("%s $%.2f\n", n, count.get(n)*0.1);
				}
				System.out.println();
				count.clear();
				continue;
			}
			
			StringTokenizer s = new StringTokenizer(l);
			String status = s.nextToken();
			String name = s.nextToken();
			int time = Integer.parseInt(s.nextToken());
			if (status.equals("ENTER")) {
				if(count.containsKey(name)) count.put(name, count.get(name) - time);
				else count.put(name, -1 * time);
			}
			else count.put(name, count.get(name) + time);

		}
	}

}
