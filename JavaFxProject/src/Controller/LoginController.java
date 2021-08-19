package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Domain.List;
import Domain.Member;
import javafx.animation.PauseTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Duration;

public class LoginController implements Initializable {

	private static LoginController instance;// 현재 클래스의 객체

	public LoginController() {// 현재 클래스의 메모리를 받아 객체를 생성하는 생성자
		instance = this;
	}

	public static LoginController getInstance() {
		// 객체 반환 메서드
		return instance;
	}

	public String getLoginId() {
		return txt_id.getText();
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		txt_confirm.setText("");
		loading.setVisible(false);

	}

	@FXML
	private ImageView loading;

	@FXML
	private TextField txt_id;
	@FXML
	private PasswordField txt_password;

	@FXML
	private Label txt_confirm;

	@FXML
	private Label btn_signin;

	@FXML
	private Label btn_signup;

	@FXML
	private Label btn_findpassword;

	@FXML
	private Label btn_findid;

	@FXML
	void signIn(MouseEvent event) {

		PauseTransition pauseTransition = new PauseTransition();
		pauseTransition.setDuration(Duration.seconds(2));
		pauseTransition.setOnFinished(e -> {
			// 익명 메서드 [람다식]
			// 인수 -> {실행 코드}

			if (txt_id.getText().equals("admin") && txt_password.getText().equals("1234")) {
				txt_confirm.setText("관리자 로그인 성공");
				// main 페이지 실행, 로그인 화면 닫기

			}
			txt_confirm.setText("올바른 회원 정보가 아닙니다");
		});

		if (txt_id.getText().equals("")) {
			txt_confirm.setText(" - 아이디를 입력해주세요 - ");
			return;
		}
		if (txt_password.getText().equals("")) {
			txt_confirm.setText(" - 비밀번호를 입력해주세요 - ");
			return;
		}

		if (txt_id.getText().equals("admin") && txt_password.getText().equals("1234")) {
			txt_confirm.setText(" - 로그인 성공 - ");
			return;
		}

		for (Member member : List.members) {
			if (member.getId().equals(txt_id.getText()) && member.getPassword().equals(txt_password.getText())) {
				// main page
				Stage mainStage = new Stage();
				try {
					Parent parent = FXMLLoader.load(getClass().getResource("/FXML/Main.fxml"));
					Scene scene = new Scene(parent);
					mainStage.setScene(scene);
					mainStage.setScene(scene);
					mainStage.show();
					Image iconImage = new Image("file:D:/Java_KNR/JavaFxProject/src/Fxml/2083256.png");
					mainStage.getIcons().add(iconImage);

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				btn_signin.getScene().getWindow().hide();
				return;
			}
		}
		txt_confirm.setText(" - 올바른 회원정보가 아닙니다 -");

	}

	@FXML
	void signUp(MouseEvent event) throws Exception {
		System.out.println("회원가입 페이지로 이동");
		Stage stage = new Stage();
		// fxml불러오기
		Parent parent = FXMLLoader.load(getClass().getResource("/Fxml/signUp.fxml"));
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.show();

	}

	@FXML
	void findPassword(MouseEvent event) throws Exception {
		System.out.println("비밀번호 찾기 페이지로 이동");
		System.out.println("아이디 찾기 페이지로 이동");

		Stage stage = new Stage();
		// fxml불러오기
		Parent parent = FXMLLoader.load(getClass().getResource("/Fxml/findPassword.fxml"));
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	void findId(MouseEvent event) throws Exception {
		System.out.println("아이디 찾기 페이지로 이동");

		Stage stage = new Stage();
		// fxml불러오기
		Parent parent = FXMLLoader.load(getClass().getResource("/Fxml/findId.fxml"));
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.show();

	}

}
