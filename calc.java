package calc;

import java.util.Scanner;

public class cacrculator {

	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);

		System.out.println("========================");
		System.out.println("계산기 프로그램입니다.");
		System.out.println("원하는 연산을 입력해주세요.");
		System.out.println("1. +");
		System.out.println("2. -");
		System.out.println("3. *");
		System.out.println("4. /");
		System.out.println("========================");
		
		// 사용자 입력
		System.out.print("원하는 숫자를 입력하세요 : ");
		int number = sc.nextInt();
		System.out.println("A와 B를 입력하세요 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		switch(number) {
		case 1:
			Plus(a,b);
			break;
		case 2:
			Minus(a,b);
			break;
		case 3:
			Mul(a,b);
			break;
		case 4:
			Div(a,b);
			break;
		}
		System.out.println("프로그램이 종료되었습니다.");
	}
    
  	public static void Plus(int x, int y) {
		System.out.println("A + B = "+(x+y));
	}
	
	public static void Minus(int x, int y) {
		if(x>=y)
			System.out.println("A - B = "+(x-y));
		else
			System.out.println("B - A = "+(y-x));
	}
	
	public static void Mul(int x, int y) {
		System.out.println("A * B = "+(x*y));
	}
	
	public static void Div(int x, int y) {
		System.out.println("A / B = "+(x/y));
	}//kkk
}




