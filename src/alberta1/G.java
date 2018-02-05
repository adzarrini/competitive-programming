package alberta1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class G {
	public static void main(String[] args) throws Exception {
		String[] scales = {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"};
		ArrayList<ArrayList<String>> s = new ArrayList<ArrayList<String>>();
		
		for (int i = 0; i < scales.length; i++) {
			ArrayList<String> temp = new ArrayList<String>();
			int index = i;
			temp.add(scales[index]);
			for (int j = 0; j < 6; j++) {
				if (j == 2) ++index;
				else index += 2;
				temp.add(scales[index % scales.length]);
			}
			s.add(temp);
		}
		
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(b.readLine());
		String notes[] = b.readLine().split("\\s+");
		
		boolean[] c = new boolean[scales.length];
		for (int i = 0; i < c.length; i ++) {
			c[i] = true;
			for (int j = 0; j < notes.length; j++) {
				if (!s.get(i).contains(notes[j])) {
					c[i] = false;
				}
			}
		}
		String out = "";
		for (int i = 0; i < c.length; i++) {
			if (c[i]) out += scales[i] + " ";
		}
		if (!out.isEmpty()) {
			System.out.println(out.substring(0, out.length() - 1));
		}
		else {
			System.out.println("none");
		}
	}
}
