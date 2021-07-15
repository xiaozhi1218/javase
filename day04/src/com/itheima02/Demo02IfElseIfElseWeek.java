package com.itheima02;

import java.util.Scanner;

/*
    if语句的第三种格式练习
        需求:
            键盘录入一个星期数(1,2,...7)，输出对应的星期一，星期二，...星期日

        演示效果:
            输入 1 输出 星期一
            输入 2 输出 星期二
            输入 3 输出 星期三
            输入 4 输出 星期四
            输入 5 输出 星期五
            输入 6 输出 星期六
            输入 7 输出 星期日
            输入 其它数字 输出 数字有误

        实现步骤:
            1.创建键盘录入Scanner类的对象
            2.获取键盘录入的整数数字,代表星期数,保存到int变量week中
            3.因为week中的数字有7+1种情况,所以使用if语句的第三种格式进行判断,并输出不同的结果内容
 */
public class Demo02IfElseIfElseWeek {
    public static void main(String[] args) {
        //1.创建键盘录入Scanner类的对象
        Scanner sc = new Scanner(System.in);

        //2.获取键盘录入的整数数字,代表星期数,保存到int变量week中
        System.out.println("请输入一个1-7的整数数字(代表星期数):");
        int week = sc.nextInt();

        //3.因为week中的数字有7+1种情况,所以使用if语句的第三种格式进行判断,并输出不同的结果内容
        if(week>7 || week<1) {
            System.out.println("您输入的星期数不存在,是火星来的吧,哥屋恩...");
        } else if(week == 1) { //从这里开始向下,隐藏条件: week>=1 && week<=7
            System.out.println("星期一");
        } else if(week == 2) {
            System.out.println("星期二");
        } else if(week == 3) {
            System.out.println("星期三");
        } else if(week == 4) {
            System.out.println("星期四");
        } else if(week == 5) {
            System.out.println("星期五");
        } else if(week == 6) {
            System.out.println("星期六");
        } else /*if(week == 7)*/ {//隐藏条件: week == 7
            System.out.println("星期日");
        }

        System.out.println("main....end....");//模拟格式中的其它语句
    }
}
