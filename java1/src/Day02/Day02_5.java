package Day02;

import java.util.Scanner;

public class Day02_5 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("아이디\t| ");
	String userID  = scanner.next();
	System.out.print("비밀번호\t| ");
	short password = scanner.nextShort();
	System.out.print("이름\t| ");
	String userName = scanner.next();
	System.out.print("이메일t| ");
	String userEmail = scanner.next();
	
	System.out.println(">>>>>>>>>회원가입 완료 [아래 정보를 확인해주세요]<<<<<<<<<");
	System.out.println("아이디\t비밀번호\t이름\t이메일");
	System.out.println(userID+"\t"+password+"\t"+userName+"\t"+userEmail);
	
}
}
