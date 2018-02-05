package sp18Set1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class F {
	public static void main(String[] args) throws Exception {
		HashMap<String, String> m = new HashMap<String, String>();
		HashMap<String, String> ma = new HashMap<String, String>();
		m.put("A#", "Bb"); m.put("C#", "Db"); m.put("D#", "Eb"); m.put("F#", "Gb"); m.put("G#", "Ab");
		for (String k : m.keySet()) {
			ma.put(m.get(k), k);
		}
		m.putAll(ma);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String l = "";
		int counter = 0;
		while ((l = br.readLine()) != null) {
			counter++;
			StringTokenizer s = new StringTokenizer(l);
			String note = s.nextToken();
			String ms = s.nextToken();
			
			if (m.containsKey(note)) {
				System.out.println("Case " + counter + ": " + m.get(note) + " " + ms);
			}
			else {
				System.out.println("Case " + counter + ": UNIQUE");
			}
		}
	}
}
