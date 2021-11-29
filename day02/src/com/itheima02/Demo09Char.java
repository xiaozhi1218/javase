package com.itheima02;

/*
	char和int的运算原理
*/
public class Demo09Char {
	public static void main(String[] args){
		//定义char类型的变量ch,并初始化为'A'
		char ch = 'A';
		System.out.println(ch);//A
		/*
			自动类型转换中:
				byte/short/char类型,只要参加运算,会自动转换为int类型
				
			ch是char类型,在参加运算时,自动转为int类型
			问题:
				char类型如何转换为int类型的数字呢?
				查看ASCII编码表: 找到'A'对应的数字是65,然后参与运算
				
		*/
		System.out.println(ch+1);//66
		/*
			自动类型转换中:
				byte/short/char类型,只要参加运算,会自动转换为int类型
				
			ch是char类型,在参加运算时,自动转为int类型
				查看ASCII编码表: 找到'A'对应的数字是65,然后参与运算
				所以: ch + 1 的结果是66
				
			然后把int数字66强制转换成char类型的数据
			问题:
				int类型的数据如何强制转换成char类型数据呢?
				查看ASCII编码表: 找到int数字66对应的字符'B'显示出来
		*/
		System.out.println((char)(ch+1));//B
	}
}