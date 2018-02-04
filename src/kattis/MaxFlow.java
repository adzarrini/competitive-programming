package kattis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// Maximum Flow
public class MaxFlow {
	
	class Edge {
		int a;
		int b;
		int flow;
		int capab;
		int capba;
		
		Edge(int a, int b, int cap) {
			this.a = a>b?b:a;
			this.b = a<b?a:b;
			flow = 0;
			//capab = a>b?
			//this.
		}
		
		
	}
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		System.out.println(5>4?3:2);
	}	

}
