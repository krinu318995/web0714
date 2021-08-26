package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import DAO.BoardDAO;
import Domain.BoardDTO;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class BoardController implements Initializable {

	private static BoardDTO board;

	// 프로그램이 종료할 때까지 메모리 할당
	private static BoardController instance;

	public BoardController() {
		instance = this;
	}

	public static BoardController getInstance() {
		return instance;
	}

	public BoardDTO getBoard() {
		return board;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		BoardDAO boardDAO = BoardDAO.getBoardDAO();
		ObservableList<BoardDTO> boardDTOs = boardDAO.boardList();

		table_view.setItems(boardDTOs);
		TableColumn tc = table_view.getColumns().get(0); // 첫번째 열[필드] 가져오기
		tc.setCellValueFactory(new PropertyValueFactory<>("bno"));

		tc = table_view.getColumns().get(1); // 두번째 열[필드] 가져오기
		tc.setCellValueFactory(new PropertyValueFactory<>("btitle"));

		tc = table_view.getColumns().get(2); // 세번째 열[필드] 가져오기
		tc.setCellValueFactory(new PropertyValueFactory<>("bwriter"));

		tc = table_view.getColumns().get(3); // 네번째 열[필드] 가져오기
		tc.setCellValueFactory(new PropertyValueFactory<>("bdate"));

		tc = table_view.getColumns().get(4); // 다섯번째 열[필드] 가져오기
		tc.setCellValueFactory(new PropertyValueFactory<>("bcount"));
		// 4. 테이블의 리스트 연결
		table_view.setItems(boardDTOs); // 테이블에 리스트 넣기

		// 테이블의 행 클릭했을 때 이벤트
		table_view.setOnMouseClicked((MouseEvent event) -> {
			if (event.getButton().equals(MouseButton.PRIMARY)) {
				board = table_view.getSelectionModel().getSelectedItem();
				boardDAO.baordCount(board.getBcount() + 1, board.getBno());
				MainController.getInstance().loadPage("boardDetail");

			}

		});

	}

	@FXML
	private AnchorPane communityPage;

	@FXML
	private TableView<BoardDTO> table_view; // generic

	@FXML
	private Button write;

	@FXML
	void write(ActionEvent event) {
		MainController.getInstance().loadPage("boardWrite");
	}

}
