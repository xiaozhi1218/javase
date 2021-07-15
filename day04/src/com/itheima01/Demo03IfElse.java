package com.itheima01;

/*
    if语句的第二种格式
        英文单词if是: 如果的意思
        英文单词else是: 否则的意思
        1.if语句的第二种格式:
            if(布尔表达式){
                语句体1;
            } else {
                语句体2;
            }
            其它语句;

        2.执行流程:
            (1)使用计算if后面()中布尔表达式的结果,看是true,还是false
            (2)如果if后面()中布尔表达式的结果是true,执行if后面{}中的语句体1,接着执行其它语句
            (3)如果if后面()中布尔表达式的结果是false,执行else后面{}中的语句体2,接着执行其它语句

        3.注意:
            (1)if语句的第二种格式,适用于有两种情况的场景
            (2)if后面()中表达式不管写的多么简单或者多么复杂,最终的结果一定是布尔类型,要么是true,要么是false
            (3)语句体1和语句体2,只有一个会被执行

        4.练习需求：
            判断a是否大于b，如果是，在控制台输出：a的值大于b，否则，在控制台输出：a的值不大于b

            实现步骤:
                1.定义2个int变量a和b,并分别初始化
                2.a和b的大小关系有两种情况,所以使用if-else语句对a和b的值进行判断,并输出不同的结果
 */
public class Demo03IfElse {
    public static void main(String[] args) {
        //1.定义2个int变量a和b,并分别初始化
        int a = 10, b = 20;

        //2.a和b的大小关系有两种情况,所以使用if-else语句对a和b的值进行判断,并输出不同的结果
        if (a > b) {//10 > 20: false,执行else后面{}中的语句体
            System.out.println(a + "的值大于" + b);
        } else {
            System.out.println(a + "的值不大于" + b);
        }
        System.out.println("main....end....");//模拟格式中的其它语句
    }
}
