package com.itheima05;
/*
	方法的注意事项
        1.方法不能嵌套定义(在定义方法的内部又定义了其它方法),可以调用其它方法
        2.方法可以嵌套调用
        3.返回值类型，必须要和 return 语句返回的数据的类型要匹配，否则编译失败 。
        4.不能在 return 后面写代码， return 意味着方法结束，所有后面的代码永远不会执行，属于无效代码。
        5.void表示无返回值，可以省略return，也可以单独的书写return，后面不能加数据,写个分号
 */
public class Demo02Notice {
    public static void main(String[] args) {

    }

    //3.返回值类型，必须要和 return 语句返回的数据的类型要匹配，否则编译失败 。
    public static double getDoubleNum() {
        //return 6.6;//6.6就是一个double类型的数字
        //return 6.6F;//6.6F是一个float类型的数字,可以自动类型提升为double类型
        return 6;//6是一个int类型的数字,可以自动类型提升为double类型
    }

    //4.不能在 return 后面写代码， return 意味着方法结束，所有后面的代码永远不会执行，属于无效代码。
    public static int getMax(int a,int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
        //System.out.println("getMax...end...");//错误的,return后面不能写其他代码
    }

    //5.void表示无返回值，可以省略return，也可以单独的书写return，后面不能加数据,写个分号
    public static void method() {
        System.out.println("method....");
        return ;//建议省略return
    }
}
