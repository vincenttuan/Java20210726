package com.study.day14;

import java.util.Random;
import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        TreeSet tree = new TreeSet();
        // 取得 1~10 之間的亂數
        // 取出 5 個
        // 還要進行排序
        Random r = new Random();
        for(int i=0;i<5;i++) {
            int n = r.nextInt(10) + 1;
            System.out.printf("n: %d\n", n);
            tree.add(n);
        }
        System.out.println(tree);
        //-----------------------------------
        TreeSet tree2 = new TreeSet();
        while (tree2.size() < 5) {            
            int n = r.nextInt(10) + 1;
            System.out.printf("n: %d\n", n);
            tree2.add(n);
        }
        System.out.println(tree);
    }
}
