package com.itheima02;

/*
	算数运算符
		1.运算符：对常量或者变量进行操作的符号 
		2.表达式：用运算符把常量或者变量连接起来符合java语法的式子就可以称为表达式。
		3.数学运算符:
			(1)+: 加法运算
			(2)-: 减法运算
			(3)*: 乘法运算
			(4)/: 除法运算
				被除数 ÷ 除数 = 商(/: 取的就是商) ......	余数
*/
public class Demo10Operator {
	public static void main(String[] args){
		int a = 3;
		int b = 2;
		System.out.println(a + b);//3 + 2: 5 
		System.out.println(a - b);//3 - 2: 1 
		System.out.println(a * b);//3 * 2: 6 
		//3/2: int/int 结果必然是int类型
		System.out.println(a / b);//3 / 2: 1 
		
		//int * double / int ==> double /	int ==> double / double ==> double
		System.out.println((a*1.0) / b);//3.0 / 2 ==> 3.0/2.0 ==> 1.5 				 
	}
}