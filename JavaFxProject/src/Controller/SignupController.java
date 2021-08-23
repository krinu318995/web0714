package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

import DAO.FileUtil;
import DAO.MemberDAO;
import Domain.List;
import Domain.Member;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class SignupController implements Initializable {

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
		if (txt_id.getText().length() <= 3 || txt_id.getText().length() > 10) {
			txt_confirm.setText("아이디는 4~10글자이내만 가능합니다.");
			return;
		}
		// 2. 비밀번호와 비밀번호 확인이 사로 다른경우 실패
		if (!txt_password.getText().equals(txt_password_confirm.getText())) {
			txt_confirm.setText("패스워드가 서로 다릅니다. ");
			return;
		}
		// 3. 비밀번호 8~15글자이내
		if (txt_password.getText().length() <= 7 || txt_password.getText().length() > 15) {
			txt_confirm.setText("비밀번호는 8~15글자이내만 가능합니다.");
			return;
		}
		// 4. 이메일 반드시 @ 포함되도록
		if (!txt_email.getText().contains("@")) {
			txt_confirm.setText("이메일 형식으로 입력해주세요.");
			return;
		}

//		try {
//			Integer.parseInt(txt_phone.getText());
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		// 전화번호 -을 제외한 11글자
		if (txt_phone.getText().contains("-") || txt_phone.getText().length() != 11) {
			txt_confirm.setText("연락처는 -제외한 숫자 11 자리 .");
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

		// 파일처리
		// FileUtil.FileSave();

		// db처리
		MemberDAO memberDAO = MemberDAO.getMemberDao();
		boolean result = memberDAO.signUp(member);
		if (result) {
			// 리스트
			// List.members.add(member);
			// 1. 메시지 객체 만들기 [ Alert 클래스 ]
			Alert alert = new Alert(AlertType.INFORMATION);
			// 2. 메시지 내용 넣기
			alert.setContentText(" 가입을 축하합니다 ");
			alert.setHeaderText(" 회원가입 성공 ");
			// 3. 메시지 실행
			alert.showAndWait(); // 창열고 닫을때 까지 기다리기
			// 4. 현재 회원가입 스테이지 끄기

			System.out.println("회원가입 완료");
			btn_signup.getScene().getWindow().hide();
			return;
		} else {
			txt_confirm.setText("동일한 아이디가 존재합니다.");
			return;
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		txt_confirm.setText("");

	}
}
