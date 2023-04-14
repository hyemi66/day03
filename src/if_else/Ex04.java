package if_else;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// 6조 - 문제1
		Scanner sc = new Scanner(System.in);
		int num;
		String str="";
		System.out.print("점수 입력 : ");
		num = sc.nextInt();
		if (num >= 90) str = "A";
		if (num >= 80) str = "B";
		if (num >= 70) str = "C";
		if (num < 70) str = "D";
		System.out
		
		// 6조 - 문제2
//		int h,m;
//		int t;
//		int sum;
//		int h1,m1;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("몇시 몇분? ");
//		h = sc.nextInt();
//		m = sc.nextInt();
//		System.out.print("산책시간? ");
//		t = sc.nextInt();
//		m += t;
//		sum = 60*h + m;
//		h1 = sum/60;
//		m1 = sum%60;
//		if (h1 >= 24) {
//			System.out.println("산책하고 돌아온 시간은 "+(h1-24)+"시 "+m1+"분 입니다.");
//		}
//		if (h1 < 24) {
//			System.out.println("산책하고 돌아온 시간은 "+h1+"시 "+m1+"분 입니다.");
//		}
		
		// 6조 - 문제3
//		Scanner sc = new Scanner(System.in);
//		int a;
//		int randomNumber = (int) Math.round(Math.random()*99)+1;
//		System.out.print("1부터 100까지의 숫자중 하나만 입력 : ");
//		a = sc.nextInt();
//		int f = a - randomNumber;
//		f = (f>=0)?f:-f;
//		if (a > 100 || a < 1) {
//			System.out.println("숫자를 제대로 입력해 주세요");
//		}
//		if (a>=1 && a<=100) {
//			if (f<=10) System.out.println("승리하셨습니다.");
//			if (f>10) System.out.println("패배하셨습니다");
//			System.out.println("입력한 값 : " + a);
//			System.out.println("랜덤 값 : " + randomNumber);
//			System.out.println("두 수의 차 : " + f);
//		}
		
		
	}
}
