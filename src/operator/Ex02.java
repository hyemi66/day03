package operator;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		/*
		 삼항 연산자(조건연산자)
		 (조건식) ? 참인경우 실행 : 거짓인경우 실행 ;
		*/
		int su;
		su = 8;
		String s = (su%2==0)?"짝수":"홀수";
		System.out.println(su+":"+s);
		s = (su%3==0)?"3의 배수":"3의 배수 아님";
		System.out.println(s);
		
		// 문제
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		a = sc.nextInt();
		String str = (a%2==0)?"짝수":"홀수";
		System.out.println(a+" : "+str);
		
		int b;
		System.out.print("수 입력 : ");
		b = sc.nextInt();
		str = (b%3==0)?"3의 배수":"3의배수아님";
		System.out.println(b+" : "+str);
		
		int c,d;
		System.out.print("두 수 입력 : ");
		c = sc.nextInt();
		d = sc.nextInt();
		System.out.println("num1 : "+c + ", num2 : "+d);
		str = (c>d)?"num1이 num2보다 크다":"num2가 num1보다 크다";
		System.out.println(str);
		
	}
}
