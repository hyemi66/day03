package if_else;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day;
		System.out.print("오늘은 4월 며칠입니까?(숫자만 기입) ");
		day = sc.nextInt();
		if (day%5==1) {
			System.out.println(day + "일은 짱구가 청소하는 날입니다.");
		}
		if (day%5==2) {
			System.out.println(day + "일은 유리가 청소하는 날입니다.");
		}
		if (day%5==3) {
			System.out.println(day + "일은 철수가 청소하는 날입니다.");
		}
		if (day%5==4) {
			System.out.println(day + "일은 맹구가 청소하는 날입니다.");
		}
		if (day%5==0) {
			System.out.println(day + "일은 훈이가 청소하는 날입니다.");
		}
		if (day>30) {
			System.out.println("잘못입력하셨습니다 다시 실행해주세요");
		}
		
	}
}
