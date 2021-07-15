package com.itheima02;
/*
    基本数据类型作为方法参数
    注意:
        1.基本类型变量: 保存的是具体的数据值
        2.基本类型变量作为形式参数,
            形式参数的改变,不会影响实际参数


    基本类型变量作为形式参数:
        定义方法时,()中定义的参数属于基本类型

    不会影响实际参数: 调用方法时,()中给出的参数
 */
public class Demo02BaseVar {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("ms...a="+a);//10
        System.out.println("ms...b="+b);//20
        //调用方法
        change( a , b );
        System.out.println("me...a="+a);//10
        System.out.println("me...b="+b);//20
    }

    public static void change(int a, int b) {
        System.out.println("cs...a="+a);//10
        System.out.println("cs...b="+b);//20
        a = a*10;
        b = b*10;
        System.out.println("ce...a="+a);//100
        System.out.println("ce...b="+b);//200
    }
}
