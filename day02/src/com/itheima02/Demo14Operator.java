package com.itheima02;

/*
	赋值运算符特点
		1.+=,-=,/=,*=,%= 运算结果的数据类型和左侧变量的数据类型不一致,隐藏强制类型转换
		2.整数常量只要不超出所赋值的整数变量的取值范围,可以直接赋值,内部隐藏强制类型转换
*/
public class Demo14Operator {
	public static void main(String[] args){
		short s = 1;
		/*
			s是short类型,1是int类型,运算时类型不一致,会发生自动类型转换
			short类型(2个字节)的s会自动转换成int类型(4个字节):在short类型的s左侧补充2个字节的0
			
			最终变成了两个int数据相加,结果是int类型(占用4个字节),不能直接赋值给左侧的short类型的变量s,占用2个字节
			
			大萝卜不能直接放入小坑中
		*/
		//s = s + 1;		
		//System.out.println(s);
		
				
		/*
			s是short类型,1是int类型,运算时类型不一致,会发生自动类型转换
			short类型(2个字节)的s会自动转换成int类型(4个字节):在short类型的s左侧补充2个字节的0
			
			最终变成了两个int数据相加,结果是int类型(占用4个字节),不能直接赋值给左侧的short类型的变量s,占用2个字节
			
			但是在赋值之前把int类型的结果,强制转换成short类型(砍掉左侧的2个字节的内容),
			由于砍掉的2个字节都是0,所以最终的结果没有影响,仍然是2
			
			把萝卜变小
		*/
		s = (short)(s + 1);
		System.out.println(s);
		
		short s2 = 1;
		/*
			+=,-=,/=,*=,%= 运算结果的数据类型和左侧变量的数据类型不一致,隐藏强制类型转换
		*/
		s2 += 1;//s2 = (short)(s2 + 1);
		
		System.out.println(s2);
		/*
			右侧10是int类型(4个字节),左侧变量byte类型(1个字节)
			按照道理来讲: 大萝卜是不可以直接放入小坑中的
			现在为什么可以呢?
			原因是数字10是一个常量,值并没有超出byte的取值范围
			所以可以直接赋值,内部会帮助我们进行强制类型转换
			等价于:
				byte b = (byte)10;
		*/
		byte b = /*(byte)*/10;
		System.out.println(b);//10
	}
}













