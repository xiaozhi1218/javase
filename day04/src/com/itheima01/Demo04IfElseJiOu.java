package com.itheima01;

import java.util.Scanner;

/*
    if-else 练习
        需求：
            任意给出一个整数，请用程序实现判断该整数是奇数还是偶数，
            并在控制台输出该整数是奇数还是偶数。

        实现步骤:
            1.创建键盘录入Scanner类的对象
            (1.导包: import java.util.Scanner; 2.创建对象: Scanner sc = new Scanner(System.in);)
            2.获取键盘录入的整数数字,保存到int变量num中
            3.使用if语句的第二种格式(if-else),判断num中的数字,输出对应的奇偶数情况
                num%2==0: 说明num中的数字是偶数
                num%2!=0: 说明num中的数字是奇数
 */
public class Demo04IfElseJiOu {
    public static void main(String[] args) {
        //1.创建键盘录入Scanner类的对象
        //(1.导包: import java.util.Scanner; 2.创建对象: Scanner sc = new Scanner(System.in);)
        Scanner sc = new Scanner(System.in);

        //2.获取键盘录入的整数数字,保存到int变量num中
        System.out.println("请输入一个整数数字: ");
        int num = sc.nextInt();
        //System.out.println("您输入的整数是: "+num);

        //3.使用if语句的第二种格式(if-else),判断num中的数字,输出对应的奇偶数情况
        /*if(num%2==0){
            System.out.println(num+"是一个偶数数字");
        } else {
            System.out.println(num+"是一个奇数数字");
        }*/

        if(num%2!=0){
            System.out.println(num+"是一个奇数数字");
        } else {
            System.out.println(num+"是一个偶数数字");
        }


        System.out.println("main....end....");//模拟格式中的其它语句

    }
}
