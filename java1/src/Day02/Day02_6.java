package Day02;

import java.util.Scanner;

public class Day02_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("기본급여 : ");
		int basic = scanner.nextInt();

		System.out.println("수당 : ");
		int extra = scanner.nextInt();

		double tax = basic * 0.1;
		double Actual_receipts = (basic + extra) - tax;
		System.out.println("\t급여 명세서");
		System.out.println("기본급여 : "+basic);
		System.out.println("수당 : "+extra);
		System.out.println("실수령액"+Actual_receipts);
	}
}
