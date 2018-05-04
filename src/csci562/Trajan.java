package csci562;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Trajan {
	
	public static int index = 0;
	static Deque<Node> stack = new ArrayDeque<Node>();
	static Map<Character, ArrayList<Character>> edgeList = new HashMap<>();
	static Map<Character, Node> vertex = new HashMap<>();
	static ArrayList<ArrayList<Node>> SCCs = new ArrayList<>();

	public static void main(String[] args) throws Exception {
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			StringTokenizer s = new StringTokenizer(br.readLine());
			char c = s.nextToken().charAt(0);
			vertex.put(c,new Node(c));
			ArrayList<Character> temp = new ArrayList<>();
			while(s.hasMoreTokens()) {
				temp.add(s.nextToken().charAt(0));
			}
			edgeList.put(c, temp);
		}

		for(char c : vertex.keySet()){
			Node v = vertex.get(c);
			if(!v.found) {
				strongConnect(v);
			}
		}
		// print out result
		System.out.println(SCCs.size());
		for(int i = 0; i < SCCs.size(); i++) {
			ArrayList<Node> out = SCCs.get(i);
			for(int j = 0; j < out.size(); j++) {
				System.out.print(out.get(j).toString() + " ");
			}
			System.out.println();
		}
	}
	
	public static void strongConnect(Node v) {
		v.found = true;
		v.index = index; v.lowlink = index;
		index++;
		stack.push(v);
		v.onStack = true;
		vertex.put(v.name, v);
		for(char c : edgeList.get(v.name)) {
			Node w = vertex.get(c);
			if(!w.found){
				strongConnect(w);
				v.lowlink = Math.min(v.lowlink, w.lowlink);
			}
			else if(w.onStack) {
				v.lowlink = Math.min(v.lowlink, w.index);
			}
		}
		vertex.put(v.name, v);
		if(v.lowlink == v.index) {
			ArrayList<Node> scc = new ArrayList<Node>();
			Node w;
			do {
				w = stack.pop();
				w.onStack = false;
				scc.add(w);
			} while(w.name != v.name);
			if(!scc.isEmpty()) SCCs.add(scc);
		}
	}
	
	static class Node {
		int index=0; int lowlink=0;char name;
		boolean onStack = false; boolean found = false;
		Node(char name) {
			this.name = name;
		}
		public String toString() {
			return name+"";
		}
	}
}
