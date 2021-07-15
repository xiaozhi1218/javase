package com.itheima03;
/*
    带参数无返回值的方法练习
        方法是否需要参数:
            分析方法需求中是否具有不确定的东西

        方法是否需要返回值:
            如果方法需求中能够明确看到打印/输出二字,说明该方法不需要返回值,返回值类型固定写为void

    1.练习:
	    定义一个方法用于打印两个int数字中的较大数，数据来自于方法参数

    2.三要素:
        (1)方法名称: printMax
	    (2)参数列表: int a,int b
	    (3)返回值类型: void

    练习中如果没有明确数据类型,默认int类型
 */
public class Demo02PrintMax {

    public static void main(String[] args) {

        System.out.println("main...start...");

        //调用方法: 传递的是常量
        printMax(10,20);

        //调用方法方法: 传递变量
        int m = 100;
        int n = 200;
        printMax(m,n);


        System.out.println("main...end...");

    }

    //定义一个方法用于打印两个int数字中的较大数，数据来自于方法参数
    /*
        你调用我的方法printMax时,必须给我传递两个int类型的数据,
        我printMax方法内部执行完毕后直接打印输出最大值的结果
        你: 方法的调用者
        我: 方法本身
     */
    public static void printMax(int a, int b) {

        int max = (a>b) ? a : b;

        System.out.println("最大值: "+max);

        return ;//结束方法,返回到方法的调用处
    }
}
