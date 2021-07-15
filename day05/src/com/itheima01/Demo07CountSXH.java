package com.itheima01;
/*
    需求:
        在控制台输出所有的“水仙花数”及总个数

    解释：什么是水仙花数？
        水仙花数，指的是一个三位数，个位、十位、百位的数字立方和等于原数
        例如 153 3*3*3 + 5*5*5 + 1*1*1 = 27 + 125 + 1 = 153

    实现步骤:
        1.定义int变量count,初始值0,作用是统计水仙花数字的个数
        2.使用for循环遍历获取所有的三位数字,每个数字保存到int变量num中
        2.1计算num中数字的个位,十位,百位 分别保存到3个int变量ge(个位),shi(十位),bai(百位)中
        2.2计算个位,十位,百位数字的立方和,保存到int变量sum中
        2.3判断如果三位数字num 等于 每位数字的立方和sum,输出该数字num,同时计数器count的值增加1
        3.for循环结束后,打印count的值
 */
public class Demo07CountSXH {
    public static void main(String[] args) {
        //1.定义int变量count,初始值0,作用是统计水仙花数字的个数
        int count = 0;

        //2.使用for循环遍历获取所有的三位数字,每个数字保存到int变量num中
        for (int num = 100; num <= 999; num++) {
            //2.1计算num中数字的个位,十位,百位 分别保存到3个int变量ge(个位),shi(十位),bai(百位)中
            int ge = num%10;//个位
            int shi = num/10%10;//十位
            int bai = num/100%10;//百位
            //2.2计算个位,十位,百位数字的立方和,保存到int变量sum中
            //2.3判断如果三位数字num 等于 每位数字的立方和sum
            if((ge*ge*ge+shi*shi*shi+bai*bai*bai) == num) {
                //输出该数字num
                System.out.println(num);
                //同时计数器count的值增加1
                count++;
            }
        }
        //3.for循环结束后,打印count的值
        System.out.println("水仙花数字总共有: "+count+" 个");
    }
}
