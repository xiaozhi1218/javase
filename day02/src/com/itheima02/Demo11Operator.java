package com.itheima02;

/*
	%运算符: 取余数(模)运算符
		被除数 ÷ 除数 = 商(/: 取的就是商) ......	余数(%: 取的就是余数)
		
	作用:
		1.判断数字的奇偶性: 
			数字%2 结果是0 说明数字是偶数
			数字%2 结果不是0 说明数字是奇数
			
		2.判断一个数字是否能够被另外一个数字整除
			结果为0: 说明可以整除
			结果不为0: 说明不可以整除
			
		3.可以把%和/结合使用计算数字的个位,十位,百位,千位
			比如有个int变量num,保存数字1234
			int num = 1234;
			个位: num%10
			十位: num/10%10
			百位: num/100%10
			千位: num/1000%10
*/
public class Demo11Operator {
	public static void main(String[] args){
		System.out.println(10%2);//0 说明10是偶数
		System.out.println(11%2);//1 说明11是奇数
		
		System.out.println(100%25);//0 说明100可以被25整除
		System.out.println(100%26);//22 说明100不可以被26整除
		
		System.out.println("---------------");
		int num = 1234;
		System.out.println(num%10);//4: 个位    1234 ÷ 10 = 商123 .... 余数4(%)
		//System.out.println(num/10);//123	    1234 ÷ 10 = 商123(/) .... 余数4(%)
		System.out.println(num/10%10);//3 十位  123 ÷ 10 = 商12(/) ...  余数3(%)
		
		//System.out.println(num/100);//12     1234 ÷ 100 = 商12(/) ... 余数34(%)
		
		System.out.println(num/100%10);//2 百位 12 ÷ 10 = 商1(/) ...  余数2(%)
		
		System.out.println(num/1000%10);//1 千位
	}
}