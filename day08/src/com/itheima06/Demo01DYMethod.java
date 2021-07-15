package com.itheima06;
/*
    有返回值的方法调用方式
        1.赋值调用: 把有返回值的方法的调用结果保存到对应的变量中              ----推荐使用----
            数据类型 变量名称 = 方法名称(参数...);

        2.输出/打印调用: 把有返回值的方法的调用结果直接交给输出语句
            System.out.println(方法名称(参数...));

        3.单独调用: 既不保存方法的结果,也没有对结果进行输出                   -----不推荐使用,没有意义-----
            方法名称(参数...);
 */
public class Demo01DYMethod {
    public static void main(String[] args) {
        System.out.println("main...start...");

        //1.赋值调用: 把有返回值的方法的调用结果保存到对应的变量中
        //数据类型 变量名称 = 方法名称(参数...);
        int result = getSum(10,20);
        //可以对结果数据做其它操作
        //result *= 100;
        System.out.println("和: "+result);

        //2.输出/打印调用: 把有返回值的方法的调用结果直接交给输出语句
        //System.out.println(方法名称(参数...));
        System.out.println(getSum(100,200));

        //3.单独调用: 既不保存方法的结果,也没有对结果进行输出
        getSum(5,10);

        System.out.println("main...end...");
    }

    //定义方法,获取2个int数字之和
    public static int getSum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
