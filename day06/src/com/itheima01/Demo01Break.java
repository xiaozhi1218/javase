package com.itheima01;
/*
    break的使用场景:
        1.使用在switch语句中,用来结束switch语句,执行switch语句后面的其它语句
        2.使用在循环中,用来结束循环(1.本次循环的循环体中break后面的代码不再执行 2.剩余次数的循环也不再执行),
            执行循环后面的其它语句
        3.break不能使用在出switch和循环语句以外的其它位置
 */
public class Demo01Break {
    public static void main(String[] args) {
        System.out.println("顾客获取到了购买的四个包子..........");
        for (int num = 1; num <= 4; num++) {
            /*
                当num的值为2时,num == 2 --> true,if后面()中是true,执行if后面{}中的内容,
                首先: 执行输出语句
                其次: 执行break,一旦执行break,本次循环的循环体中break后面的代码不再执行,
                剩余次数的循环也不再执行,直接从循环中跳出到循环后面的其它代码继续执行

             */
            if (num == 2) {
                System.out.println("发现2号包子上有个大家伙(小强),2号(及剩余所有)包子不能吃了,找老板投诉");
                break;
            }
            System.out.println("顾客吃第"+num+"个包子......");
        }
        System.out.println("顾客投诉: 这是神马包子,岂有此理.老板: 非常抱歉,赔偿100000元~~~~~");
    }
}
