package Start;

import DAO.FileUtil;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Start extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// 1. 스테이지 이름 정함
		// 2. fxml
		Parent parent = FXMLLoader.load(getClass().getResource("/Fxml/loginPage.fxml"));// 현재 클래스의 패키지와 fxml파일의 패키지 경로가
																						// 다름

		// 3. scene
		Scene scene = new Scene(parent);

		stage.setScene(scene);

		stage.setResizable(false);
		stage.setTitle("member");
		// 이미지 불러오기
		Image image = new Image("file:D:/Java_KNR/JavaFxProject/src/Fxml/2083256.png");
		stage.getIcons().add(image);

		stage.show();

	}

	// start method 호출
	public static void main(String[] args) {
		try {
			FileUtil.FileLoad();
		} catch (Exception e) {
			// TODO: handle exception
		}
		launch(args);

	}

}
