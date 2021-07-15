package com.itheima01;
//ctrl + alt + L: 代码格式化
public class Demo02Break {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            /*
                当i的值是5的时候, i % 5 == 0 --> 5%5 == 0 --> true,
                if后面()中是true,执行if后面{}中的内容(只有break),
                一旦执行break,本次循环的循环体中break后面的代码不再执行,
                而且剩余次数的循环也不再执行,直接从循环中跳出(结束循环)到循环后面的其它语句
             */
            if (i % 5 == 0) {
                break;
            }
            System.out.println("HelloWorld~~~~~~~~~~~~~~~" + i);
        }
        System.out.println("main....end....");
    }
}
