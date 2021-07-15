package com.itheima03;

import java.util.Random;

/*
    1.概念:	java.util.Random类就是用来产生随机数字的,也是一种引用类型
    2.随机数Random类的使用步骤:
        和Scanner的使用步骤是相同的
        (1)导包(找到我们要使用的东西)
            格式:
                import 包名.类名;
                import java.util.Random;
            快捷键:
                alt + 回车
            注意:
                a.java.lang包下的东西可以直接使用,不用导包
                b.当前类和要使用的类,处于同一个包中,也不用导包
         (2)创建对象
            类名 对象名 = new 类名(...);
            类名: 之前写代码时,class关键字后面的名称

            创建Scanner类的对象: Scanner sc = new Scanner(System.in);//其中: System.in 是固定写法


            创建Random类的对象: Random r = new Random();//其中: ()中什么都不用写,固定格式

        (3)使用
            Scanner中获取键盘录入的整数: int num = sc.nextInt();
            Random中产生随机整数数字:
                r.nextInt(): 产生一个int范围内(正负21亿)的随机数字
                r.nextInt(int类型整数数字n): 产生一个0到n之间的随机数字(包含0,但是不包含n)
                    其中: 圆括号()中的int类型整数数字n表示产生随机数字的上限范围

    3.练习:
        (1)产生10个int范围内的整数数字
        (2)产生10个0到100之间(包含0,但是不包含100)的整数数字
        (3)产生10个1到100之间(包含1,包含100)的整数数字
            [1,100] --> [0,99] + 1 --> [0,100) + 1 --> r.nextInt(100) + 1

        思考:
            产生10个66到178之间(包含66,包含178)的整数数字
 */
public class Demo01Random {
    public static void main(String[] args) {
        //创建Random类的对象
        Random r = new Random();

        //(1)产生10个int范围内的整数数字
        for (int i = 0; i < 10; i++) {
            //产生1个int范围内的整数数字
            int num = r.nextInt();
            System.out.println(num);
        }
        System.out.println("---------------");

        //(2)产生10个0到100之间(包含0,但是不包含100)的整数数字
        //r.nextInt(100): 产生0到100之间的1个随机数字,但是可以产生0,一定不会产生100(包含0,不包含100) [0,100) <==> [0,99]
        for (int i = 0; i < 10; i++) {
            //产生1个0到100之间(包含0,但是不包含100)的整数数字
            int num = r.nextInt(100);
            System.out.println(num);
        }
        System.out.println("---------------");

        //(3)产生2个1到5之间(包含1,包含5)的整数数字
        /*
            如果可以产生: 0,1,2,3,4           ==>[0,4] ==> [0,5) ==> r.nextInt(5)
            之后:                 +1         r.nextInt(5) + 1
            结果:        1,2,3,4,5
         */
        for (int i = 0; i < 2; i++) {
            //产生1个1到5之间(包含1,包含5)的整数数字
            int num = r.nextInt(5) + 1;
            System.out.println(num);
        }
        System.out.println("---------------");

        //(4)产生10个1到100之间(包含1,包含100)的整数数字
        /*
            先产生0到99的随机数字(包含0,包含99) --> r.nextInt(100)
            +1
            结果是1到100的随机数字(包含1,包含100) --> r.nextInt(100) + 1
         */
        for (int i = 0; i < 10; i++) {
            //产生1个1到100之间(包含1,包含100)的整数数字
            int num = r.nextInt(100) + 1;//[0,99]+1
            System.out.println(num);
        }
        System.out.println("---------------");
        //证明以上代码,确实可以产生1和100
        while(true) {
            //产生1个1到100之间(包含1,包含100)的整数数字
            int num = r.nextInt(100) + 1;//[0,99]+1
            System.out.println(num);
            if (num == 1 || num == 100) {
                break;
            }
        }
    }
}
