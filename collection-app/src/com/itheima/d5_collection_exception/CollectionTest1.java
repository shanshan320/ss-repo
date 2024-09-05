package com.itheima.d5_collection_exception;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionTest1 {
    public static void main(String[] args) {
        //目标：理解集合的并发修改异常对象问题，并解决
        ArrayList<String> list = new ArrayList<>();
        list.add("王麻子");
        list.add("小李子");
        list.add("李爱华");
        list.add("张全蛋");
        list.add("晓李");
        list.add("李玉刚");
        System.out.println(list);
        //[王麻子, 小李子, 李爱华, 张全蛋, 晓丽, 李玉刚]

        //需求：找出集合中全部带“李”的名字，并删除
       /* Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String name = iterator.next();
            if (name.contains("李")){
                list.remove(name);
            }
        }
        System.out.println(list);*/

        //使用for循环，倒着删
        /*for (int i = list.size()-1; i >0 ; i--) {
           String name =  list.get(i);
            if (name.contains("李")){
                list.remove(name);
            }
        }
        System.out.println(list);*/

        //使用for循环，删除一个往前退一步
        /*for (int i = 0; i < list.size() ; i--) {
            String name =  list.get(i);
            if (name.contains("李")){
                list.remove(name);
                i--;
            }
        }
        System.out.println(list);*/

        //使用迭代器遍历删除
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String name = it.next();
            if (name.contains("李")){
//                list.remove(name);
               it.remove(); //删除迭代器遍历道的数据，每删除一个数据后，相当于在底层做了i--
            }
        }
        System.out.println(list);

        //使用增强for循环遍历集合并删除数据，没办法解决bug
        /*for (String name : list) {
            if (name.contains("李")){
                list.remove(name);
            }
        }
        System.out.println(list);*/
    }
}
