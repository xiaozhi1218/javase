package com.itheima06;
/*
    形式参数和实际参数的区别
        1.形式参数:
            (1)概念: 定义方法时()中定义的参数(定义变量),叫做形式参数
            (2)特点:
                a.定义形式参数的时候,是没有值的
                b.当调用该方法时,形式参数才会有值

        2.实际参数:
            (1)概念: 调用方法时()中给出的参数(常量/变量),叫做实际参数
            (2)特点:
                a.调用方法时,()中写的数据(常量/变量)
                b.必须要有值才可以
 */
public class Demo03ParamDiff {
    public static void main(String[] args) {
        System.out.println("main...start...");
        /*
            2.实际参数:
                (1)概念: 调用方法时()中给出的参数(常量/变量),叫做实际参数
                (2)特点:
                    a.调用方法时,()中写的数据(常量/变量)
                    b.必须要有值才可以
         */
        //调用方法: 传递常量
        printSum(10,20);//10,20叫做实际参数

        //调用方法: 传递变量
        int m = 100,n = 200;

        printSum(m,n);//m,n叫做实际参数


        System.out.println("main...end...");
    }

    /*
        1.形式参数:
            (1)概念: 定义方法时()中定义的参数(定义变量),叫做形式参数
            (2)特点:
                a.定义形式参数的时候,是没有值的
                b.当调用该方法时,形式参数才会有值
     */
    //定义方法,打印2个int数字之和
    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("和: "+sum);
        return ;//结束方法,返回到方法的调用处,注意没有带回任何数据
    }
}
