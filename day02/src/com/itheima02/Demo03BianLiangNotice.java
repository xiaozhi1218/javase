package com.itheima02;

/*
	变量定义的注意事项:
		变量名称：在同一个大括号范围内，变量的名字不可以相同。
		变量赋值：定义的变量，不赋值不能使用。
		定义long类型的变量时，需要在整数的后面加L（大小写均可，建议大写）。
		因为整数默认是int类型，整数太大可能超出int范围。
		
		定义float类型的变量时，需要在小数的后面加F（大小写均可，建议大写）。
		因为浮点数的默认类型是double， double的取值范围是大于float的，类型不兼容。
*/
public class Demo03BianLiangNotice {
	public static void main(String[] args){
		
		//定义int变量a,并初始化
		int a = 100;		
		System.out.println(a);
		
		//错误: 不能在同一个区域({}),定义同名的变量
		//int a = 200;
		//System.out.println(a);
		
		//定义int变量b,未赋值
		int b;
		//System.out.println(b);//错误: b中没有值,不能使用
		
		b = 200;//把数字200赋值给变量b
		System.out.println(b);
		
		//long c = 6000000000;//错误: 6000000000(60亿)默认是int类型,但是大小已经远远超过int的取值范围(正负21亿)了
		//System.out.println(c);
		
		long d = 6000000000L;//6000000000L: 是long类型的数据
		System.out.println(d);
		
		//错误: 大萝卜不能直接放入小坑中
		//float e = 6.6;//错误: 6.6默认是double类型,占8个字节,不能赋值给4个字节的float变量e
		//System.out.println(e);
		
		float f = 6.6F;//6.6F: 是float类型的数据
		System.out.println(f);
	}
}