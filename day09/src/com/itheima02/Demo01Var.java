package com.itheima02;
/*
    注意:
        1.使用=进行赋值的特点:
            把基本类型变量a的值赋值给基本类型变量b时,其实是把a中的值复制一份给变量b,
            之后不管如何修改变量b中的值,都不会影响变量a中的值

        2.变量的作用范围:
            方法内部定义的变量只在所定义的方法内有效(可以使用),出了方法的作用范围,就不能使用了
            局部变量: 方法内部定义的变量或者方法定义时()中定义的变量

 */
public class Demo01Var {
    public static void main(String[] args) {
        //定义int变量a,并初始化
        int a = 20;

        //定义int变量b,未初始化
        int b;

        b = a;//把变量a中的值赋值给变量b

        System.out.println("a="+a);//20
        System.out.println("b="+b);//20

        b = b*10;

        System.out.println("a="+a);//20
        System.out.println("b="+b);//200

        method();

        //System.out.println(num);//错误: num是在method方法内部定义,只在method方法内部有效
    }

    public static void method(/*int m*/) {
        int num = 100;
        System.out.println(num);
        //System.out.println(a);//错误: a是在main方法内部定义,只在main方法内部有效
    }
}
