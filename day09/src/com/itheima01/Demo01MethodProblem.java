package com.itheima01;
/*
    需求:
        1.定义一个获取两个int数字之和的方法
        2.定义一个获取三个int数字之和的方法
        3.定义一个获取两个double数字之和的方法
        4.定义一个获取三个double数字之和的方法

    定义一个获取两个int数字之和的方法
        三要素:
            1.方法名称:     getTwoIntNumSum
            2.参数列表:     int a,int b
            3.返回值类型:   int

    发现问题:
        以下四个方法都是完成求和功能,但是参数列表是互不相同的,
        但是我们给每个方法起了一个相当之复杂的名字,
        导致程序员学习和使用方法的成本增加(记不住,太复杂)

    解决方案:
        方法重载
 */
public class Demo01MethodProblem {
    public static void main(String[] args) {
        //打印/输出调用方法: 传递常量
        System.out.println(getTwoIntNumSum(10,20));
        System.out.println(getThreeIntNumSum(10,20,30));
        System.out.println(getTwoDoubleNumSum(10.0,20.0));
        System.out.println(getThreeDoubleNumSum(10.0,20.0,30.0));
    }

    //1.定义一个获取两个int数字之和的方法
    public static int getTwoIntNumSum(int a, int b) {
        return a + b;
    }

    //2.定义一个获取三个int数字之和的方法
    public static int getThreeIntNumSum(int a, int b,int c) {
        return a + b + c;
    }

    //3.定义一个获取两个double数字之和的方法
    public static double getTwoDoubleNumSum(double a, double b) {
        return a + b;
    }

    //4.定义一个获取三个double数字之和的方法
    public static double getThreeDoubleNumSum(double a, double b,double c) {
        return a + b + c;
    }
}
