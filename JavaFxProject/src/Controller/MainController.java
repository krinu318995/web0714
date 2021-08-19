package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

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
	void logout(MouseEvent event) {

	}

	@FXML
	void product(MouseEvent event) {

	}

}
