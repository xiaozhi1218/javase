package com.itheima02;

public class Demo02BianLiang {
	public static void main(String[] args){
		//float类型
		//定义float类型变量a,并初始化
		//大萝卜不能直接存储到小坑中
		//float a = 6.6;//错误: 6.6默认是double类型,占8个字节,不能存储到4个字节的float变量中
		
		float a = 6.6F;
		System.out.println(a);//打印变量a中的内容
		
		//double类型
		//定义double类型变量b,并初始化
		double b = 8.8;
		System.out.println(b);//打印变量b中的内容
		
		//char类型
		//定义char类型变量c1,并初始化
		char c1 = 'a';
		System.out.println(c1);//打印变量c1中的内容
		
		//char c2 = '';//错误: ''中不能不写字符
		//System.out.println(c2);//打印变量c2中的内容
		
		//char c3 = 'ab';//错误: ''中不能写2个及以上的字符
		//System.out.println(c3);//打印变量c3中的内容
		
		//boolean类型: 只能存储true或者false
		//定义boolean类型变量d1,并初始化
		boolean d1 = true;
		System.out.println(d1);//打印变量d1中的内容
		
		d1 = false;//把false存储到变量d1中,原有的数据将被替换
		
		System.out.println(d1);//打印变量d1中的内容
		
		//d1 = 100;//错误: 数据类型不匹配
		//System.out.println(d1);//打印变量d1中的内容
		
		
	}
}