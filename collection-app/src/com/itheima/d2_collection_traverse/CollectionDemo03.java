package com.itheima.d2_collection_traverse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionDemo03 {
    public static void main(String[] args) {
        //目标：Collection 集合的遍历方式之一：使用lambda表达式
        Collection<String> c = new ArrayList<>();
        c.add("赵敏");
        c.add("小昭");
        c.add("素素");
        c.add("灭绝");
        System.out.println(c);
        //c = [赵敏, 小昭, 素素, 灭绝]

        //forEach方法 结合lambda表达式遍历集合
//        c.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

//        c.forEach((String s)-> {
//                System.out.println(s);
//        });

//        c.forEach( s -> System.out.println(s));
        c.forEach( System.out::println);

    }
}
