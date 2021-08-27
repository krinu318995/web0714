package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class ProductPageController implements Initializable {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}

	@FXML
	private AnchorPane product;

	@FXML
	private Button productSum;

	@FXML
	private TableColumn<?, ?> bno;

	@FXML
	private TableColumn<?, ?> bname;

	@FXML
	private TableColumn<?, ?> bcategory;

	@FXML
	private TableColumn<?, ?> bprice;

	@FXML
	private TableColumn<?, ?> bstock;

	@FXML
	private TableColumn<?, ?> bactivation;

	@FXML
	private TableColumn<?, ?> bquantity;

	@FXML
	private Button productAdd;

	@FXML
	private ImageView productImgae;

	@FXML
	private Label productDetail;

	@FXML
	private Label productStatus;

	@FXML
	private Label productNanme;

	@FXML
	void productAdd(ActionEvent event) {
		
		
		MainController.getInstance().loadPage("productAddPage");
	}

	@FXML
	void productSum(ActionEvent event) {

	}
}
