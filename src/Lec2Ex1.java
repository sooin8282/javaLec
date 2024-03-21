import java.util.Scanner;
public class Lec2Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		int num1,num2;
		
		System.out.println("정수 두 개를 입력하세요.");
		
		num1=input.nextInt();
		num2=input.nextInt();
		
		if (num1>num2) {
			System.out.println("더 큰 수는"+num1+"입니다.");
		}
		else if (num1==num2) {
			System.out.println("두 수가 같습니다.");
		}
		else {
			System.out.println("더 큰 수는"+num2+"입니다.");
		}
	}

}
