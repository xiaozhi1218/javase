package com.itheima02;
/*
    逻辑运算符
            举例: 咱们班哥们在黑马学习java,顺利毕业,高薪就业,找到了对象,谈了好长时间,
            需要谈婚论嫁到你对象家和准岳母谈判:
            准岳母:
                小伙子呀,你必须得有房子(条件1: true/false),然后呢,你必须还得有车子(条件2: true/false)
                以上的要求: 两个条件都得满足(true),这个事才能确定下来			使用逻辑运算符	&

                小伙子呀,你要么有房子(条件1: true/false),你呀要么有车子(条件2: true/false)
                以上的要求: 两个条件只要有一个满足(true),这个事就能确定下来			使用逻辑运算符	|


        1.作用:
            用来连接多个条件(布尔表达式的: 结果为true/false的式子),最终的结果也必须是一个布尔类型的数据,要么是true,
            要么是false
            不管逻辑运算符连接的式子有多么简单或者多么复杂,最终结果要么是true,要么是false
        2.分类:
            (1)&(shift+7): 逻辑与,表示并且的意思,多个条件同时成立的意思,就是只有多个条件都是true,最终的结果才是true
                特点:
                    【有false，则false】： 只要有一个条件不成立（false），结果就是false

            (2)|(shift+\): 逻辑或,表示或者的意思,多个条件,只要有一个成立,最终的结果就是true
                特点:
                    【有true，则true】：只要有一个条件是true，结果就是true

            (3)^(shift+6): 逻辑异或,相同为false,不同为true			----基本不用
            (4)!(shift+1): 逻辑取反,!true 就是false,!false 就是true
 */
public class Demo02LuoJi {
    public static void main(String[] args) {
        int a = 10,b = 20,c = 30;
        System.out.println(a>b & a>c);//10 > 20 & 10 > 30 ==> false & false ==> false
        System.out.println(a<b & a<c);//10 < 20 & 10 < 30 ==> true & true ==> true
        System.out.println(a>b & a<c);//10 > 20 & 10 < 30 ==> false & true ==> false
        System.out.println(a<b & a>c);//10 < 20 & 10 > 30 ==> true & false ==> false

        System.out.println("--------------------");

        System.out.println(a>b | a>c);//10 > 20 | 10 > 30 ==> false | false ==> false
        System.out.println(a<b | a<c);//10 < 20 | 10 < 30 ==> true | true ==> true
        System.out.println(a>b | a<c);//10 > 20 | 10 < 30 ==> false | true ==> true
        System.out.println(a<b | a>c);//10 < 20 | 10 > 30 ==> true | false ==> true

        System.out.println("--------------------");
        System.out.println(a>b ^ a>c);//10 > 20 ^ 10 > 30 ==> false ^ false ==> false
        System.out.println(a<b ^ a<c);//10 < 20 ^ 10 < 30 ==> true ^ true ==> false
        System.out.println(a>b ^ a<c);//10 > 20 ^ 10 < 30 ==> false ^ true ==> true
        System.out.println(a<b ^ a>c);//10 < 20 ^ 10 > 30 ==> true ^ false ==> true
        System.out.println("--------------------");
        System.out.println(!true);//false
        System.out.println(!false);//true
    }
}
