package com.itheima01;

/*
	常量:
		1.概念:	在程序的执行过程中,其值不可以发生改变的量
		2.分类:
			(1)整数常量:	100		200
			(2)小数常量:	5.5		7.7
			(3)字符常量:
				java中规定字符常量必须使用单引号''引起来,而且单引号''中只能写一个字符(不能不写,也不能写2个以上)
				举例:
					A:		'a'							正确的
					B:		''		里面什么都没有写  	   错误的
					C:		' '		里面有一个空格			正确的
					D:		'ab'						错误的				
					E:		'好'						    正确的
					F:		'女子'					   错误的
			 (4)布尔常量:只有两个值true和false
					true: 表示肯定的,对的,是的,正确的,成立的
					false:表示否定的,错的,不是的,却无的,不成立的
			 (5)字符串常量:
				java中规定字符串常量必须使用双引号""引起来,而且单引号""中可以写多个字符(0个,1个,2个....)
				举例:
					A:		"a"								正确的
					B:	    "" 			里面什么都没有写	  正确的
					C:  	" "			里面有一个空格		   正确的
					D:		"ab"							正确的
					E:		"好"							   正确的
					F:		"女子"						   正确的
						
			 (6)空常量: null
			 
	 快捷键: ctrl + d 复制一行
	 
	 System.out.println(xxx);//把xxx输出到控制台,并换行
	 System.out.print(xxx);//把xxx输出到控制台,不换行
*/
public class Demo03ChangLiang {
	public static void main(String[] args){
		//(1)整数常量:	100		200		
		System.out.println(100);		
		System.out.println(200);
		
		//(2)小数常量:	5.5		7.7
		System.out.println(5.5);
		System.out.println(7.7);
		
		//(3)字符常量:
		System.out.println('a');
		//System.out.println('');//错误的: ''不能没有字符
		System.out.println(' ');//正确的: ' '有一个空格
		System.out.println('好');//正确的: ' '有一个空格
		//System.out.println('女子');//错误的: '女子'不能写2个及以上的字符
		
		//(4)字符串常量
		System.out.println("a");
		System.out.println("");
		System.out.println(" ");
		System.out.println("ab");
		System.out.println("好想你");
		System.out.println("女子");
		
		//(5)布尔常量
		System.out.println(true);
		System.out.println(false);
		
		//(6)空常量
		//System.out.println(null);//错误: 不能直接打印空常量null
	}
}





















