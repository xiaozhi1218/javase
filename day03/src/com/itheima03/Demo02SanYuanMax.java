package com.itheima03;

/*
    三元运算符练习:
        需求：
            动物园里有两只老虎，已知两只老虎的体重分别为180kg、200kg，
            请用程序实现计算两只老虎的体重的最大值。

        实现步骤:
            1.定义两个int变量w1和w2,分别代表两只老虎的体重,并按照题目要求进行初始化
            2.使用三元运算符,计算w1和w2的最大值,把结果保存到int变量max中
            3.打印max的值
 */
public class Demo02SanYuanMax {
    public static void main(String[] args) {
        //1.定义两个int变量w1和w2,分别代表两只老虎的体重,并按照题目要求进行初始化
        int w1 = 180, w2 = 200;

        //2.使用三元运算符,计算w1和w2的最大值,把结果保存到int变量max中

        int max = (w2 > w1) ? w2 : w1;

        //3.打印max的值
        System.out.println("两只老虎体重的最大值: "+max);
    }
}
