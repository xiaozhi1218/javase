package com.itheima03;
/*
    do-while循环练习：
	    在控制台输出5次HelloWorld
 */
public class Demo01DoWhileHello {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("HelloWorld~~~~~"+i);
            i++;
        }while(i<=5);//2,3,4,5   6<=5: false,结束do-while循环,执行后面的语句
        System.out.println("main....end....");
    }
}
