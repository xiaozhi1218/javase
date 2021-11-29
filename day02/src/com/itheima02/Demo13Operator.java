package com.itheima02;

/*
	基本赋值运算符: =
	复合赋值运算符:
		+=		a+=b		a=a+b
		-=		a-=b		a=a-b
		*=		a*=b		a=a*b
		/=		a/=b		a=a/b
		%=		a%=b		a=a%b
*/
public class Demo13Operator {
	public static void main(String[] args){
		int a = 10,b = 20;
		a += b;//a = a + b
		System.out.println(a);//30
		System.out.println(b);//20
		
		int c = 30,d = 20;
		c %= d;//c = c % d = 30%20 = 10
		
		System.out.println(c);//10
		System.out.println(d);//20
	}
}