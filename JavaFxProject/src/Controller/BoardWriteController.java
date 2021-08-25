package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import DAO.BoardDAO;
import Domain.BoardDTO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class BoardWriteController implements Initializable {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}

	@FXML
	private AnchorPane communityPage;

	@FXML
	private Button write;

	@FXML
	private TextArea contents;

	@FXML
	private TextField title;

	@FXML
	private Button cancel;

	@FXML
	void write(ActionEvent event) {
		String btitle = title.getText();
		String bcontents = contents.getText();
		String bwriter = LoginController.getInstance().getLoginId();

		BoardDTO boardDTO = new BoardDTO(btitle, bcontents, bwriter);

		BoardDAO boardDAO = BoardDAO.getBoardDAO();
		
		boolean result = boardDAO.boardwrite(boardDTO);
		
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

	@FXML
	void cancel(ActionEvent event) {
		MainController.getInstance().loadPage("communityPage");
	}
}
