package com;

public class Solution {

    public static void main(String[] args) {
        Bracket bracket = new Bracket();
        String str = "([{}])";
        boolean res = bracket.isMatch(str);
        if (res) {
            System.out.println(str + "---匹配成功");
        } else {
            System.out.println(str + "---匹配不成功");
        }
    }
}
