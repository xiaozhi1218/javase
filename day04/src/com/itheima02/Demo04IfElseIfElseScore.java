package com.itheima02;

import java.util.Scanner;

/*
    if语句的第三种格式练习
        需求：
            小明快要期末考试了，小明爸爸对他说，会根据他不同的考试成绩，送他不同的礼物，
            假如你可以控制小明的得分，请用程序实现小明到底该获得什么样的礼物，并在控制台输出。

        奖励规则:
            95~100 山地自行车一辆 	 包含95和100的	数学中表示方式: [95,100]  不包含95和100: (95,100)
            90~94  游乐场玩一次 		 包含90和94的
            80~89  变形金刚玩具一个    包含80和89的
            80以下  胖揍一顿 			 不包含80分的

        实现步骤:
            1.创建键盘录入Scanner类的对象
            2.获取一个0-100之间的整数数字(代表小明的考试成绩),保存到int变量score中
            3.因为score中的数字有多种(大于3)情况,所以使用if语句的第三种格式进行判断,并输出不同的结果内容
 */
public class Demo04IfElseIfElseScore {
    public static void main(String[] args) {
        //1.创建键盘录入Scanner类的对象
        Scanner sc = new Scanner(System.in);

        //2.获取一个0-100之间的整数数字(代表小明的考试成绩),保存到int变量score中
        System.out.println("请输入一个0-100之间的整数数字(代表小明的考试成绩): ");
        int score = sc.nextInt();

        //3.因为score中的数字有多种(大于3)情况,所以使用if语句的第三种格式进行判断,并输出不同的结果内容
        //先排除非法数据
        if(score<0 || score>100) {
            System.out.println("您输入的成绩错误,是火星来的吧,哥屋恩...");
        } else if(score>=95 && score<=100) {//执行到这里及以下: score>=0 && score<=100
            System.out.println("奖励山地自行车一辆");
        } else if(score>=90 && score<=94) {
            System.out.println("奖励游乐场玩一次");
        } else if(score>=80 && score<=89) {
            System.out.println("奖励变形金刚玩具一个");
        } else /*if(score>=0 && score<80)*/{//隐藏条件: score>=0 && score<80)
            System.out.println("奖励胖揍一顿");
        }

        System.out.println("main....end....");//模拟格式中的其它语句
    }
}
