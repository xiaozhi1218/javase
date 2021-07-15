package itheima01;
/*
    数组变量的定义格式
        1.数组变量定义格式一：			---------------推荐使用-------------
            数据类型[] 数组名称;

        2.数组变量定义格式二：
            数据类型 数组名称[];

        3.练习:
            (1)定义一个存储int类型数组的变量arrayA
            (2)定义一个存储double类型数组的变量arrayB
            (3)定义一个存储char类型数组的变量arrayC

        4.注意:
            (1)int[] arrayA: 这里仅仅是定义了一个可以存储一个int数组的变量而已,现在还没有具体的数组
            (2)int[] arrayA: 数组变量中保存数组在内存空间的地址值,通过该地址值,就可以找到具体的数组
            (3)理解: 数组变量可以理解为门牌号,具体的数组可以理解为教室
 */
public class Demo02Array {
    public static void main(String[] args) {
        //定义int变量num
        int num;
        //System.out.println(num);//错误:变量未初始化,不能使用

        //(1)定义一个存储int类型数组的变量arrayA
        //int类型数组: 该容器中只能存储的是int类型的数字
        int[] arrayA;
        //System.out.println(arrayA);//错误的: arrayA只是一个用来存储数组的变量,但是目前没有向arrayA中存储数组

        //(2)定义一个存储double类型数组的变量arrayB
        //double类型数组: 该数组容器中只能存储double类型的数据
        double arrayB[];

        //(3)定义一个存储char类型数组的变量arrayC
        //char类型数组: 该数组容器中只能存储char类型的数据
        char[] arrayC;
    }
}
