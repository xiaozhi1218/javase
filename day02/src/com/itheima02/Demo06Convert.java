package com.itheima02;

/*
	自动类型转换练习
*/
public class Demo06Convert {
	public static void main(String[] args){
		int i = 1; 
		double d = 2.5;
		/*
			i是int类型,d是double类型,运算时类型不一致,会发生自动类型转换
			int类型(4个字节)的i会自动转换成double类型(8个字节): 最终效果就是在整数后面添加.0 比如: 1变成1.0
			
			最终变成了两个double数据相加,结果是double类型(占用8个字节),不能直接赋值给左侧的int类型的变量x,占用4个字节
			
			大萝卜不能直接放入小坑中
		*/
		//int x = i + d;		
		//System.out.println(x);
		
		/*
			i是int类型,d是double类型,运算时类型不一致,会发生自动类型转换
			int类型(4个字节)的i会自动转换成double类型(8个字节): 最终效果就是在整数后面添加.0 比如: 1变成1.0
			
			最终变成了两个double数据相加,结果是double类型(占用8个字节),可以直接赋值给左侧的double类型的变量y,占用8个字节
			
			大萝卜可以直接放入大坑中
		*/
		double y = i + d;
		System.out.println(y);
	}
}