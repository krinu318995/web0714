package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainController implements Initializable {

	private String loginUserId;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		loginUserId = LoginController.getInstance().getLoginId();
		loginId.setText(loginUserId);

	}

	@FXML
	private BorderPane boader_pane;

	@FXML
	private AnchorPane cp;

	@FXML
	private AnchorPane lp;

	@FXML
	private Label loginId;

	@FXML
	private Label btn_logout;

	@FXML
	private Label btn_community;

	@FXML
	private Label btn_product;

	@FXML
	private Label btn_chatting;

	@FXML
	private Label btn_info;

	@FXML
	private Label btn_customer_service;

	@FXML
	void chatting(MouseEvent event) {

	}

	@FXML
	void community(MouseEvent event) {

	}

	@FXML
	void customer_service(MouseEvent event) {

	}

	@FXML
	void info(MouseEvent event) {

	}

	@FXML
	void logout(MouseEvent event) { //로그아웃 클릭 -> 로그아웃 처리
		//현재 스테이지를 닫기 -> 로그인 스테이지 열기
		
		//현재 스테이지 닫기 : 현재 컨트롤러 이름.getScene().getWindow().hide();
		btn_logout.getScene().getWindow().hide();		

	}

	@FXML
	void product(MouseEvent event) {

	}

}
