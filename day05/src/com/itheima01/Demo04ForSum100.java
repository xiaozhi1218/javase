package com.itheima01;
/*
    需求:
        求1-100之间的偶数和，并把求和结果在控制台输出

    实现步骤:
        1.定义int变量sum,用来累加求和,初始值0
        2.使用for获取1-100之间的数字
        2.1判断如果当前数字是偶数,把当前数字累加到求和变量sum中
        3.for循环结束,打印求和变量sum的值

 */
public class Demo04ForSum100 {
    public static void main(String[] args) {
        //1.定义int变量sum,用来累加求和,初始值0
        int sum = 0;

        //2.使用for获取1-100之间的数字
        for (int i = 1; i <= 100; i++) {
            //2.1判断如果当前数字是偶数
            if (i % 2 == 0) {
                //把当前数字累加到求和变量sum中
                sum += i;
            }
        }
        //3.for循环结束,打印求和变量sum的值
        System.out.println("1-100之间的偶数数字之和: "+sum);
        System.out.println("-------------");

        //1.定义int变量sum2,用来累加求和,初始值0
        int sum2 = 0;

        //2.使用for获取1-100之间的偶数数字
        for (int j = 0; j <= 100; j++,j++/*j+=2*/) {
            //2.1把当前数字(偶数)累加到求和变量sum2中
            //System.out.println(j);
            sum2 += j;
        }
        //3.for循环结束,打印求和变量sum的值
        System.out.println("1-100之间的偶数数字之和: "+sum2);

    }
}
