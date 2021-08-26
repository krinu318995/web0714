package Controller;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import DAO.BoardDAO;
import Domain.BoardDTO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;

public class BoardDetailController implements Initializable {

	BoardDTO boardDTO = null;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		// 지역변수 : 메서드 안에서 선언된 변수, 메서드 안에서만 사용 가능
		boardDTO = BoardController.getInstance().getBoard();

		Writer.setText(boardDTO.getBwriter());
		Count.setText("조회수"+boardDTO.getBcount());
		Date.setText("작성일"+boardDTO.getBdate());
		title.setText(boardDTO.getBtitle());
		contents.setText(boardDTO.getBcontent());

		// 작성자와 로그인한 아이디가 일치하지 않을 경우
		if (boardDTO.getBwriter().equals(LoginController.getInstance().getLoginId())) {
			delete.setVisible(true);
			update.setVisible(true);
			// 삭제 버튼과 수정버튼 숨김
		} else {
			delete.setVisible(false);
			update.setVisible(false);
		}
	}

	@FXML
	private AnchorPane communityPage;

	@FXML
	private Button update;

	@FXML
	private TextArea contents;

	@FXML
	private TextField title;

	@FXML
	private Button delete;

	@FXML
	private Label Writer;

	@FXML
	private Label Count;

	@FXML
	private Label Date;

	@FXML
	private Button list;

	@FXML
	void delete(ActionEvent event) {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setContentText("삭제하시겠습니까?");
		alert.setHeaderText("삭제");

		// optional : null을 포함한
		Optional<ButtonType> optional = alert.showAndWait();
		if (optional.get() == ButtonType.OK) {
			BoardDAO boardDAO = BoardDAO.getBoardDAO();
			boardDAO.boardDelete(boardDTO.getBno());

			MainController.getInstance().loadPage("communityPage");
		}

	}

	@FXML
	void list(ActionEvent event) {
		MainController.getInstance().loadPage("communityPage");
	}

	@FXML
	void update(ActionEvent event) {
		MainController.getInstance().loadPage("boardUpdate");
	}

}
