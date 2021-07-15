package com.itheima01;
/*
    需求:
        求1-5之间的数据和，并把求和结果在控制台输出

    实现步骤:
        1.定义int变量sum,用来求和,初始值0
        2.使用for循环获取1-5的数字
        2.1把当前数字累加到求和变量sum中
        3.打印求和变量sum
 */
public class Demo03ForSum5 {
    public static void main(String[] args) {

        //1.定义int变量sum,用来求和,初始值0
        int sum = 0;

        /*
            第一次: sum = 0   i = 1
                 i <= 5 --> 1<=5 --> true --> sum = sum + i = 0 + 1 = 1  i = 2

            第二次: sum = 1   i = 2
                i <= 5 --> 2<=5 --> true --> sum = sum + i = 1 + 2 = 3  i = 3

            第三次: sum = 3   i = 3
                i <= 5 --> 3<=5 --> true --> sum = sum + i = 3 + 3 = 6  i = 4

            第四次: sum = 6   i = 4
                i <= 5 --> 4<=5 --> true --> sum = sum + i = 6 + 4 = 10  i = 5

            第五次: sum = 10   i = 5
                i <= 5 --> 5<=5 --> true --> sum = sum + i = 10 + 5 = 15  i = 6

            第六次: sum = 15   i = 6
                i <= 5 --> 6<=5 --> false --> 结束for循环,执行for后面的代码
         */

        //2.使用for循环获取1-5的数字
        for (int i = 1; i <= 5; i++) {
            //2.1把当前数字累加到求和变量sum中
            sum = sum + i;
        }

        //3.打印求和变量sum
        System.out.println("1-5的数字之和: "+sum);
    }
}
