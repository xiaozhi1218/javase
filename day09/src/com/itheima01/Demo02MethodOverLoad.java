package com.itheima01;
/*
    方法重载
        1.概念:
            在同一个类中,多个功能相同,但是参数列表不同的多个方法,
            可以使用相同的名称,这种多个同名不同参的方法,可以同时存在一个类中的现象,就叫做方法重载
            比如:
                比如某个类中已经有了一个名称为method的方法,还可以再定义名称为method的方法,但是
                要求这些名称为method的方法的参数列表必须不同

        2.作用/目的:
            (1)减少程序员的学习和使用成本(原来需要记住四个名称复杂的方法,现在只需要记住一个名称简单的方法)
            (2)减少了方法名称的数量

        3.调用
            (1)根据名称找到对应的方法
            (2)根据参数的数量找到对应的方法
            (3)根据参数的类型确定最终要调用的方法
                (首先: 做类型完全匹配 其次: 完全匹配的找不到,再做自动类型提升的匹配)
 */
public class Demo02MethodOverLoad {
    public static void main(String[] args) {
        //打印/输出调用方法: 传递常量
        System.out.println(getSum(10,20));
        System.out.println(getSum(10,20,30));
        System.out.println(getSum(10.0,20.0));
        System.out.println(getSum(10.0,20.0,30.0));
    }

    //1.定义一个获取两个int数字之和的方法
    public static int getSum(int a, int b) {
        System.out.println("...两个int.....");
        return a + b;
    }

    //2.定义一个获取三个int数字之和的方法
    public static int getSum(int a, int b,int c) {
        System.out.println("...三个int.....");
        return a + b + c;
    }

    //3.定义一个获取两个double数字之和的方法
    public static double getSum(double a, double b) {
        System.out.println("...两个double.....");
        return a + b;
    }

    //4.定义一个获取三个double数字之和的方法
    public static double getSum(double a, double b,double c) {
        System.out.println("...三个double.....");
        return a + b + c;
    }


}
