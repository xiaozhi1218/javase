package itheima03;
/*
    数组操作的常见问题二:
        空指针异常
        1.问题描述: java.lang.NullPointerException类,空指针异常类
        2.产生原因:
            null是一个引用类型的常量,可以给任意类型引用变量赋值,
            当把null赋值给数组变量one之后,数组变量one将不再指向堆内存空间的任何数组,
            也就不可以通过one再访问数组元素,只要访问,报出空指针异常

        3.解决方案:
            (1)不要通过值为null的数组变量,访问数组元素
            (2)根据控制台打印的相关异常信息,找到数组变量是null的地方进行修改,
                让数组变量指向一个堆内存空间的数组,就可以访问数组元素了
 */
public class Demo02ArrayProblem {
    public static void main(String[] args) {
        //创建int数组array,并初始化
        //int[] one = new int[]{100,200,300};
        int[] one = {100,200,300};//100的索引编号是0,200的索引编号是1,300的索引编号是2
        System.out.println(one);//数组名称one代表数组的内存地址值:[I@1540e19d
        System.out.println(one[0]);//100
        System.out.println(one[1]);//200
        System.out.println(one[2]);//300

        one = null;
        System.out.println(one);//null
        //System.out.println(one[0]);//错误: 控制针异常
    }
}
