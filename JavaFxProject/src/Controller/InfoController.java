package Controller;

import java.net.URL;
import java.util.Optional;
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
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class InfoController implements Initializable {
	private String loginUserId;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		loginUserId = LoginController.getInstance().getLoginId();

		MemberDAO dao = MemberDAO.getMemberDao();

		Member member = dao.getmember(loginUserId);

		txt_id.setText(member.getId());
		txt_name.setText(member.getName());
		txt_email.setText(member.getEmail());
		String phone = member.getPhoneNumber().substring(0, 3) + "-" + member.getPhoneNumber().substring(3, 7) + "-"
				+ member.getPhoneNumber().substring(7, 11);
		txt_phoneNumber.setText(phone);
		txt_point.setText(member.getPoint() + "");

//		for (Member member : List.members) {
//			if (member.getId().equals(loginUserId)) {
//				txt_id.setText(member.getId());
//				txt_name.setText(member.getName());
//				txt_email.setText(member.getEmail());
//				String phone = member.getPhoneNumber().substring(0, 3) + "-" + member.getPhoneNumber().substring(3, 7)
//						+ "-" + member.getPhoneNumber().substring(7, 11);
//				txt_phoneNumber.setText(phone);
//
//				txt_point.setText(member.getPoint() + "");
//			}
		// }

	}

	@FXML
	private AnchorPane info;

	@FXML
	private Label txt_id;

	@FXML
	private Label txt_name;

	@FXML
	private Label txt_email;

	@FXML
	private Label txt_phoneNumber;

	@FXML
	private Label txt_point;

	@FXML
	private Label btn_update;

	@FXML
	private Label btn_delete;

	@FXML
	void delete(MouseEvent event) throws Exception {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setContentText("정말 회원탈퇴 하시겠습니까?");
		alert.setHeaderText("회원탈퇴");

		Optional<ButtonType> optional = alert.showAndWait();

		if (optional.get() == ButtonType.OK) {
			MemberDAO memberDAO = MemberDAO.getMemberDao();
			boolean result = memberDAO.memberDelete(loginUserId);

			if (result) {
				btn_delete.getScene().getWindow().hide();
				Parent parent = FXMLLoader.load(getClass().getResource("/Fxml/loginPage.fxml"));
				Scene scene = new Scene(parent);

				Stage stage = new Stage();
				stage.setScene(scene);

				stage.setResizable(false);
				stage.setTitle("member");
				Image image = new Image("file:D:/Java_KNR/JavaFxProject/src/Fxml/2083256.png");
				stage.getIcons().add(image);
				stage.show();
			}

		}
	}

//	for (Member member : List.members) {
//		if (member.getId().equals(loginUserId)) {
//			List.members.remove(member);
//
//			// 파일처리
//			FileUtil.FileSave();
//
//			// 메인 스테이지 닫기
//			btn_delete.getScene().getWindow().hide();
//			Parent parent = FXMLLoader.load(getClass().getResource("/Fxml/loginPage.fxml"));
//			// 현재 클래스의 패키지와 fxml파일의 패키지 경로가 다름
//
//			// 3. scene
//			Scene scene = new Scene(parent);
//
//			Stage stage = new Stage();
//
//			stage.setScene(scene);
//
//			stage.setResizable(false);
//			stage.setTitle("member");
//			// 이미지 불러오기
//			Image image = new Image("file:D:/Java_KNR/JavaFxProject/src/Fxml/2083256.png");
//			stage.getIcons().add(image);
//
//			stage.show();
//		}
//	}

	@FXML
	void update(MouseEvent event) {
		MainController.getInstance().loadPage("updateInfoPage");
	}

}
