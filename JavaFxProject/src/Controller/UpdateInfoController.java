package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import DAO.FileUtil;
import Domain.List;
import Domain.Member;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class UpdateInfoController implements Initializable {

	private String loginUserId;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		loginUserId = LoginController.getInstance().getLoginId();

		for (Member member : List.members) {
			txt_email.setText(member.getEmail());
			txt_phone.setText(member.getPhoneNumber());
		}
	}

	@FXML
	private AnchorPane info;

	@FXML
	private Label btn_update;

	@FXML
	private TextField txt_password;

	@FXML
	private TextField txt_new;

	@FXML
	private TextField txt_email;

	@FXML
	private TextField txt_phone;

	@FXML
	void update(MouseEvent event) throws Exception {
		String password = txt_password.getText();
		for (Member member : List.members) {
			if (!member.getPassword().equals(password)) {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setContentText("기존 비밀번호가 일치하지 않습니다.");
				alert.setHeaderText("비밀번호 불일치");
				alert.showAndWait();
				return;
			} // end of if
		}

		for (Member member : List.members) {
			if (member.getId().equals(loginUserId)) {
				member.setEmail(txt_email.getText());
				member.setPhoneNumber(txt_phone.getText());
				if (member.getPassword().equals(password)) {
					member.setPassword(txt_password.getText());
				}
			}

			FileUtil.FileSave();

			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setContentText("회원정보가 수정되었습니다. 다시 로그인해주세요.");
			alert.showAndWait();
			
			btn_update.getScene().getWindow().hide();
			
			Parent parent = FXMLLoader.load(getClass().getResource("/Fxml/loginPage.fxml"));
			// 현재 클래스의 패키지와 fxml파일의 패키지 경로가 다름

			// 3. scene
			Scene scene = new Scene(parent);

			Stage stage = new Stage();

			stage.setScene(scene);

			stage.setResizable(false);
			stage.setTitle("member");
			// 이미지 불러오기
			Image image = new Image("file:D:/Java_KNR/JavaFxProject/src/Fxml/2083256.png");
			stage.getIcons().add(image);

			stage.show();
			return;
		}

	}

}
