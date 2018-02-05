package sp18Set2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.TreeMap;

// Sort of Sorting
public class B {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) break;
			else System.out.println();
			TreeMap<String, ArrayList<String>> map = new TreeMap<String,ArrayList<String>>();
			for (int i = 0; i < n; i++) {
				String l = br.readLine();
				String k = l.substring(0, 2);
				if (map.containsKey(k)) {
					ArrayList<String> temp = map.get(k);
					temp.add(l);
					map.put(k, temp);
				}
				else {
					ArrayList<String> temp = new ArrayList<String>();
					temp.add(l);
					map.put(k, temp);
				}
				
			}
			for (String s : map.keySet()) {
				ArrayList<String> out = map.get(s);
				for (int i = 0; i < out.size(); i++) {
					System.out.println(out.get(i));
				}
			}
		}
	}
}
