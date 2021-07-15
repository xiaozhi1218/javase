package com.itheima03;
/*
    带参数无返回值的方法练习
        方法是否需要参数:
            分析方法需求中是否具有不确定的东西

        方法是否需要返回值:
            如果方法需求中能够明确看到打印/输出二字,说明该方法不需要返回值,返回值类型固定写为void

    1.练习:
	    定义一个方法，打印一个整数数字是否是偶数

    2.三要素:
        (1)方法名称: printOu
	    (2)参数列表: int num
	    (3)返回值类型: void

    练习中如果没有明确数据类型,默认int类型
 */
public class Demo01PrintOu {

    public static void main(String[] args) {

        System.out.println("main...start...");

        //调用方法: 传递的是常量
        printOu(11 );

        //调用方法方法: 传递变量
        int a = 12;
        printOu(a);

        System.out.println("main...end...");

    }

    //定义一个方法，打印一个整数数字是否是偶数
    /*
        你调用我的方法printOu时,必须给我传递一个int类型的数据,
        我printOu方法内部执行完毕后直接打印输出结果
        你: 方法的调用者
        我: 方法本身
        有进无出
     */
    public static void printOu(int num) {

        boolean result = (num%2==0) ? true : false;

        System.out.println(num+"是偶数吗? "+result);

        return ;//结束方法,返回到方法的调用处
    }
}
