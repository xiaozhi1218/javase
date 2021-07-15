package com.itheima04;


import java.util.Scanner;

/*
    需求：
        一座寺庙里住着三个和尚，已知他们的身高分别为150cm、210cm、165cm，身高需要使用键盘录入
        请用程序实现获取这三个和尚的最高身高。

    实现步骤:
        1.创建键盘录入Scanner类的对象(不用单独先自己写导包)
            (1)写出单词Scanner,然后按alt + / 根据提示选择相应的类 会自动导包
            (2)一边写,根据提示直接选择相应的类,回车会自动导包
        2.获取键盘录入的三个整数数字,分别代表三个和尚的身高,分别保存到int变量h1,h2,h3中
        3.使用三元运算符求出h1和h2的最大身高,保存到int变量temp中
        4.使用三元运算符求出temp和h3的最大身高,保存到int变量max中
        5.打印max的值
 */
public class Demo03ScannerMax {
    public static void main(String[] args) {
        //1.创建键盘录入Scanner类的对象(不用单独先自己写导包)
        Scanner sc = new Scanner(System.in);
        //2.获取键盘录入的三个整数数字,分别代表三个和尚的身高,分别保存到int变量h1,h2,h3中
        System.out.println("请输入第一个和尚的身高(整数数字): ");
        int h1 = sc.nextInt();

        System.out.println("请输入第二个和尚的身高(整数数字): ");
        int h2 = sc.nextInt();

        System.out.println("请输入第三个和尚的身高(整数数字): ");
        int h3 = sc.nextInt();

        System.out.println(h1 + "..." + h2 + "..." + h3);

        //3.使用三元运算符求出h1和h2的最大身高,保存到int变量temp中
        int temp = (h1 > h2) ? h1 : h2;

        //4.使用三元运算符求出temp和h3的最大身高,保存到int变量max中
        int max = (temp>h3) ? temp : h3;

        //5.打印max的值
        System.out.println("三个和尚的最大身高: "+max);
    }
}
