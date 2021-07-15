package com.itheima01;
/*
    continue的使用场景:
	    1.只能使用在循环中,作用是提前结束本次循环,继续进行下一次循环
        2.不能使用在除循环结构中的其它位置
 */
public class Demo03Continue {
    public static void main(String[] args) {
        System.out.println("顾客获取到了购买的四个包子..........");
        for (int num = 1; num <= 4; num++) {
            /*
                当num的值为2时,num == 2 --> true,if后面()中是true,执行if后面{}中的内容,
                首先: 执行输出语句
                其次: 执行continue,一旦执行continue,本次循环的循环体中continue后面的代码不再执行,
                继续执行下一次循环的步进表达式
                总结: continue的作用提前结束本次循环,继续进行下一次循环

             */
            if (num == 2) {
                System.out.println("把第2个包子弄脏了,不能吃第2个包子了,继续吃其它包子...");
                continue;
            }
            System.out.println("顾客吃第"+num+"个包子......");
        }
        System.out.println("找老板结账,交钱400块,老板说: 欢迎下次光临....");
    }
}
