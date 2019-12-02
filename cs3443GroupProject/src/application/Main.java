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
	
	@Override
	public void start(Stage primaryStage) {
		/*try {
			this.stage = primaryStage;
			initLayout("/HomePageFXML.fxml");
		} catch(Exception e) {
			e.printStackTrace();
		}*/
		Main.stage = primaryStage;
		try {
			//BorderPane root = new BorderPane();
			Parent root = FXMLLoader.load(getClass().getResource("/application/HomePageFXML.fxml"));
			Scene scene = new Scene(root,800,800);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
/*	public void initLayout(String fileName)
	{
		try
		{
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource(fileName));
			this.layout = (AnchorPane) loader.load();
			
			Scene scene = new Scene(layout);
			this.stage.setScene(scene);
			this.stage.show();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	*/
	public static void main(String[] args) {
		launch(args);
	}
}
