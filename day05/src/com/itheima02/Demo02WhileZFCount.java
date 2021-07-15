package com.itheima02;
/*
    需求：
        世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米)，假如我有一张足够大的纸，它的厚度是0.1毫米。
        请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
        折纸(折叠后的厚度是原有厚度的2倍,而不是平方的关系):
            原来: 0.1
            第一次: 0.2
            第二次: 0.4
            第三次: 0.8
            第四次: 1.6
            ...

    实现步骤:
        0.定义2个double变量zf(珠峰的高度)和paper(纸张的厚度),并根据题目需求进行初始化
        1.定义int变量count,初始值0,作用用来记录折叠纸张的次数
        2.使用while循环,完成折叠纸张最终厚度达到珠峰的高度
           2.1循环条件: 只要折叠后的纸张厚度 小于 珠峰的高度 就必须继续折叠纸张
           2.2循环体: 折叠纸张(原有厚度的2倍: paper = paper*2;)  计数器count增加1
        3.while循环结束打印count的值
 */
public class Demo02WhileZFCount {
    public static void main(String[] args) {
        //0.定义2个double变量zf(珠峰的高度)和paper(纸张的厚度),并根据题目需求进行初始化
        double zf = 8844430;//珠峰的高度
        double paper = 0.1;//纸张的厚度

        //1.定义int变量count,初始值0,作用用来记录折叠纸张的次数
        int count = 0;

        //2.使用while循环,完成折叠纸张最终厚度达到珠峰的高度
        //2.1循环条件: 只要折叠后的纸张厚度 小于 珠峰的高度 就必须继续折叠纸张
        //2.2循环体: 折叠纸张(原有厚度的2倍: paper = paper*2;)  计数器count增加1
        while (paper < zf) {
            //折叠纸张(原有厚度的2倍: paper = paper*2;)
            paper *= 2;
            //计数器count增加1
            count++;
            System.out.println("第"+count+"次折叠后纸张总厚度: "+paper);
        }

        //3.while循环结束打印count的值
        System.out.println("总共折叠纸张的次数: "+count);
        //1.34217728E7: 1.34217728*10^7 --> 13421772.8
        //珠峰高度:                         8844430
        System.out.println("最后折叠纸张的厚度: "+paper);
    }
}
