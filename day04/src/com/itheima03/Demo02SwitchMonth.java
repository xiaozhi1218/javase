package com.itheima03;

import java.util.Scanner;

/*
    switch练习
        需求：
            一年有12个月，分属于春夏秋冬4个季节，
            键盘录入一个月份，请用程序实现判断该月份属于哪个季节，并输出。

        演示效果
            输入： 1、2、12 输出：冬季
            输入： 3、4、5 输出：春季
            输入： 6、7、8 输出：夏季
            输入： 9、10、11 输出：秋季
            输入： 其它数字 输出：数字有误

        实现步骤(本案例使用switch):
            1.创建键盘录入Scanner类的对象
            2.获取键盘录入的一个1-12的整数数字(代表月份),保存到int变量month中
            3.因为month中的数字有12+1中情况,使用switch语句对month中的值,进行判断,并输出不同的结果

 */
public class Demo02SwitchMonth {
    public static void main(String[] args) {
        //1.创建键盘录入Scanner类的对象
        Scanner sc = new Scanner(System.in);

        //2.获取键盘录入的一个1-12的整数数字(代表月份),保存到int变量month中
        System.out.println("请输入一个1-12的整数数字(代表月份): ");
        int month = sc.nextInt();

        //3.因为month中的数字有12+1中情况,使用switch语句对month中的值,进行判断,并输出不同的结果
        switch (month) {//15
            case 1:
                System.out.println("冬季");
                break;
            case 2:
                System.out.println("冬季");
                break;
            case 12:
                System.out.println("冬季");
                break;
            case 3:
                System.out.println("春季");
                break;
            case 4:
                System.out.println("春季");
                break;
            case 5:
                System.out.println("春季");
                break;
            case 6:
                System.out.println("夏季");
                break;
            case 7:
                System.out.println("夏季");
                break;
            case 8:
                System.out.println("夏季");
                break;
            case 9:
                System.out.println("秋季");
                break;
            case 10:
                System.out.println("秋季");
                break;
            case 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("您输入的月份不存在,哪个星球来的,哥屋恩...");
                break;
        }
        System.out.println("main....end....");//模拟格式中的其它语句
    }
}
