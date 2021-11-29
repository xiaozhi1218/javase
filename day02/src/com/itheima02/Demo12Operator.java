package com.itheima02;

/*
	+符号的作用
		1.数学中的加法运算(数字相加,字符相加)
		2.字符串的拼接(把两个字符串连在一起)
*/
public class Demo12Operator {
	public static void main(String[] args){
		System.out.println(5+5);//10
		/*
			int + char ==> int + int ==> int
			需要:
				char ==> int 查看ASCII码表 'A'对应65
		*/
		System.out.println(5+'A');//5 + 65: 70
		/*
			自动类型转换中:
				byte/short/char类型,只要参加运算,会自动转换为int类型
			char + char ==> int + int ==> int
			需要:
				char ==> int 查看ASCII码表 'A'对应65
				char ==> int 查看ASCII码表 'B'对应66
		*/
		System.out.println('A'+'B');//65 + 66: 131
		
		System.out.println("Hello"+"World");
		//"5+5="+5+5: 从左向右计算
		//先计算"5+5="+5: 此处+号代表字符串的连接 结果是"5+5=5"
		//然后"5+5=5"+5: 此处+号代表字符串的连接 结果是"5+5=55"
		System.out.println("5+5="+5+5);//5+5=55
		
		//()的优先级是比较高的,所以先计算5+5 结果10
		//然后"5+5="+10: 此处+号代表字符串的连接 结果是"5+5=10"
		System.out.println("5+5="+(5+5));//5+5=10

		
	}
}