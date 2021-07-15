package com.itheima04;

/*
    有参数有返回值的方法练习
        方法是否需要参数:
            分析方法需求中是否具有不确定的东西

        方法是否需要返回值:
            如果方法需求中能够明确看到打印/输出二字,说明该方法不需要返回值,返回值类型固定写为void
            如果方法需求中能够明确看到获取/返回/判断二字,说明该方法需要返回值,必须定义具体的返回值类型

    1.练习:
	    设计一个方法可以获取两个int数的较大值，数据来自于参数

    2.三要素:
        (1)方法名称: getMax
	    (2)参数列表: int a,int b
	    (3)返回值类型: int

    练习中如果没有明确数据类型,默认int类型
 */
public class Demo02GetMax {

    public static void main(String[] args) {

        System.out.println("main...start...");

        //调用方法: 传递的是常量
        int result = getMax(100,200);
        System.out.println("100和200的最大值: "+result);

        //调用方法方法: 传递变量
        int a = 10, b = 20;
        int max = getMax(a,b);
        System.out.println(a+"和"+b+"的最大值: "+max);

        System.out.println("main...end...");

    }

    //设计一个方法可以获取两个int数的较大值，数据来自于参数
    /*
        你调用我的方法getMax时,必须给我传递两个int类型的数据,
        我getMax方法内部执行完毕后,会返还给你一个int类型的数据
        你: 方法的调用者
        我: 方法本身
        有进(参数)有出(返回值)
     */
    //int: 告诉方法的调用者,方法功能代码执行完毕后,会返回数据的具体类型(会返回一个什么样子的数据)
    public static int getMax(int a, int b) {

        int max = (a>b) ? a : b;

        return max;//结束方法,并且把max中的数据,返还给方法的调用处/者
    }
}
