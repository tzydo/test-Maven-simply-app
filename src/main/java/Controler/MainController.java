package Controler;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class MainController {

	@FXML
	private StackPane StackPane;

	@FXML
	private Pane MainPane;// = null;

	@FXML
	public void initialize() {
		glowneOkno();
	}
	
	

	public void glowneOkno() {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/FXML/MainPane.fxml"));

		try {
			MainPane = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		MainPaneController mainPaneC = loader.getController();
		mainPaneC.setControler(this);
		setScreen(MainPane);
	}

	@FXML
	public void setScreen(Pane pane) {
		StackPane.getChildren().clear();
		StackPane.getChildren().add(pane);
	}

}
