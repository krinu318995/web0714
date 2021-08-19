package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import Domain.List;
import Domain.Member;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class FindIdController implements Initializable {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		userId.setText("");

	}

	@FXML
	private TextField txt_name;

	@FXML
	private Label btn_findid;

	@FXML
	private TextField txt_email;

	@FXML
	private Label userId;

	@FXML
	void findId(MouseEvent event) {
		for (Member member : List.members) {
			if (member.getName().equals(txt_name.getText()) && member.getEmail().equals(txt_email.getText())) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setContentText("아이디 " + member.getId());
				alert.showAndWait();
				userId.getScene().getWindow().hide();
				return;
			}
		}
		userId.setText("해당 정보의 아이디가 존재하지 않습니다.");
	}
}
