package itheima02;
/*
    两个数组内存图(每个数组都有自己独立的内存空间,互不影响,互不干扰)
    
    注意:
	    1.数组名称保存数组在堆内存中的地址值
	    2.通过数组名称找到堆内存中的具体数组,然后通过索引编号找到对应的具体的某个元素

    有两套房子,一套在延庆(钥匙是one),一套在平谷(钥匙是two)
        one: 你自己拿着  打开的是延庆的房子
        two: 你对象拿着  打开的是平谷的房子
 */
public class Demo02TwoArray {
    public static void main(String[] args) {
        //创建int数组one,长度为2
        int[] one = new int[2];//在北京延庆购买了一套两居室的房子,one是打开这套房子的钥匙

        System.out.println(one);//[I@1540e19d
        System.out.println(one[0]);//0
        System.out.println(one[1]);//0

        one[0] = 10;
        one[1] = 20;

        System.out.println(one);//[I@1540e19d
        System.out.println(one[0]);//10
        System.out.println(one[1]);//20
        System.out.println("--------------");

        //又创建一个int数组two,长度为2
        int[] two = new int[2];//在北京平谷购买了一套两居室的房子,two是打开这套房子的钥匙

        System.out.println(two);//[I@677327b6
        System.out.println(two[0]);//0
        System.out.println(two[1]);//0

        two[0] = 100;
        two[1] = 200;

        System.out.println(two);//[I@677327b6
        System.out.println(two[0]);//100
        System.out.println(two[1]);//200
    }
}
