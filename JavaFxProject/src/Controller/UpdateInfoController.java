package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import DAO.FileUtil;
import DAO.MemberDAO;
import Domain.List;
import Domain.Member;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class UpdateInfoController implements Initializable {

	private String loginUserId;

	private Member member = null;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		loginUserId = LoginController.getInstance().getLoginId();

		MemberDAO memberDAO = MemberDAO.getMemberDao();
		member = memberDAO.getmember(loginUserId);
		txt_email.setText(member.getEmail());
		txt_phone.setText(member.getPhoneNumber());
		/*
		 * for (Member member : List.members) { txt_email.setText(member.getEmail());
		 * txt_phone.setText(member.getPhoneNumber()); }
		 */
	}

	@FXML
	private AnchorPane info;

	@FXML
	private Label btn_update;

	@FXML
	private PasswordField txt_password;

	@FXML
	private PasswordField txt_new;

	@FXML
	private TextField txt_email;

	@FXML
	private TextField txt_phone;

	@FXML
	void update(MouseEvent event) throws Exception {

		String password = txt_password.getText();

		if (!member.getPassword().equals(password)) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setContentText("기존 비밀번호가 일치하지 않습니다");
			alert.setHeaderText("수정 실패");
			alert.showAndWait();
			return;
		}

		member.setEmail(txt_email.getText());
		member.setPhoneNumber(txt_phone.getText());

		// 2. 새로운 비밀번호가 없을경우 [ 기존 비밀번호 사용 ]
		if (!txt_new.getText().equals("")) {
			member.setPassword(txt_new.getText());
		}
		// db 업데이트 처리
		MemberDAO memberDao = MemberDAO.getMemberDao();
		boolean result = memberDao.memberUpdate(member);

		if (result) {

			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setContentText("회원정보가 수정 되었습니다. 로그아웃 처리후 다시 로그인 해주세요");
			alert.setHeaderText("회원정보 수정 성공");
			alert.showAndWait();
			// 현재 스테이지 닫기
			btn_update.getScene().getWindow().hide();

			// 2. 로그인 스테이지 열기
			Stage stage = new Stage();
			// 2. fxml 파일 객체화 // 현재 클래스와 패키지가 다르기 때문에 [ 경로 설정 ]
			Parent parent = FXMLLoader.load(getClass().getResource("/FXML/signIn.fxml"));
			// 3. 씬 만들어서 fxml파일 넣기
			Scene scene = new Scene(parent);
			// 4. 스테이지에 씬 넣기
			stage.setScene(scene);
			// 5. 스테이지 설정 및 실행
			stage.setResizable(false); // 스테이지 크기변경불가

			// 스테이지 아이콘
			// 1.이미지 불러오기
			Image image = new Image(
					"C:/Users/User/git/web0714/JavaFxProject/web0714/JavaFxProject/src/Fxml/2083256.png");
			stage.getIcons().add(image);
			stage.show();
			return;
		}

	}

}
