package itheima02;
/*
    一个数组内存图

    注意:
	    1.数组名称保存数组在堆内存中的地址值
	    2.通过数组名称找到堆内存中的具体数组,然后通过索引编号找到对应的具体的某个元素

    数组元素有默认值:
        1.整数:       0
        2.小数:       0.0
        3.字符:       空白字符
        4.布尔:       false
 */
public class Demo01OneArray {
    public static void main(String[] args) {
        //创建int数组one,长度为2
        int[] one = new int[2];//第一个元素索引是0,第二个元素索引1

        System.out.println(one);//地址值:[I@1540e19d
        System.out.println(one[0]);//打印数组one中索引编号为0的元素的值,默认值: 0
        System.out.println(one[1]);//打印数组one中索引编号为1的元素的值,默认值: 1

        one[0] = 10;//把整数数字10,存储到数组one中索引编号为0的元素中,默认值0被覆盖
        one[1] = 20;//把整数数字20,存储到数组one中索引编号为1的元素中,默认值0被覆盖

        System.out.println(one);//地址值:[I@1540e19d
        System.out.println(one[0]);//打印数组one中索引编号为0的元素的值: 10
        System.out.println(one[1]);//打印数组one中索引编号为1的元素的值: 20
    }
}
