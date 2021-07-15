package com.itheima02;
/*
    引用数据类型作为方法参数
        注意:
            1.引用类型变量: 保存的是对象在堆内存空间的地址值,进行参数传递的时候,传递的也是地址值
            2.引用类型变量作为形式参数,通过形式参数找到对应的堆内存空间,修改堆内存空间的内容之后,
                通过实际参数看到的一定是修改后的堆内存空间的内容

                引用类型作为形式参数,形式参数的改变,会影响实际参数

        数组:
            1.数组也是一种引用类型: 数组名称保存的也是数组在堆内存空间的地址值
            2.数组作为方法参数或者返回值: 传递的都是数组在堆内存空间的地址值

 */
public class Demo03RefVar {
    public static void main(String[] args) {
        int[] arr = { 10 , 20 };
        //System.out.println(arr);//数组名称: 保存数组在内存中的地址值[I@1540e19d
        System.out.println("ms...arr[0]="+arr[0]);//10
        System.out.println("ms...arr[1]="+arr[1]);//20
        //调用方法
        change( arr );
        System.out.println("me...arr[0]="+arr[0]);//100
        System.out.println("me...arr[1]="+arr[1]);//200
    }

    public static void change(int[] arr ) {
        System.out.println("cs...arr[0]="+arr[0]);//10
        System.out.println("cs...arr[1]="+arr[1]);//20
        arr[0] = arr[0]*10;
        arr[1] = arr[1]*10;
        System.out.println("ce...arr[0]="+arr[0]);//100
        System.out.println("ce...arr[1]="+arr[1]);//200
    }
}
