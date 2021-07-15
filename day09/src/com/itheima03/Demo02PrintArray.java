package com.itheima03;
/*
    需求(定义方法):
        设计一个方法用于int数组遍历(打印数组元素)，
        要求遍历的结果是在一行上的。例如：[11, 22, 33, 44, 55]

    举例:
        原数组: {11,22,33,44,55}
        打印格式:[11, 22, 33, 44, 55]

    定义方法,用来遍历int数组
        三要素:
            1.方法名称:     printArray
            2.参数列表:     int[] array
            3.返回值类型:   void

    打印int数组方法printArray的实现步骤
        1.打印"[",不换行
        2.使用for循环遍历数组
        2.1打印数组当前元素,不换行
        2.2如果步骤2.1中打印的元素不是最后一个元素,则需要打印", ",不换行
        3.打印"]",可以换行也可以不换行

    main方法的实现步骤
        1.定义int数组array,并进行初始化
        2.调用printArray方法,传递数组变量array,完成数组按照指定格式打印
 */
public class Demo02PrintArray {
    public static void main(String[] args) {
        //1.定义int数组array,并进行初始化
        int[] array = {11,22,33,44,55};//array中存储的是: 数组在堆内存空间的地址值

        //2.调用printArray方法,传递数组变量array,完成数组按照指定格式打印
        printArray(array);

        int[] array2 = {100,200,300,500,800,999,9999};
        printArray(array2);
    }

    //打印int数组方法printArray的实现步骤
    public static void printArray(int[] array) {
        //1.打印"[",不换行
        System.out.print("[");

        //2.使用for循环遍历数组
        for (int i = 0; i < array.length; i++) {
            //2.1打印数组当前元素,不换行
            System.out.print(array[i]);

            //2.2如果步骤2.1中打印的元素不是最后一个元素,则需要打印", ",不换行
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        //3.打印"]",可以换行也可以不换行
        System.out.println("]");
    }
}
