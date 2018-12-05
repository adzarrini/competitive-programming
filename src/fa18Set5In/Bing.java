import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Map;

public class Bing {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {

        }
    }
    class Node {
        int count;
        Map<Character, Node> children;
    }
}
