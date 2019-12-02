package application;

import javafx.fxml.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.*;

import javafx.application.*;
import javafx.event.*;

public class HomePageController {

    @FXML
    private Button searchButton;

    @FXML
    private TextField searchField;

    @FXML
    void handleEnterPressed(KeyEvent event) 
    {
    	if(event.getCode() == KeyCode.ENTER)
    	{
    		ActionEvent search = new ActionEvent();
    		handleButtonPress(search);
    	}
    }

    @FXML
    void handleButtonPress(ActionEvent event) 
    {
    	//Search for the desired room
    	
    	//set the next stage and launch it
    	try{
    		//Stage stage = new Stage();
    		FXMLLoader loader = new FXMLLoader();
    		loader.setLocation(Main.class.getResource("/application/SUFloor1FXML.fxml"));
    		AnchorPane ancPane = loader.load();
    		Scene scene = new Scene(ancPane,800,800);
    		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
    		if(ancPane == null)
    			System.out.println("you fucked up(ancPane)");
    		if(scene == null)
    			System.out.println("you still fucked up");
    		Main.stage.setScene(scene);
    		Main.stage.show();
		}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    
    void changeScene()
    {
    	/*FXMLLoader loader = new FXMLLoader(getClass().getResource(fileName));
    	Stage stage = (Stage) searchButton.getScene().getWindow();
    	Scene scene = new Scene(.getScene().setRoot(loader.getRoot()));
    	stage.setScene(scene);*/
    	try{
		Parent root = FXMLLoader.load(getClass().getResource("/application/SUFloor1FXML.fxml"));
		Scene scene = new Scene(root,800,800);
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Main.stage.setScene(scene);
		Main.stage.show();
		}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    
    @Override
    public void handle(ActionEvent actionEvent)
    {
    	
    }
    
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
    	
    }
}
