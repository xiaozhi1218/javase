package com.itheima03;

import java.util.Random;

/*
    练习:
        产生10个66到178之间(包含66,包含178)的整数数字
        [66,178] --> [0, 112] + 66 --> [0,113) + 66 --> r.nextInt(113) + 6
 */
public class Demo02Random {
    public static void main(String[] args) {
        //创建Random类的对象
        Random r = new Random();
        //产生10个66到178之间(包含66,包含178)的整数数字
        for (int i = 0; i < 10; i++) {
            //产生1个66到178之间(包含66,包含178)的整数数字
            int num = r.nextInt(113)+66;
            System.out.println(num);
        }
        System.out.println("-------------");
        //证明以上方式,是可以产生最小值66和最大值178的
        while (true) {
            //产生1个66到178之间(包含66,包含178)的整数数字
            int num = r.nextInt(113)+66;
            System.out.println(num);
            if (num == 66 || num == 178) {
                break;
            }
        }
    }
}
