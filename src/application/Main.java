package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;




public class Main extends Application {
	public static Stage stage;
	public AnchorPane layout;
	
	/***
	 * 
	 * @author rhg310
	 * Start class:
	 * 	-Sets up scene and stage for application to be processed
	 *	-Utilizes FXML doc in order to load scenes	
	 *
	 */
	
	@Override
	public void start(Stage primaryStage) {
		Main.stage = primaryStage;
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/view/HomePageFXML.fxml"));
			Scene scene = new Scene(root,800,800);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	/*
	 *  Launches Scene
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
