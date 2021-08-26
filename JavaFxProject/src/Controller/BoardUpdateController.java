package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import DAO.BoardDAO;
import Domain.BoardDTO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;

public class BoardUpdateController implements Initializable {

	private BoardDTO boardDTO = null;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// 메서드(함수)안에서 선언된 변수는 밖으로 나갈 수 없음 - 지역 변수

		boardDTO = BoardController.getInstance().getBoard();
		title.setText(boardDTO.getBtitle());
		contents.setText(boardDTO.getBcontent());
	}

	@FXML
	private AnchorPane communityPage;

	@FXML
	private Button save;

	@FXML
	private TextArea contents;

	@FXML
	private TextField title;

	@FXML
	private Button calcel;

	@FXML
	void delete(ActionEvent event) {
		MainController.getInstance().loadPage("communityPage");
	}

	@FXML
	void save(ActionEvent event) {

		BoardDAO boardDAO = BoardDAO.getBoardDAO();

		boolean result = boardDAO.boardUpdate(title.getText(), contents.getText(), boardDTO.getBno());
		if (result) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setContentText("작성 완료");
			alert.setHeaderText("작성 완료");
			alert.showAndWait();
			MainController.getInstance().loadPage("communityPage");
		} else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setContentText("작성 실패");
			alert.setHeaderText("작성 실패");
			alert.showAndWait();
		}
	}

}
