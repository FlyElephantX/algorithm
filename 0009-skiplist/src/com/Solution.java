package com;

public class Solution {

    public static void main(String[] args) {

        Skiplist skiplist = new Skiplist();

        skiplist.add(1);
        skiplist.add(2);
        skiplist.add(3);
        boolean res = skiplist.search(0);   // 返回 false
        if (res) {
            System.out.println("0存在");
        } else {
            System.out.println("0不存在");
        }
        skiplist.add(4);
        res = skiplist.search(1);   // 返回 true
        if (res) {
            System.out.println("1存在");
        } else {
            System.out.println("1不存在");
        }
        res = skiplist.erase(0);    // 返回 false，0 不在跳表中
        if (res) {
            System.out.println("0存在");
        } else {
            System.out.println("0不存在");
        }
        res = skiplist.erase(1);    // 返回 true
        if (res) {
            System.out.println("1存在");
        } else {
            System.out.println("1不存在");
        }
        res = skiplist.search(1);   // 返回 false，1 已被擦除
        if (res) {
            System.out.println("1存在");
        } else {
            System.out.println("1不存在");
        }
    }
}
