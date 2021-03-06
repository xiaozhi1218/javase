package com.itheima04;
import java.util.Scanner;
/*
    键盘录入练习:
        需求：
            获取键盘录入的两个整数(int类型)数字,在控制台输出求和的结果。

        实现步骤:
            1.导包: import java.util.Scanner
            2.创建键盘录入Scanner类的对象: Scanner sc = new Scanner(System.in)
            3.获取键盘录入的两个整数数字,分别保存到int变量a和b中
            4.计算a和b的和,保存到int变量sum中
            5.打印sum的值
 */
public class Demo02ScannerSum {
    public static void main(String[] args) {
        //1.导包: import java.util.Scanner
        //2.创建键盘录入Scanner类的对象: Scanner sc = new Scanner(System.in)
        Scanner sc = new Scanner(System.in);

        //3.获取键盘录入的两个整数数字,分别保存到int变量a和b中
        System.out.println("请输入第一个整数数字: ");
        int a = sc.nextInt();

        System.out.println("请输入第二个整数数字: ");
        int b = sc.nextInt();

        System.out.println(a+"...."+b);

        //4.计算a和b的和,保存到int变量sum中
        int sum = a + b;

        //5.打印sum的值
        System.out.println("和: "+sum);
    }
}
