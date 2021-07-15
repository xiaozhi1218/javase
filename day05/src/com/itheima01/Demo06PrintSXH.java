package com.itheima01;
/*
    需求:
        在控制台输出所有的“水仙花数”

    解释：什么是水仙花数？
        水仙花数，指的是一个三位数，个位、十位、百位的数字立方和等于原数
        例如 153(num) 3*3*3 + 5*5*5 + 1*1*1 = 27 + 125 + 1 = 153(sum)

    实现步骤:
        1.使用for循环获取所有的三位数字,每个数字保存到int变量num中
        1.1计算num中数字的个位,十位,百位 分别保存到3个int变量ge(个位),shi(十位),bai(百位)中
        1.2计算个位,十位,百位数字的立方和,保存到int变量sum中
        1.3判断如果三位数字num 等于 每位数字的立方和sum,输出该数字num
 */
public class Demo06PrintSXH {
    public static void main(String[] args) {
        //1.使用for循环获取所有的三位数字,每个数字保存到int变量num中
        for (int num = 100; num <= 999; num++) {

            //1.1计算num中数字的个位,十位,百位 分别保存到3个int变量ge(个位),shi(十位),bai(百位)中
            //123
            int ge = num%10;//个位
            int shi = num/10%10;//十位
            int bai = num/100%10;//百位

            //1.2计算个位,十位,百位数字的立方和,保存到int变量sum中
            int sum = ge*ge*ge + shi*shi*shi + bai*bai*bai;
            //1.3判断如果三位数字num 等于 每位数字的立方和sum,输出该数字num
            if(sum == num) {
                System.out.println(num);
            }
        }
    }
}
