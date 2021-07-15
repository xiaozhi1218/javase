package com.itheima01;

/*
    1.for循环格式:
        for(初始化表达式1;布尔表达式2;步进表达式4){
            循环体3;
        }

    2.执行流程:
        1,2(循环条件: true),3,4 --> 2(循环条件: true),3,4 --> ... -->
            直到布尔表达式2(循环条件: false),结束循环,执行循环后面的其它语句
    3.需求:
	    在控制台输出5次HelloWorld
 */
public class Demo01ForHello {
    public static void main(String[] args) {
        System.out.println("HelloWorld.....1");
        System.out.println("HelloWorld.....2");
        System.out.println("HelloWorld.....3");
        System.out.println("HelloWorld.....4");
        System.out.println("HelloWorld.....5");
        System.out.println("----------------------");

        //使用for循环
        //count: 1,2,3,4,5  6<=5 --> false --> 结束for循环
        for (int count = 1; count <= 5; count++) {
            System.out.println("HelloWorld....."+count);
        }
        System.out.println("----------------------");

        //使用for循环
        //times: 0,1,2,3,4    5<5 --> false --> 结束for循环
        for (int times = 0; times < 5; times++) {
            System.out.println("HelloWorld....."+times);
        }

        System.out.println("main.......end............");
    }
}
