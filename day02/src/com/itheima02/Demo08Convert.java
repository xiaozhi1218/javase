package com.itheima02;

/*
	强制类型转换练习
*/
public class Demo08Convert {
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
	}
}