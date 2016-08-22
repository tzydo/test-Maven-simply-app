package testFX1;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/FXML/MainScreene.fxml"));
		StackPane StackPane = loader.load();
		Scene scena = new Scene(StackPane,400,400);
		primaryStage.setScene(scena);
		primaryStage.setTitle("OknoTest");
		primaryStage.show();
		
		
	}

}
