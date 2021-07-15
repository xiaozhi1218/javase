package com.itheima02;

/*
    关系运算符
        1.作用:
            用来比较数据之间的大小关系

        2.特点:
            不管关系表达式多么复杂或者多么简单,返回值一定是布尔类型的结果,要么是true,要么是false

        3.分类:
            == 		a==b，判断a和b的值是否相等，成立为true，不成立为false
            != 		a!=b，判断a和b的值是否不相等，成立为true，不成立为false
            > 		a>b，判断a是否大于b，成立为true，不成立为false
            >= 		a>=b，判断a是否大于或者等于b，成立为true，不成立为false
            < 		a<b，判断a是否小于b，成立为true，不成立为false
            <= 		a<=b，判断a是否小于或者等于b，成立为true，不成立为false

        4.注意:
            (1)=: 一个等号是赋值的意思
            (2)==: 两个等号是判断是否相同的意思
 */
public class Demo01GuanXi {
    public static void main(String[] args) {
        int a = 10, b = 20;
        boolean result = (a == b);
        System.out.println(result);//false
        System.out.println(a != b);//10 != 20: true
        System.out.println(a > b);//10 > 20: false
        System.out.println(a >= b);//10 >= 20: false
        System.out.println(a < b);//10 < 20: true
        System.out.println(a <= b);//10 <= 20: true
        System.out.println(a == b);//10 == 20: false
        System.out.println(a = b);//20 把变量b的值赋值给变量a,最后打印变量a的值
    }
}
