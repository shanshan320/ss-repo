package com.itheima.d2_collection_traverse;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo02 {
    public static void main(String[] args) {
        //目标：Collection 集合的遍历方式之一：使用增强for遍历
        Collection<String> c = new ArrayList<>();
        c.add("赵敏");
        c.add("小昭");
        c.add("素素");
        c.add("灭绝");
        System.out.println(c);
        //c = [赵敏, 小昭, 素素, 灭绝]

        //使用增强for遍历集合或数组
        for (String s : c) {
            System.out.println(s);
        }
        String[] names = {"迪丽热巴","古力娜扎","嘻嘻哈哈"};
        for (String name : names) {
            System.out.println(name);
        }
    }
}
