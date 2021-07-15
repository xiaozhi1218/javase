package itheima01;
/*
    简化格式静态初始化数组的使用
        1.数组名称: 代表数组在内存空间的地址值,是一个十六进制的整数数字
        2.索引编号:是一个整数数字
            数组中的每个数据,称之为数组元素
            数组为每个元素进行编号(专业术语叫做索引),该编号从0开始到最大值(数组长度 减 1)
        3.数组元素:
            数组名称[索引编号]
            举例:
                array[3]: 数组array中索引编号为3的元素
        4.获取数组长度:
            数组内部有个length属性,专门记录数组的长度
            数组名称.length: 是一个int数字,代表数组的长度

 */
public class Demo06ArrayUse {
    public static void main(String[] args) {
        /*int num = 10;
        System.out.println(num);//10*/

        //创建int数组array,元素分别为10,20,30
        int[] array = {10,20,30};//10的索引编号是0,20的索引编号是1,30的索引编号是2

        System.out.println(array);//[I@1540e19d: 数组在内存空间的地址值,是一个十六进制的整数数字

        //打印10
        System.out.println(array[0]);//打印数组array中索引编号为0的元素值: 10

        //打印20
        System.out.println(array[1]);//打印数组array中索引编号为1的元素值: 20

        //打印30
        System.out.println(array[2]);//打印数组array中索引编号为2的元素值: 30

        System.out.println("--------------");

        //把10 修改成 100
        array[0] = 100;//把整数数字100,存储到数组array中索引编号为0的元素中

        //把20 修改成 200
        array[1] = 200;//把整数数字200,存储到数组array中索引编号为1的元素中

        //把30 修改成 300
        array[2] = 300;//把整数数字200,存储到数组array中索引编号为2的元素中


        //打印100
        System.out.println(array[0]);//打印数组array中索引编号为0的元素值: 100

        //打印200
        System.out.println(array[1]);//打印数组array中索引编号为1的元素值: 200

        //打印300
        System.out.println(array[2]);//打印数组array中索引编号为2的元素值: 300

        //获取数组的长度
        int count = array.length;
        System.out.println("数组长度: "+count);
        System.out.println("数组长度: "+array.length);

        System.out.println(array[array.length-1]);//30
    }
}
