package com.itheima03;
/*
    三种循环的区别总结
        1.建议使用的顺序:for,while,do-while
        2.循环次数确定的话,建议使用for,循环次数不确定建议使用while 【后面有使用场景】
            循环次数不确定需要先写成死循环的格式【while好看】    --------后天讲解
        3.do-while循环来讲的话,至少执行一次
        4.while和do-while循环而言,循环结束后,初始化条件中定义的变量可以继续使用,
            但是for循环的不能使用(在for循环内部定义初始化语句)
 */
public class Demo02Diff {
    public static void main(String[] args) {
        //3.do-while循环来讲的话,至少执行一次

        //for循环: 先判断条件,后执行循环体
        //for循环第一次布尔表达式都不成立(false): 循环体一次都不执行
        //第一次: i>5 --> 3>5 --> false 不执行循环体,直接执行for循环后面的输出语句
        for (int i = 3; i > 5; i++) {
            System.out.println("Hello...for...");
        }
        System.out.println("for...end...");

        //while循环: 先判断条件,后执行循环体
        //while循环第一次布尔表达式都不成立(false): 循环体一次都不执行
        //第一次: j>5 --> 3>5 --> false 不执行循环体,直接执行while循环后面的输出语句
        int j = 3;
        while (j > 5) {
            System.out.println("Hello...while...");
            j++;
        }
        System.out.println("while...end...");

        //do-while循环: 先执行循环体,再判断条件
        //do-while循环第一次布尔表达式都不成立(false): 循环体会至少执行一次(先执行,后判断条件)
        //第一次: 定义int变量k的值3,接着执行{}中的循环体,k的值变成4
        //再执行判断条件k>5 --> 4>5 --> false 结束do-while循环执行do-while后面的输出语句
        int k = 3;
        do{
            System.out.println("Hello...do-while...");
            k++;//4
        } while(k>5);//k>5 --> 4>5 --> false 结束do-while循环执行do-while后面的输出语句
        System.out.println("do-while...end...");
    }
}
