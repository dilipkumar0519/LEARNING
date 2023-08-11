import java.util.Scanner;
public class GalacticArithmeticDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 value");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println(galacticAddition( num1, num2));
	}
	public static long galacticAddition(long num1, long num2) {
		return num1+num2;
	}

}
