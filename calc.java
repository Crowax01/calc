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
		
		//새로만든부분
		System.out.println("5. 세제곱");
		System.out.println("6. 펙토리얼");
		System.out.println("7. 루트");
		System.out.println("8. 절대값");
		System.out.println("9. 시그마");
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
		case 5:
			threegob(a,b);
			break;
		case 6:
			fac(a,b);
			break;
		case 7:
			root(a);
			break;
		case 8:
			abs(a);
			break;
		case 9:
			sigma(a,b);
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
	}
	
	public static void threegob(int x, int y) {
		System.out.println("A ^ 3 = "+(x*x*x));
	}
	
	public static void fac(int x, int y) {
		int fac=1;
		 for (int i = x; i >= 1; i--) {
	            fac = fac * i;
	         // 핵심은 위 for문과 초기값 설정 
	        }
	        System.out.println(x + "!은 " + fac);
	}
	
	public static void root(double x)
	{
		System.out.printf("%.3f", Math.sqrt(x));
	}
	
	public static void abs(double a)
	{
		if(a>=0)
			System.out.println("|A| = "+a);
		else
			System.out.println("|A| = "+-a);

	}
	
	public static void sigma(int x, int y) 
	{
		int sum = 0;
		for(int i=x; i<y+1; i++)
		{
		    sum += i;
		}
	       System.out.println(y);
	       System.out.println("Σ   = "+ sum);
	       System.out.println("x="+x);
	}

}




