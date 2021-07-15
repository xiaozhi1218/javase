package com.itheima01;
/*
    方法重载中参数列表不同有哪些情况?
        1.参数数量不同
        2.参数类型不同
        3.多个类型,顺序不同
 */
public class Demo03OverLoadNotice {
    public static void main(String[] args) {
        method(10,10.0);
    }

    //1.此方法只有一个int类型参数
    public static void method(int a) {

    }
    //2.此方法只有两个int类型参数
    //方法2和方法1参数的数量是不同的,可以构成重载
    public static void method(int a,int b) {

    }
    //3.此方法只有一个double类型参数
    //方法3和方法2参数的数量是不同的,可以构成重载
    //方法3和方法1参数虽然都是只有一个,但是类型不同,可以构成重载
    public static void method(double a) {

    }

    //4.此方法有一个int类型参数和一个double类型参数
    public static void method(int a,double b){

    }
    //5.此方法有一个double类型参数和一个int类型参数
    //方法5和方法4,虽然参数都是2个,但是类型的顺序不同
    public static void method(double a,int b){

    }
}

