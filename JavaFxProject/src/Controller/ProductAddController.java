package Controller;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import DAO.ProductDAO;
import Domain.ProductDTO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class ProductAddController implements Initializable {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}

	@FXML
	private AnchorPane product;

	@FXML
	private Button cancel;

	@FXML
	private Button productAdd;

	@FXML
	private TextArea pcontents;

	@FXML
	private TextField pname;

	@FXML
	private TextField pstock;

	@FXML
	private TextField pprice;

	@FXML
	private RadioButton opt1;

	@FXML
	private RadioButton opt2;

	@FXML
	private RadioButton opt4;

	@FXML
	private RadioButton opt3;

	@FXML
	private RadioButton opt5;

	@FXML
	private Button imageUpload;

	@FXML
	private Label path;

	@FXML
	private Label uploadTime;

	@FXML
	private ImageView uploadeimage;

	@FXML
	void cancel(ActionEvent event) {
		MainController.getInstance().loadPage("productPage");
	}

	@FXML
	void upload(ActionEvent event) {

		String name = pname.getText();
		String contents = pcontents.getText();
		int price = Integer.parseInt(pprice.getText());
		int stock = Integer.parseInt(pstock.getText());

		String category = "";

		// 라디오버튼 선택했을 때 값 변경
		if (opt1.isSelected()) {
			category = "상의";
		}
		if (opt2.isSelected()) {
			category = "하의";
		}
		if (opt3.isSelected()) {
			category = "신발";
		}
		if (opt4.isSelected()) {
			category = "가방";
		}
		if (opt5.isSelected()) {
			category = "ACC";
		}

		ProductDTO productDTO = new ProductDTO(name, pimage, contents, category, price, stock, 0);

	}

//첨부파일 화면 스테이지
	private Stage filestage;
	private String pimage;

	@FXML
	void imageUpload(ActionEvent event) {
		// 파일 선택 클래스 : 선택된 이미지의 경로 DB저장
		FileChooser fileChooser = new FileChooser();

		fileChooser.getExtensionFilters().addAll(new ExtensionFilter("그림파일 : Image File,", "*png", "*jpg", "*gif"));

		File file = fileChooser.showOpenDialog(filestage);

		if (file != null) {

			System.out.println(file.getPath());
			System.out.println(file.toURI().toString());
			path.setText("파일 경로 : " + file.getPath());// "\" -> /
			pimage = file.toURI().toString();
			Image image = new Image(pimage);
			uploadeimage.setImage(image);
		}

	}

}
