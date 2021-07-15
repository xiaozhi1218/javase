package com.itheima01;
/*
    方法重载与哪些因素无关?
        1.与参数的名称无关
        2.与返回值类型无关
        3.与修饰符无关

    总结：
        在多个方法同名的前提下,
        只看多个方法的参数(除了名称以外)有区别,就构成重载
 */
public class Demo04OverLoadNotice {
    public static void main(String[] args) {

    }

    //1.此方法只有一个int类型参数
    public static void method(int a) {

    }
    //2.此方法只有一个int类型参数
    //方法2和方法1,只有参数的名称不同,无法构成重载
    /*public static void method(int num) {

    }*/
    //3.此方法只有一个int类型参数
    //方法3和方法1,只有返回值类型不同,无法构成重载
    /*public static int method(int a) {
        return 0;
    }*/

    //4.此方法只有一个int类型参数
    //方法4和方法1,只有修饰符不同,无法构成重载
    /*void method(int a) {

    }*/
}
