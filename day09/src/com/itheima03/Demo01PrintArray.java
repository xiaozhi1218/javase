package com.itheima03;
/*
    需求(先不定义方法):
        设计一个方法用于数组遍历(打印数组元素)，
        要求遍历的结果是在一行上的。例如：[11, 22, 33, 44, 55]

    举例:
        原数组: {11,22,33,44,55}
        打印格式:[11, 22, 33, 44, 55]

    实现步骤:
        1.定义int数组array,并初始化
        2.打印"[",不换行
        3.使用for循环遍历数组
        3.1打印数组当前元素,不换行
        3.2如果步骤3.1中打印的元素不是最后一个元素,则需要打印", ",不换行
        4.打印"]",可以换行也可以不换行

    问题:
        并没有把按照指定格式打印数组的功能定义成方法,
        导致有多少个数组需要按照指定格式打印,就需要重复性的写几遍同样的代码

    解决方案:
        定义方法,实现数组按照指定格式打印


 */
public class Demo01PrintArray {
    public static void main(String[] args) {
        //1.定义int数组array,并初始化
        int[] array = {11,22,33,44,55};
        //2.打印"[",不换行
        System.out.print("[");

        //3.使用for循环遍历数组
        for (int i = 0; i < array.length; i++) {
            //3.1打印数组当前元素,不换行
            System.out.print(array[i]);
            //3.2如果步骤3.1中打印的元素不是最后一个元素
            if(i != array.length-1) {
                //则需要打印", ",不换行
                System.out.print(", ");
            }
        }

        //4.打印"]",可以换行也可以不换行
        System.out.println("]");

        System.out.println("------------------");
        array = new int[] {100,200,300,500,800,900};

        //2.打印"[",不换行
        System.out.print("[");

        //3.使用for循环遍历数组
        for (int i = 0; i < array.length; i++) {
            //3.1打印数组当前元素,不换行
            System.out.print(array[i]);
            //3.2如果步骤3.1中打印的元素不是最后一个元素
            if(i != array.length-1) {
                //则需要打印", ",不换行
                System.out.print(", ");
            }
        }

        //4.打印"]",可以换行也可以不换行
        System.out.println("]");
    }
}
