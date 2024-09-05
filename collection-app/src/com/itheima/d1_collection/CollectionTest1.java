package com.itheima.d1_collection;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionTest1 {
    public static void main(String[] args) {
        //目标：认识Collection体系的特点
        //简单确认一下Collection集合的特点
        ArrayList<String> list = new ArrayList<>(); //有序 可重复 有索引
        list.add("java1");
        list.add("java2");
        list.add("java1");
        list.add("java2");
        String[] s = {"234","hh","yy"};
        System.out.println(list);

        HashSet<String> set = new HashSet<>(); //无序 不重复 无索引
        set.add("java1");
        set.add("java2");
        set.add("java1");
        set.add("java2");
        set.add("java3");
        System.out.println(set);



    }
}
