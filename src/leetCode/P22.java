package leetCode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class P22 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<String> parenthesis = generateParenthesis(n);

        System.out.println(parenthesis.toString());
    }


    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        recurseParenthesis(ans, "", 0, 0, n);
        return ans;
    }

    public static void recurseParenthesis(List<String> ans, String curr, int open, int close, int max) {
        if (curr.length() == (2*max)) {
            ans.add(curr);
            return;
        }

        if (open < max) recurseParenthesis(ans, curr + "(", open + 1, close, max);
        if (close < open) recurseParenthesis(ans, curr + ")", open, close + 1, max);
    }
}