package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainController implements Initializable {

	private static MainController instance;

	public MainController() {
		instance = this;
	}
	
	public static MainController getInstance() {
		return instance;
	}

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
		loadPage("chattingPage");
	}

	@FXML
	void community(MouseEvent event) {
		loadPage("communityPage");
	}

	@FXML
	void customer_service(MouseEvent event) {
		loadPage("customer_servicePage");
	}

	@FXML
	void info(MouseEvent event) {
		loadPage("infoPage");
	}

//679 / 634
	@FXML
	void logout(MouseEvent event) throws Exception { // 로그아웃 클릭 -> 로그아웃 처리
		// 현재 스테이지를 닫기 -> 로그인 스테이지 열기

		Alert alert = new Alert(AlertType.CONFIRMATION);
		// AlertType.CONFIRMATION : 확인/취소 버튼
		alert.setContentText("로그아웃 하시겠습니까?");
		alert.setHeaderText("로그아웃");

		// 해당 페이지에서 선택한 버튼 갖고옴
		Optional<ButtonType> optional = alert.showAndWait();
		System.out.println(optional);
		// null을 포함한 모든 값을 저장하는 하나의 객체
		// 현재 스테이지 닫기 : 현재 컨트롤러 이름.getScene().getWindow().hide();

		if (optional.get() == ButtonType.OK) {
			// 확인 버튼을 눌렀을 때만 로그아웃

			btn_logout.getScene().getWindow().hide();

			// 1. 스테이지 이름 정함
			// 2. fxml
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
		}

	}

	@FXML
	void product(MouseEvent event) {
		loadPage("productPage");
	}
	////////////////////////

	// 페이지 전환 메서드
	public void loadPage(String page) {
		// private AnchorPane cp; -> 가운데 영역에 표시

		try {
			Parent parent = FXMLLoader.load(getClass().getResource("/FXML/" + page + ".fxml"));
			boader_pane.setCenter(parent);

		} catch (IOException e) {

			e.printStackTrace();
			e.getMessage();
		}
	}

}
