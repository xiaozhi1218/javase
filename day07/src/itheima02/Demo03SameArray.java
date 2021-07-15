package itheima02;
/*
    两个引用一个数组内存图
    
    注意1.:
	    1.数组名称保存数组在堆内存中的地址值
	    2.通过数组名称找到堆内存中的具体数组,然后通过索引编号找到对应的具体的某个元素

	注意2:
        1.数组名称保存数组在堆内存空间的地址值
        2.使用数组名进行赋值时,传递的是地址值
        3.使用数组名作为方法参数和返回值,传递的都是地址值  --------后面讲解

    有一套房子,在延庆,但是该房子有两把钥匙,分别是one和two
        one: 你自己拿着  打开的是延庆的房子
        two: 你对象拿着  打开的是延庆的房子

 */
public class Demo03SameArray {
    public static void main(String[] args) {
        //创建int数组one,长度为2
        int[] one = new int[2];//在北京延庆购买了一套两居室的房子,one是打开这套房子的钥匙

        System.out.println(one);//[I@1540e19d
        System.out.println(one[0]);//0
        one[0] = 10;
        System.out.println(one);//[I@1540e19d
        System.out.println(one[0]);//10
        System.out.println("--------------");

        /*
            数组变量one保存的是数组在内存空间的地址值,
            赋值给新的数组变量two,导致数组变量one和two保存相同的内存地址,
            操作的是同一个数组

            one相当于是延庆两居室的房子的钥匙,通过钥匙one又配了一把钥匙two
            这样:
                钥匙one和two,打开的都是延庆两居室的房子
                钥匙one: 你自己拿着
                钥匙two: 你对象拿着
         */
        int[] two = one;

        System.out.println(two);//[I@677327b6
        System.out.println(two[0]);//10
        two[0] = 100;

        System.out.println(two);//[I@677327b6
        System.out.println(two[0]);//100
        System.out.println(one[0]);//100
    }
}
