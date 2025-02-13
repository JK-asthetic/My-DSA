package com.company.Recurssison;

import java.util.ArrayList;
import java.util.List;

public class Mobile_number_leetcode_17 {
    public static void letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits == null || digits.isEmpty()) return;

        String map[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        solve(digits, ans, map, 0, "");
        for (String string : ans) {
        	System.out.println(string);
		}
    }

    static void solve(String digits, List<String> ans, String map[], int idx, String res) {
        if (idx == digits.length()) {
            ans.add(res);
            return;
        }

        int num = digits.charAt(idx) - '0';
        String val = map[num];

        for (int i = 0; i < val.length(); i++) {
            solve(digits, ans, map, idx + 1, res + val.charAt(i));
        }
    }
    
    public static void main(String[] args) {
    	letterCombinations("23");
	}
}
