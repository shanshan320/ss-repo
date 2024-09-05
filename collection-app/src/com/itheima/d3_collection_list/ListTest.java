package com.itheima.d3_collection_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("糖宝宝");
        list.add("蜘蛛精");
        list.add("至尊宝");

        //1、 for循环
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }

        //2、迭代器遍历
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //3、增强for(foreach遍历)
        for (String s : list) {
            System.out.println(s);
        }

        //4、JDK1.8之后的lambda表达式
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //Arraylist 特点：查询快，增删慢  基于数组
        //LinkedList  链表特点：查询慢，无论查询哪个数据都要从头开始；增删相对快
        //双向链表：查询慢，增删相对快，但对首尾元素进行增删改查速度极快




    }
}




