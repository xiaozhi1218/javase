package com.itheima03;
/*
     死循环
        1.概念: 永不休止的循环
        2.分类:
            (1)for循环的死循环格式      for芬芬
                for(;;){...}

            (2)while循环的死循环格式        建议使用
                while(true){...}

            (3)do-while循环的死循环格式
                do{
                    ...
                }while(true);
 */
public class Demo04DeadLoop {
    public static void main(String[] args) {
        //for循环
        /*for (;true;) {
            System.out.println("Hello");
        }*/
        //for循环的死循环格式
        //不写布尔表达式: 默认就是true
        /*for (;;) {
            System.out.println("Hello");
        }*/

        //while循环的死循环格式
        /*int i = 0;
        while(i<3) {
            System.out.println("Hello");
        }*/
        /*while (true) {
            System.out.println("Hello");
        }*/

        //do-while循环的死循环格式
        /*int i = 0;
        do {
            System.out.println("Hello");
        }while(i<3);*/
        do {
            System.out.println("Hello");
        }while(true);
    }
}
