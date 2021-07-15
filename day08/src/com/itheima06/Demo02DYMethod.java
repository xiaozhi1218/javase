package com.itheima06;
/*
    无返回值的方法调用方式

        1.单独调用: 既不保存方法的结果,也没有对结果进行输出            只能采用单独调用
            方法名称(参数...);

        2.赋值调用: 把有返回值的方法的调用结果保存到对应的变量中       不能赋值调用
            数据类型 变量名称 = 方法名称(参数...);

        3.输出/打印调用: 把有返回值的方法的调用结果直接交给输出语句    不能输出调用
            System.out.println(方法名称(参数...));
 */
public class Demo02DYMethod {
    public static void main(String[] args) {
        System.out.println("main...start...");
        //1.单独调用: 既不保存方法的结果,也没有对结果进行输出
        //方法名称(参数...);
        printSum(10,20);

        //2.赋值调用: 把有返回值的方法的调用结果保存到对应的变量中
        //数据类型 变量名称 = 方法名称(参数...);
        //int a = printSum(5,15);//错误的,int变量只能保存整数,但是printSum方法执行结束没有返回任何结果数据
        //void a = printSum(5,15);//错误的,void根本不是数据类型

        //3.输出/打印调用: 把有返回值的方法的调用结果直接交给输出语句
        //System.out.println(方法名称(参数...));
        //System.out.println(printSum(3,2));//错误: 因为printSum方法执行完毕后,没有任何结果返回

        System.out.println("main...end...");
    }

    //定义方法,打印2个int数字之和
    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("和: "+sum);
        return ;//结束方法,返回到方法的调用处,注意没有带回任何数据
    }
}
