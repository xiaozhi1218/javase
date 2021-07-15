package com.itheima05;
/*
	方法的注意事项
        1.方法不能嵌套定义(在定义方法的内部又定义了其它方法),可以调用其它方法
        2.方法可以嵌套调用
        3.返回值类型，必须要和 return 语句返回的数据的类型要匹配，否则编译失败 。
        4.不能在 return 后面写代码， return 意味着方法结束，所有后面的代码永远不会执行，属于无效代码。
        5.void表示无返回值，可以省略return，也可以单独的书写return，后面不加数据
 */
public class Demo01Notice {
    public static void main(String[] args) {
        //1.调用getNum方法,获取一个int数字
        int num = getNum();
        //2.调用printNum方法,打印一个int数字
        printNum(num);

        //方法的嵌套调用
        //先执行getNum方法:获取一个整数数字
        //再把整数数字交给printNum方法做打印输出
        printNum(getNum());
    }
    //定义方法
    public static void method() {
        System.out.println("method....");
        //错误: 方法不能嵌套定义方法
        /*public static void show() {
            System.out.println("show....");
        }*/
    }

    //打印int数字
    public static void printNum(int num) {
        System.out.println(num);
    }
    //获取一个int数字
    public static int getNum() {
        return 100;
    }
}
