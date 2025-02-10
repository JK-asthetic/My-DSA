package com.company.String;

import java.util.ArrayList;

public class Subsequence {
    public static void subsequences(String str) {
        // Write your code here
        ArrayList<String> a = new ArrayList<String>();
        String res = "";
        int idx = 0;
        sequence(str, idx, res, a);

        System.out.println(a);
    }

    static void sequence(String str, int idx, String res, ArrayList<String> a){
        // base case
        if(idx == str.length()) {
            if(res.length() != 0) {
                a.add(res);
            }
            return;
        };

        // include
        sequence(str,idx+1,res+str.charAt(idx), a);
        // exclude
        sequence(str,idx+1,res, a);
    }
    
	public static void main(String[] args) {
		subsequences("ABC");
	}
}
