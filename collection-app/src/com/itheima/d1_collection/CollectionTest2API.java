package com.itheima.d1_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionTest2API {
    public static void main(String[] args) {
        //目标：
        Collection<String> c = new ArrayList<>(); //多态写法
        //1、add 方法，添加元素，添加成功返回true
        c.add("java1");
        c.add("java2");
        c.add("java1");
        c.add("java2");
        c.add("java3");
        System.out.println(c);

        //2、clear 清空集合元素
//        c.clear();
//        System.out.println(c);

        //3、isEmpty  判断集合是否为空，是空返回true
        System.out.println(c.isEmpty());

        //4、size 获取集合的大小
        System.out.println(c.size());

        //5、contains() 判断集合中是否包含某个元素
        System.out.println(c.contains("java1"));
        System.out.println(c.contains("JAVA1"));

        //6、remove 删除某个元素：如果有多个重复，默认删除前面的第一个
        System.out.println(c.remove("java1"));
        System.out.println(c);

        //7、toArray 把集合转换成数组
        Object[] arr = c.toArray();
        System.out.println(Arrays.toString(arr));
        String[] s = c.toArray(new String[c.size()]);
        System.out.println(Arrays.toString(s));

        System.out.println("--------------------------------------------");
        //把一个集合中的全部数据倒入到另一个集合中去
        Collection<String> c1 = new ArrayList<>();
        c1.add("java1");
        c1.add("java2");
        Collection<String> c2 = new ArrayList<>();
        c2.add("java3");
        c2.add("java4");
        c1.addAll(c2); //把c2全部数据倒入到c1集合中
        System.out.println(c1);
        System.out.println(c2);


    }
}
