package com.itheima.d4_collection_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest1 {
    public static void main(String[] args) {
        //目标：了解Set系列集合的特点
        //1、创建一个Set集合的对象
        //Set<Integer> set = new HashSet<>();//经典代码  无序不重复无索引
       Set<Integer> set = new LinkedHashSet<>();//有序不重复无索引
        //Set<Integer> set = new TreeSet<>(); //排序（升序）不重复无索引
        set.add(666);
        set.add(555);
        set.add(555);
        set.add(888);
        set.add(888);
        set.add(777);
        set.add(777);
        System.out.println(set);


    }
}
