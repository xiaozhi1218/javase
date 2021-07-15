package com.itheima01;

import java.util.Scanner;

/*
    需求:
        键盘录入一个三位数字,输出该数字是否是水仙花数字?

    解释：什么是水仙花数？
        水仙花数，指的是一个三位数[100,999]，个位、十位、百位的数字立方和等于原数
        例如 153 3*3*3 + 5*5*5 + 1*1*1 = 27 + 125 + 1 = 153

    实现步骤:
        1.创建键盘录入Scanner类的对象(1.导包 2.创建)
        2.获取键盘录入的一个三位整数数字,保存到int变量num中
        3.使用if判断如果num中的数字是三位数字
            3.1 计算num的个位,十位,百位 分别保存到3个int变量ge(个位),shi(十位),bai(百位)中
            3.2 计算个位,十位,百位数字的立方和,保存到int变量sum中
            3.3 判断如果三位数字num 等于 每位数字的立方和sum,输出num是一个水仙花数字
            3.4 判断如果三位数字num 不等于 每位数字的立方和sum,输出num不是一个水仙花数字
        4.如果num中的数字不是三位数字,提示"你输入的不是三位数字,所以不可能是水仙花数字"
 */
public class Demo05ISSXH {
    public static void main(String[] args) {
        //1.创建键盘录入Scanner类的对象(1.导包 2.创建)
        Scanner sc = new Scanner(System.in);

        //2.获取键盘录入的一个三位整数数字,保存到int变量num中
        System.out.println("请录入一个三位整数数字: ");
        int num = sc.nextInt();

        //3.使用if判断如果num中的数字是三位数字
        if (num >= 100 && num <= 999) {
            //3.1 计算num的个位,十位,百位 分别保存到3个int变量ge(个位),shi(十位),bai(百位)中
            int ge = num%10;//个位
            int shi = num/10%10;//十位
            int bai = num/100%10;//百位

            System.out.println("个位: "+ge);
            System.out.println("十位: "+shi);
            System.out.println("百位: "+bai);

            //3.2 计算个位,十位,百位数字的立方和,保存到int变量sum中
            int sum = ge*ge*ge + shi*shi*shi + bai*bai*bai;

            //3.3 判断如果三位数字num 等于 每位数字的立方和sum,输出num是一个水仙花数字
            if(sum == num) {
                System.out.println(num+"是一个水仙花数字....");
            } else {
                //3.4 判断如果三位数字num 不等于 每位数字的立方和sum,输出num不是一个水仙花数字
                System.out.println(num+"不是一个水仙花数字....");
            }

        } else {
            //4.如果num中的数字不是三位数字,提示"你输入的不是三位数字,所以不可能是水仙花数字"
            System.out.println("你输入的不是三位数字,所以不可能是水仙花数字....哥屋恩....");
        }
    }
}
