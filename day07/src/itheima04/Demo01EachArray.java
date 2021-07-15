package itheima04;

/*
    数组遍历：
	    就是将数组中的每个元素分别获取出来，就是遍历。遍历也是数组操作中的基石。
 */
public class Demo01EachArray {
    public static void main(String[] args) {
        //创建int数组array,并初始化
        //10的索引编号是0,20的索引编号是1,30的索引编号是2,50的索引编号是3
        int[] array = {10,20,30,50/*,60,70,80,90,100*/};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println("-----------");
        //发现: 以上代码重复,只有索引0到3是不同的
        //可以使用for循环打印0到3的数字
        for (int i = 0; i < 4; i++) {
            System.out.println("索引编号: "+i+", 对应的元素值: "+array[i]);
        }
        System.out.println("-----------");
        //发现: 以上for循环中数字4写死了,可以使用数组的长度代替
        for (int i = 0; i < array.length; i++) {
            //System.out.println("索引编号: "+i+", 对应的元素值: "+array[i]);
            System.out.println(array[i]);
        }

    }
}
