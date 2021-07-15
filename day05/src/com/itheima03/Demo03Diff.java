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
public class Demo03Diff {
    public static void main(String[] args) {
        //4.while和do-while循环而言,循环结束后,初始化条件中定义的变量可以继续使用,
        //但是for循环的不能使用(在for循环内部定义初始化语句)
        for (int i = 1; i <= 3; i++) {
            System.out.println("Hello...for...in..."+i);
        }
        //错误: i是在for循环内部定义,只能在for循环内部使用
        //出了for循环,就不可以继续使用
        //System.out.println("Hello...for...out..."+i);
        System.out.println("Hello...for...out...");

        //while循环
        int j = 1;
        while (j <= 3) {
            System.out.println("Hello...while...in..."+j);
            j++;
        }
        //while循环: 初始化语句中定义的变量,while循环结束后仍然可以使用
        System.out.println("Hello...while...out..."+j);

        //do-while循环
        int k = 1;
        do{
            System.out.println("Hello...do-while...in..."+k);
            k++;
        } while(k<=3);
        //do-while循环: 初始化语句中定义的变量,do-while循环结束后仍然可以使用
        System.out.println("Hello...do-while...out..."+k);
    }
}
