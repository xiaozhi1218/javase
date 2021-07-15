package com.itheima02;
/*
    无返回值无参数方法的定义和调用
        无参数:
            目前没有参数,不需要写参数列表,但是必须保留小括号()
        无返回值:
            目前定义的方法没有返回值,返回值类型固定写为void
            方法内部没有数据返还给调用者,没有返回值,返回值类型固定写为void

    1.练习:
	    定义一个方法，打印输出该方法内部的数据(方法内部定义的变量)是否是偶数

    2.注意:
	    (1)方法定义完毕后不调用不执行
	    (2)调用格式:
            方法名称(...);
        (3)方法可以调用任意多次

    练习中如果没有明确数据类型,默认int类型
 */
public class Demo01PrintOu {

    public static void main(String[] args) {

        System.out.println("main...start...");

        //调用方法
        printOu();

        System.out.println("main...end...");

    }

    //定义一个方法，打印输出该方法内部的数据(方法内部定义的变量)是否是偶数
    public static void printOu() {

        int num = 12;

        boolean result = (num%2==0) ? true : false;

        System.out.println(num+"是偶数吗? "+result);

        return ;//结束方法,返回到方法的调用处,建议省略
    }
}
