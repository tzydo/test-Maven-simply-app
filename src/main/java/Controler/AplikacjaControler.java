package Controler;

import javafx.fxml.FXML;

public class AplikacjaControler {

	private MainController mainControler;
	
	@FXML
	private void Menu(){
		mainControler.glowneOkno(); 
	}
	
	
	public void setControler(MainController mainController) {
		// TODO Auto-generated method stub
		this.mainControler = mainController;
	}
}
