package itheima04;
/*
    需求:
        求三个int数字的最大值

    实现步骤:
        1.定义3个int变量a,b,c,并分别初始化
        2.假设变量a的值是最大的,把a保存到int变量max中
        3.如果变量b的值大于max,说明max中的值目前不是最大的,把b的值赋值给max
        4.如果变量c的值大于max,说明max中的值目前不是最大的,把c的值赋值给max
        5.打印max的值
 */
public class Demo02Max {
    public static void main(String[] args) {
        //1.定义3个int变量a,b,c,并分别初始化
        int a = 100, b = 200,c = 300;

        //2.假设变量a的值是最大的,把a保存到int变量max中
        int max = a;

        //3.如果变量b的值大于max,说明max中的值目前不是最大的,把b的值赋值给max
        if (b > max) {
            max = b;
        }
        //4.如果变量c的值大于max,说明max中的值目前不是最大的,把c的值赋值给max
        if (c > max) {
            max = c;
        }
        //5.打印max的值
        System.out.println("最大值: "+max);
    }
}
