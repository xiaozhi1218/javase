package com.itheima01;
/*
    需求:
        使用方法重载的思想，设计比较两个数据是否相等的方法，兼容全整数类型(byte,short,int,long）

    实现步骤:
        1.使用方法重载的思想,定义比较两个byte数据的方法compare
        2.使用方法重载的思想,定义比较两个short数据的方法compare
        3.使用方法重载的思想,定义比较两个int数据的方法compare
        4.使用方法重载的思想,定义比较两个long数据的方法compare
        5.分别调用以上四个方法

    使用方法重载的思想,定义比较两个byte数据是否相同的方法compare
        三要素:
            1.方法名称:    compare
            2.参数列表:    byte a,byte b
            3.返回值类型:  boolean
 */
public class Demo05OverLoadTest {
    public static void main(String[] args) {
        //5.分别调用以上四个方法
        System.out.println(compare(10,20));
        System.out.println(compare((byte)10,(byte)20));
        System.out.println(compare((short)10,(short)20));
        System.out.println(compare(10L,20L));
    }

    //1.使用方法重载的思想,定义比较两个byte数据的方法compare
    public static boolean compare(byte a, byte b) {
        System.out.println("...两个byte...");
        boolean result = (a == b) ? true : false;
        return result;
    }

    //2.使用方法重载的思想,定义比较两个short数据的方法compare
    public static boolean compare(short a, short b) {
        System.out.println("...两个short...");
        boolean result;
        if (a == b) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    //3.使用方法重载的思想,定义比较两个int数据的方法compare
    public static boolean compare(int a, int b) {
        System.out.println("...两个int...");
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    //4.使用方法重载的思想,定义比较两个long数据的方法compare
    public static boolean compare(long a, long b) {
        System.out.println("...两个long...");
        return a == b;
    }
}
