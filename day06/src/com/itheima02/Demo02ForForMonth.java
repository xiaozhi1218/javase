package com.itheima02;
/*
    需求:
	    使用嵌套循环，打印2021年至2023年月份，格式：xxxx年x月

	总结:
        外层循环执行1次,内层循环执行完整的(从初始化表达式开始)一遍
 */
public class Demo02ForForMonth {
    public static void main(String[] args) {
        for (int year = 2021; year <= 2023; year++) {//外层循环: 控制年份 2021 2022 2023   3次

            for (int month = 1; month <= 12; month++) {//内层循环: 控制每年的月份,每年都有12个月,都是从1月开始
                //1,2...12: 12次
                System.out.println(year + "年" + month + "月");//执行次数:3*12 = 36次
            }
        }
        System.out.println("main....end....");
    }
}
