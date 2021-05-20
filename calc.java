package calc;

import java.util.Scanner;

public class cacrculator {

	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("========================");
			System.out.println("계산기 프로그램입니다.");
			System.out.println("원하는 연산을 입력해주세요.");
			System.out.println("0. 프로그램종료");
			System.out.println("1. +");
			System.out.println("2. -");
			System.out.println("3. *");
			System.out.println("4. /");
			
			//새로만든부분
			System.out.println("5. 세제곱");	//단항연산
			System.out.println("6. 펙토리얼");	//단항
			System.out.println("7. 루트");	//단항
			System.out.println("8. 절대값");	//단항
			System.out.println("9. 시그마");
			System.out.println("10. 로그");
			System.out.println("11. 사인"); //단항
			System.out.println("12. 코사인"); //단항
			System.out.println("13. 탄젠트"); //단항
			System.out.println("========================");
			
			//사용자입력
			int a,b=-1;
			System.out.print("원하는 숫자를 입력하세요 : ");
			int number = sc.nextInt();
			if(number==0)
			{
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			
			if(number==5 || number==6 ||number==7 ||number==8 ||number==11||number==12||number==13)
			{
				System.out.println("A를 입력하세요 : ");
				a = sc.nextInt();
			}
			else
			{
				System.out.println("A와 B를 입력하세요 : ");
				a = sc.nextInt();
				b = sc.nextInt();
			}
			
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
				threegob(a);
				break;
			case 6:
				fac(a);
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
			case 10:
				doLog(a,b);
				break;
			case 11:
				Sin(a);
				break;
			case 12:
				Cos(a);
				break;
			case 13:
				Tan(a);
				break;
			}
		}
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
	
	public static void threegob(int x) {
		System.out.println("A ^ 3 = "+(x*x*x));
	}
	
	public static void fac(int x) {
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
        for(int i=x; i<y+1; i++){
            sum += i;
         }
       System.out.println(y);
       System.out.println("Σ   = "+ sum);
       System.out.println("x="+x);
	}
	
	public static void doLog(double a, double b) {
		System.out.print(Math.log(b) / Math.log(a));
		//log a(b)가 log b / log a 로 바뀐다는 것을 이용
	}//값을 반환하고 싶으면 
	//void 타입에서 double 타입으로 바꾸고 
	//return 으로 print() 안의 값을 반환
	
	public static void Sin(double x) { 
		Scanner input = new Scanner(System.in); 
		int a=0;
		System.out.print("대입할 인자가 라디안이면 1, 각도일 경우 2를 누르시오 : ");
		a = input.nextInt();
		if(a == 1) {
			System.out.printf("sin(%.3f) = %.3f", x , Math.sin(x));
		}
		else {
			System.out.printf("sin(%.3f) = %.3f", x , Math.sin(x* Math.PI/180));
		} 
	}
	// 라디안과 각도를 선택해 입력하도록 설계 cos과 tan도 똑같은 원리로 
	public static void Cos(double x) 
	{ 
		Scanner input = new Scanner(System.in); 
		int a=0;
		System.out.print("대입할 인자가 라디안이면 1, 각도일 경우 2를 누르시오 : ");
		a = input.nextInt();
		if(a == 1) {
			System.out.printf("cos(%.3f) = %.3f", x , Math.cos(x));
		}
		else {
			System.out.printf("cos(%.3f) = %.3f", x , Math.cos(x* Math.PI/180));
		} 
	}
	
	public static void Tan(double x) 
	{ 
		
		Scanner input = new Scanner(System.in); 
		int a=0;
		System.out.print("대입할 인자가 라디안이면 1, 각도일 경우 2를 누르시오 : ");
		a = input.nextInt();
		if(a == 1) {
			System.out.printf("tan(%.3f) = %.3f", x , Math.tan(x));
		}
		else {
			System.out.printf("tan(%.3f) = %.3f", x , Math.tan(x* Math.PI/180));
		} 
	}

}




