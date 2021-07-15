package com.itheima03;

import java.util.Random;
import java.util.Scanner;

/*
    猜数字综合案例
        1.需求：程序自动生成一个1-100之间(包含1,包含100)的数字，使用程序实现猜出这个数字是多少？

        2.效果：
            如果猜的数字比真实数字大，提示你猜的数据大了
            如果猜的数字比真实数字小，提示你猜的数据小了
            如果猜的数字与真实数字相等，提示恭喜你猜中了

        3.使用的知识点:
            (1)使用产生随机数字的Random类(1.导包 2.创建对象 3.使用: nextInt(100)+1)
            (2)使用键盘录入Scanner类(1.导包 2.创建对象 3.使用: nextInt())
            (3)使用if语句的第三种格式,比较用户输入的数字和产生的随机数字的大小关系
            (4)用户多少次可以猜对,不确定,需要使用循环(死循环: while(true))
            (5)用户猜测正确后,需要停止循环,使用break

        4.实现步骤:
            (1)创建产生随机数字的Random类的对象
            (2)产生一个[1,100]之间的随机数字,保存到int变量guessNum中,以供用户猜测
            (3)创建键盘录入Scanner类的对象
            (4)以下步骤(5)-(6)是一个循环过程,因为用户多少次可以猜对,并不能确定,使用while(true)
            (5)获取用户猜测的通过键盘录入的数字,保存到int变量inputNum中
            (6)使用if语句的第三种个,对用户猜测的保存在inputNum中的数字 和 产生的保存在guessNum中的数字进行比较
                a.如果 inputNum 大于 guessNum 提示"你猜的数据大了"
                b.否则,如果 inputNum 小于 guessNum 提示"你猜的数据小了"
                c.否则,如果 inputNum 等于 guessNum 提示"恭喜你猜中了",并使用break结束循环
                    注意: inputNum 等于 guessNum 条件 省略不写

 */
public class Demo03GuessNum {
    public static void main(String[] args) {
        //(1)创建产生随机数字的Random类的对象
        Random r = new Random();

        //(2)产生一个[1,100]之间的随机数字,保存到int变量guessNum中,以供用户猜测
        //[1,100] --> [0, 99] + 1 --> [0,100) + 1 --> r.nextInt(100) + 1
        int guessNum = r.nextInt(100) + 1;

        //(3)创建键盘录入Scanner类的对象
        Scanner sc = new Scanner(System.in);
        //(4)以下步骤(5)-(6)是一个循环过程,因为用户多少次可以猜对,并不能确定,使用while(true)
        while (true) {
            //(5)获取用户猜测的通过键盘录入的数字,保存到int变量inputNum中
            System.out.println("请输入您猜测的数字(1-100之间的整数):");
            int inputNum = sc.nextInt();

            //(6)使用if语句的第三种个,对用户猜测的保存在inputNum中的数字 和 产生的保存在guessNum中的数字进行比较
            if (inputNum > guessNum) {
                //a.如果 inputNum 大于 guessNum 提示"你猜的数据大了"
                System.out.println("你猜的数据大了");
            } else if (inputNum < guessNum) {
                //b.否则,如果 inputNum 小于 guessNum 提示"你猜的数据小了"
                System.out.println("你猜的数据小了");
            } else {
                //c.否则,如果 inputNum 等于 guessNum 提示"恭喜你猜中了",并使用break结束循环
                //注意: inputNum 等于 guessNum 条件 省略不写
                System.out.println("恭喜你猜中了");
                //使用break结束循环
                break;
            }
        }

    }
}
