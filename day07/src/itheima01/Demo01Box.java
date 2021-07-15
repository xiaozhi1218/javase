package itheima01;
/*
    变量中只能存储一个数据,新的数据进来,老的数据将被替换,如果需要存储多个数据,需要使用容器。

    容器概念
        容器：是将多个数据存储到一起，每个数据称为该容器的元素。
        生活中的容器：水杯，衣柜，鞋柜，教室

    数组：
        1.概念： java中的数组就是一个容器，可以存储多个数据，但是数据的类型必须一致
        2.特点：
            (1)可以存储多个数据
            (2)多个数据的类型必须保持一致
            (3)数组一旦创建,长度是永远不可以发生改变

 */
public class Demo01Box {
    public static void main(String[] args) {
        //定义一个int变量num,并初始化
        //一个变量中只能存储一个数据
        int num = 10;
        System.out.println(num);

        //新的数据进来,老的数据将被替换
        num = 20;
        System.out.println(num);


        //比如我们班有80个学生需要参加考试,每个学生对应一个成绩(整数)
        //可以定义80个int变量
        int a = 80;
        int b = 90;
        int c = 70;
        int d = 50;
        int e = 85;
        int f = 95;
        int g = 59;
        int h = 63;

        //需要求总分
        int sum = a + b + c + d + e + f + g + h;

        //需要求平均分
        int avg = sum/80;

        //需要求最高分和最低分: 实现起来非常麻烦


    }
}
