package com.itheima01;

import java.util.Scanner;

/*
    if-else 练习
        需求：
            任意给出两个整数，请用程序实现求出两个整数的最大值,并输出到控制台。

        实现步骤:
            1.创建键盘录入Scanner类的对象
            2.获取两个键盘录入的整数数字,分别保存到2个int变量a和b中
            3.定义int变量max,作用是用来保存两个int数字的最大值
            4.使用if-else对a和b中的值进行大小判断
            4.1如果: a>b 是成立的,说明a是最大的,把a的值赋值给变量max
            4.2否则: a>b 是不成立的,说明b是最大的,把b的值赋值给变量max
            5.打印max的值

 */
public class Demo05IfElseMax {
    public static void main(String[] args) {

        //1.创建键盘录入Scanner类的对象
        Scanner sc = new Scanner(System.in);

        //2.获取两个键盘录入的整数数字,分别保存到2个int变量a和b中
        System.out.println("请输入第一个整数数字: ");
        int a = sc.nextInt();

        System.out.println("请输入第二个整数数字: ");
        int b = sc.nextInt();

        //3.定义int变量max,作用是用来保存两个int数字的最大值
        int max;

        //4.使用if-else对a和b中的值进行大小判断
        if(a>b) {//10 > 20 ==> false
            //4.1如果: a>b 是成立的,说明a是最大的,把a的值赋值给变量max
            max = a;
        } else {
            //4.2否则: a>b 是不成立的,说明b是最大的,把b的值赋值给变量max
            max = b;
        }
        //5.打印max的值
        //System.out.println("数字 "+a+"和"+b+"的最大值是: "+max);
        System.out.println("最大值: "+max);

        System.out.println("main....end....");//模拟格式中的其它语句
    }
}
