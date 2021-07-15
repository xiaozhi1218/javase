package com.itheima01;

public class Demo04Continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            /*
                当i的值是5和10的时候, i % 5 == 0 --> true,
                if后面()中是true,执行if后面{}中的内容(只有continue),
                一旦执行continue,本次循环的循环体中continue后面的代码不再执行,
                继续执行下一次循环的步进表达式
                总结: continue的作用提前结束本次循环,继续进行下一次循环(步进表达式)
             */
            if (i % 5 == 0) {
                continue;
            }
            System.out.println("HelloWorld....." + i);
        }
        System.out.println("main~~~~~~~end~~~~~~~~");
    }

}
