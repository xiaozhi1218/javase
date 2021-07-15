package com.itheima02;
/*
    案例:
        教练安排运动员跑圈,总共跑3次,每次跑三圈

    问题:
        1.外层循环 int i = 1 执行几次? 1次
        2.内层循环 int j = 1 执行几次? 3次
        3.内层循环的循环体执行几次?
            外层循环的次数 * 内层循环每遍执行的次数 = 3 * 3 = 9
    总结:
        外层循环执行1次,内层循环执行完整的(从初始化表达式开始)一遍
 */
public class Demo01ForFor {
    public static void main(String[] args) {
        /*
            外层循环第一次: i = 1 i<=3 --> 1<=3 --> true --> 执行外层循环的循环体
                内层循环:
                    j: 1,2,3(3次执行内层循环的输出语句),
                    4 j<=3 --> 4<=3 --> false --> 结束内层循环,执行外层循环的步进表达式i++,i: 2

            外层循环第二次: i = 2 i<=3 --> 2<=3 --> true --> 执行外层循环的循环体
                内层循环:
                    j: 1,2,3(3次执行内层循环的输出语句),
                    4 j<=3 --> 4<=3 --> false --> 结束内层循环,执行外层循环的步进表达式i++,i: 3

            外层循环第三次: i = 3 i<=3 --> 3<=3 --> true --> 执行外层循环的循环体
                内层循环:
                    j: 1,2,3(3次执行内层循环的输出语句),
                    4 j<=3 --> 4<=3 --> false --> 结束内层循环,执行外层循环的步进表达式i++,i: 4

            外层循环第四次: i = 4 i<=3 --> 4<=3 --> false --> 结束外层循环,执行外层循环后面的其它语句

         */
        for(int i = 1;i<=3;i++){//外层循环: 控制趟/遍数
            System.out.println("教练第"+i+"次说: 你给我跑跑3圈");
            for(int j = 1;j<=3;j++){//内层循环: 控制每趟/遍执行的次数
                System.out.println(("           运动员跑第"+i+"次第" + j + "圈"));
            }
        }
        System.out.println("main...end...");
    }
}