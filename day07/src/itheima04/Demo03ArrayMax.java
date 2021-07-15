package itheima04;
/*
    需求:
        求int数组元素最大值

    实现步骤:
        1.创建int数组array,并初始化
        2.假设索引为0的元素是最大的,保存到int变量max中
        3.使用for循环依次获取后面的(从索引1开始)每个元素
        3.1如果当前元素 大于 max 说明max中的值已经不是最大的了
        3.2把当前元素赋值给变量max
        4.for循环结束后打印max的值
 */
public class Demo03ArrayMax {
    public static void main(String[] args) {
        //1.创建int数组array,并初始化
        int[] array = {5,15,2000,10000,100,4000};

        //2.假设索引为0的元素是最大的,保存到int变量max中
        int max = array[0];

        //3.使用for循环依次获取后面的(从索引1开始)每个元素
        for (int i = 1; i < array.length; i++) {
            //3.1如果当前元素 大于 max 说明max中的值已经不是最大的了
            if (array[i] > max) {
                //3.2把当前元素赋值给变量max
                max = array[i];
            }

        }
        //4.for循环结束后打印max的值
        System.out.println("数组最大值: "+max);
    }
}
