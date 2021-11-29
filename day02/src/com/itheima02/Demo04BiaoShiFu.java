package com.itheima02;

/*
	标识符:
		1.概念: 程序中起名字的地方(类名,方法名称,变量名)
		2.命名规则： 硬 性 要 求
			标识符可以包含 英文字母26个(区分大小写) 、 0-9数字 、 $（美元符号） 和 _（下划线） 。
			标识符不能以数字开头。
			标识符不能是关键字。
		3.命名规范： 软 性 建 议
			类名规范：首字母大写，后面每个单词首字母大写（大驼峰式）。
				Demo01BianLiang
				Demo02BianLiang
				Demo03BianLiangNotice
				Demo04BiaoShiFu
				
			方法名规范： 首字母小写，后面每个单词首字母大写（小驼峰式）。
				getMin(...){...}
				getMax(...){...}
				
			变量名规范：首字母小写，后面每个单词首字母大写（小驼峰式）。
				num
				value
				maxValue
*/
public class Demo04BiaoShiFu {
	public static void main(String[] args){
		int b2;//正确
		//int b*2;//错误: 不能包含*
		
		//int 2b;//错误: 不能以数字开头
		
		//int public;//错误: 不能是关键字。
		
		//按照小驼峰规则,定义变量
		int ageOfMyGirlFriend = 18;
		System.out.println(ageOfMyGirlFriend);
	}
}