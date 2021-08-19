package Controller;

import java.util.Scanner;

import DAO.FileUtil;
import Domain.List;
import Domain.Member;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class SignupController {

	@FXML
	private TextField txt_id;

	@FXML
	private TextField txt_password;

	@FXML
	private PasswordField txt_password_confirm;

	@FXML
	private TextField txt_name;

	@FXML
	private TextField txt_email;

	@FXML
	private TextField txt_phone;

	@FXML
	private Label btn_signup;

	@FXML
	private Label txt_confirm;

	@FXML
	void signUp(MouseEvent event) throws Exception {
		// 유효성 검사

		Scanner scanner = new Scanner(System.in);
		// 아이디 길이 4-10글자
		if (txt_id.getText().length() >= 4 && txt_id.getText().length() <= 10) {
			txt_confirm.setText("사용할 수 있는 아이디 입니다.");
		} else {
			txt_confirm.setText("유효하지 않은 아이디 입니다.");
			return;
		}
		// 비밀번호와 비밀번호 확인이 서로 일치하는가
		if (!txt_password.getText().equals(txt_password_confirm.getText())) {
			txt_confirm.setText("입력한 비밀번호를 확인해주세요");
		}
		// 비밀번호 길이는 8글자 이상 15글자 이내
		if (txt_password.getText().length() <= 7 || txt_password.getText().length() >= 15) {
			txt_confirm.setText("비밀번호 길이는 8글자 이상 15글자 이내로 생성해주세요");
			return;
		}

		// 이메일 형식 확인 (@)
		if (!txt_email.getText().contains("@")) {
			txt_confirm.setText("반드시 이메일 형식으로 입력해주세요");
		}

		try {
			Integer.parseInt(txt_phone.getText());
		} catch (Exception e) {
			// TODO: handle exception
		}
		// 전화번호 -을 제외한 11글자
		if (txt_phone.getText().length() != 11 || txt_confirm.getText().contains("-")) {
			txt_confirm.setText("-을 제외한 숫자 11자리를 입력해주세요.");
			return;
		}
		// 객체화

//		private String id;
//		private String password;
//		private String name;
//		private String email;
//		private String phoneNumber;
//		private int point;
		Member member = new Member(txt_id.getText(), txt_password.getText(), txt_name.getText(), txt_email.getText(),
				txt_phone.getText(), 0);
		// 리스트
		List.members.add(member);
		// 1. 메시지 객체 만들기 [ Alert 클래스 ]
		Alert alert = new Alert(AlertType.INFORMATION);
		// 2. 메시지 내용 넣기
		alert.setContentText(" 가입을 축하합니다 ");
		alert.setHeaderText(" 회원가입 성공 ");
		// 3. 메시지 실행
		alert.showAndWait(); // 창열고 닫을때 까지 기다리기
		// 4. 현재 회원가입 스테이지 끄기
		btn_signup.getScene().getWindow().hide();
		System.out.println("회원가입 완료");
		// 파일처리
		FileUtil.FileSave();
	}
}
