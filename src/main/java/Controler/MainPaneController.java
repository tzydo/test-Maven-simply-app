package Controler;

import java.io.IOException;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class MainPaneController {
	
	
	private MainController mainControler;
	
	
	@FXML
	public void AplikacjaAction(){
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/FXML/AplikacjaOkno.fxml"));
		Pane pane = null;
		
		try {
			pane = loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		AplikacjaControler app = loader.getController();
		app.setControler(mainControler);
		
		mainControler.setScreen(pane);
		
	}
	
	
	
	
	
	@FXML
	public void OpcjeAction(){
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/FXML/OpcjeOkno.fxml"));
		Pane pane = null;
		try {
			pane = loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		OpcjeKontroler opcje = loader.getController();
		opcje.setControler(mainControler);
		mainControler.setScreen(pane);
		
	}
	
	
	@FXML
	public void wyjscieAction(){
		Platform.exit();
	}


	public void setControler(MainController mainController) {
		// TODO Auto-generated method stub
		this.mainControler = mainController;
	}
	
}
