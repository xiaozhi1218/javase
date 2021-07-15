package com.itheima02;
/*
    需求:
        模拟钟表的时针和分针
        时针(外层循环)走一个格,分钟(内层循环)走一圈
        对应:
        外层循环执行一次,内层循环执行完整的一遍

 */
public class Demo03ForForClock {
    public static void main(String[] args) {

        for (int hour = 0; hour < 24; hour++) {//外层循环: 控制每天都有24小时

            for (int minute = 0; minute < 60; minute++) {//内层循环: 控制每小时都有60分钟

                System.out.println(hour+"点"+minute+"分");

            }
        }

        //System.out.println("main....end...");
    }
}
