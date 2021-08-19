package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import Domain.List;
import Domain.Member;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;

public class FindPasswordController implements Initializable {

	@FXML
	private TextField txt_id;

	@FXML
	private Label btn_findPassword;

	@FXML
	private TextField txt_email;

	@FXML
	private Label userPassword;

	@FXML
	void findPassword(MouseEvent event) {
		for (Member member : List.members) {
			if (member.getId().equals(txt_id.getText()) && member.getEmail().equals(txt_email.getText())) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setContentText("비밀번호 " + member.getPassword());
				alert.showAndWait();
				userPassword.getScene().getWindow().hide();
				return;
			}
		}

		userPassword.setText("입력하신 회원 정보가 없습니다.");

	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		userPassword.setText("");

	}

}
