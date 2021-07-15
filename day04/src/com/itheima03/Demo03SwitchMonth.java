package com.itheima03;

import java.util.Scanner;

/*
    使用case穿透优化根据月份输出对应的季节的案例
        发现问题:
            前面Demo02SwitchMonth.java文件中出现了大量的重复的代码
            1,2,12代码重复,3,4,5代码重复,6,7,8代码重复,9,10,11代码重复
            每三个case中的代码都是相同的

    解决方案使用case穿透:
        如果多个连续的case中具有相同的代码和break,可以只保留最后一个case中的代码和break,
        前面的多个case中省略掉代码和break(只保留case)

        在switch语句中，如果case的后面不写break，将出现穿透现象，
        也就是不会在判断下一个case的值，直接向后运行，直到遇到break，或者整体switch结束。

    执行步骤:
        1.先找到case入口: 先找到常量值和switch表达式值相同的case
        2.执行找到的case入口中的代码:
            如果没有break,直接执行(不再判断下一个case中的常量值是否和switch表达式的值是否相同)下一个case中的代码,
            直到遇到break,结束switch语句

 */
public class Demo03SwitchMonth {
    public static void main(String[] args) {
        //1.创建键盘录入Scanner类的对象
        Scanner sc = new Scanner(System.in);

        //2.获取键盘录入的一个1-12的整数数字(代表月份),保存到int变量month中
        System.out.println("请输入一个1-12的整数数字(代表月份): ");
        int month = sc.nextInt();

        //3.因为month中的数字有12+1中情况,使用switch语句对month中的值,进行判断,并输出不同的结果
        switch (month) {//9
            case 1:
            case 2:
            case 12:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
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

