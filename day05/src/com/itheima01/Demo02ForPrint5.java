package com.itheima01;
/*
    需求:
	    在控制台输出1-5和5-1的数据
 */
public class Demo02ForPrint5 {
    public static void main(String[] args) {
        //for循环输出1-5
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("----------");

        //for循环输出5-1
        for (int j = 5; j >= 1; j--) {
            System.out.println(j);
        }

        System.out.println("main....end....");
    }
}
