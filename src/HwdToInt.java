import java.util.Scanner;
public class HwdToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("한글을 입력하시오.");
		String HwdNum = input.next();

		
		
		switch(HwdNum) {
		case "하나":
		case "일":
		case "첫째":
			System.out.println(1);
			break;
		case "둘":
		case "이":
		case "둘째":
			System.out.println(2);
			break;
		default:
			System.out.println(3);
			break;
		}
	}

}
