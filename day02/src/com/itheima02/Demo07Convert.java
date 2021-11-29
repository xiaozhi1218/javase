package com.itheima02;

/*
	强制类型转换
*/
public class Demo07Convert {
	public static void main(String[] args){
		double d = 1.5;
		/*
			左侧d是double类型(占8个字节),右侧的int类型的变量x(占4个字节)
			相当于: 左侧是较大的数据,右侧的变量比较小
			大萝卜不能直接放入小坑中
		*/
		//int x = d;
		//System.out.println(x);
		/*
			左侧d是double类型(占8个字节),右侧的int类型的变量x(占4个字节)
			double数据是不能直接赋值给int变量的: 大萝卜不能直接放入小坑中
			但是进行了强制类型转换,把double数据强制转换成int数据
			
			double强制类型转换成int: 直接把小数部分干掉,会损失精度
		*/
		
		int y = (int)d;
		
		System.out.println(y);
	}
}