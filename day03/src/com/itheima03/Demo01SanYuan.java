package com.itheima03;
/*
    三元运算符练习
        需求：
            动物园里有两只老虎，已知两只老虎的体重分别为180kg、200kg，
            请用程序实现判断两只老虎的体重是否相同。==

        实现步骤:
            1.定义两个int变量w1和w2,分别代表两只老虎的体重,并按照题目要求进行初始化
            2.使用三元运算符判断w1和w2的值是否相同,保存到boolean变量result中
            3.打印result的值
 */
public class Demo01SanYuan {
    public static void main(String[] args) {
        //1.定义两个int变量w1和w2,分别代表两只老虎的体重,并按照题目要求进行初始化
        int w1 = 180, w2 = 200;

        //2.使用三元运算符判断w1和w2的值是否相同,保存到boolean变量result中

        boolean result = (w1 == w2) ? true : false;

        //3.打印result的值
        System.out.println("两只老虎的体重相同吗? "+result);

        System.out.println("---------------");

        String s = (w1 == w2) ? "相同" : "不相同";

        System.out.println("两只老虎的体重相同吗? "+s);
    }
}
