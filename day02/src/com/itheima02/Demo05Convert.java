package com.itheima02;

/*
	自动类型转换
		1.自动类型转换概念:
			取值范围小的数据或者变量可以直接赋值给取值范围大的变量(小萝卜可以直接放入大坑中)
				
		2.特点: 
			(1)自动类型转换是自动完成的,不需要代码的干预
			(2)byte/short/char类型数据,只要参加运算会自动转换为int类型
			(3)byte、short、char-->int-->long-->float-->double
*/
public class Demo05Convert {
	public static void main(String[] args){
		int i = 1; 
		byte b = 2; 
		/*
			b是byte类型,i是int类型,运算时类型不一致,会发生自动类型转换
			byte类型(1个字节)的b会自动转换成int类型(4个字节):在byte类型的b左侧补充3个字节的0
			
			最终变成了两个int数据相加,结果是int类型(占用4个字节),不能直接赋值给左侧的byte类型的变量x,占用1个字节
			
			大萝卜不能直接放入小坑中
		*/
		//byte x = b + i; 
		//System.out.println(x);
		
		/*
			b是byte类型,i是int类型,运算时类型不一致,会发生自动类型转换
			byte类型(1个字节)的b会自动转换成int类型(4个字节):在byte类型的b左侧补充3个字节的0
			
			最终变成了两个int数据相加,结果是int类型(占用4个字节),可以直接赋值给左侧的int类型的变量y,占用4个字节
			
			大萝卜可以直接放入大坑中
		*/
		int y = b + i;
		System.out.println(y);//3
	}
}