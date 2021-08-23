module JavaFxProject {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;

	//ver 11 이상 명시 필요
	//opens 패키지명 to 라이브러리명
	opens Start to javafx.graphics, javafx.fxml;
	opens Controller to javafx.graphics, javafx.fxml;
	opens DAO to java.sql;

}
