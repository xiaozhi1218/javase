package itheima03;
/*
    数组操作的常见问题一:
        数组索引越界(超出了范围)异常
        1.问题描述: java.lang.ArrayIndexOutOfBoundsException类,数组索引越界异常类
        2.产生原因:
            使用索引编号范围数组元素时,给出的索引编号不存在(超出了范围)
            索引编号范围: 最小值是0,最大值是数组长度 减 1 (one.length - 1)
        3.解决方案:
            根据控制台的打印信息,找到出现问题的索引,进行修改
 */
public class Demo01ArrayProblem {
    public static void main(String[] args) {
        //创建int数组array,并初始化
        //int[] one = new int[]{100,200,300};
        int[] one = {100,200,300};//100的索引编号是0,200的索引编号是1,300的索引编号是2
        System.out.println(one);//数组名称one代表数组的内存地址值:[I@1540e19d
        System.out.println(one[0]);//100
        System.out.println(one[1]);//200
        System.out.println(one[2]);//300
        //System.out.println(one[5]);//索引5: 不存在,报出数组索引越界异常
    }
}
