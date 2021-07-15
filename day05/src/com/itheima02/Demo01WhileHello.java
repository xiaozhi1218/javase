package com.itheima02;
/*
    1.while循环格式:
        初始化表达式1;
        while(布尔表达式2) {
            循环体3;
            步进表达式4;
        }
        其它语句;

    2.执行流程:
        1,2(循环条件: true),3,4 --> 2(循环条件: true),3,4 --> ... -->
            直到布尔表达式2(循环条件: false),结束循环,执行循环后面的其它语句
        需求:
            在控制台输出5次HelloWorld
 */
public class Demo01WhileHello {
    public static void main(String[] args) {
        //使用for
        for (int i = 1; i <= 5; i++) {
            System.out.println("HelloWorld...."+i);
        }
        System.out.println("-------------");

        //使用while
        int j = 1;
        while(j<=5) {//j: 1,2,3,4,5    6<=5 --> false --> 结束while循环
            System.out.println("HelloWorld~~~~~"+j);
            j++;
        }
        System.out.println("main......end.....");
    }
}
