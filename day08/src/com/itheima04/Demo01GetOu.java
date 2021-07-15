package com.itheima04;

/*
    有参数有返回值的方法练习
        方法是否需要参数:
            分析方法需求中是否具有不确定的东西

        方法是否需要返回值:
            如果方法需求中能够明确看到打印/输出二字,说明该方法不需要返回值,返回值类型固定写为void
            如果方法需求中能够明确看到获取/返回/判断二字,说明该方法需要返回值,必须定义具体的返回值类型

    1.练习:
	    定义一个方法，该方法接收一个int参数，判断该数据是否是偶数，并返回真假值

    2.三要素:
        (1)方法名称: getOu
	    (2)参数列表: int num
	    (3)返回值类型: boolean

    练习中如果没有明确数据类型,默认int类型
 */
public class Demo01GetOu {

    public static void main(String[] args) {

        System.out.println("main...start...");

        //调用方法: 传递的是常量
        boolean result = getOu(11);

        System.out.println("11是偶数吗? "+result);

        //调用方法方法: 传递变量
        int a = 12;
        result = getOu(a);
        System.out.println(a+"是偶数吗? "+result);

        System.out.println("main...end...");

    }

    //定义一个方法，该方法接收一个int参数，判断该数据是否是偶数，并返回真假值
    /*
        你调用我的方法getOu时,必须给我传递一个int类型的数据,
        我getOu方法内部执行完毕后,会返还给你一个boolean类型的数据
        你: 方法的调用者
        我: 方法本身
        有进(参数)有出(返回值)
     */
    //boolean: 告诉方法的调用者,方法功能代码执行完毕后,会返回数据的具体类型(会返回一个什么样子的数据)
    public static boolean getOu(int num) {

        boolean result = (num % 2 == 0) ? true : false;

        return result;//结束方法,并且把result中的数据,返还给方法的调用处/者
    }
}
