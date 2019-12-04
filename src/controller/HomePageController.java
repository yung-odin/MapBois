package controller;

import javafx.fxml.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.scene.layout.AnchorPane;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
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
    	String roomSearch = searchField.getText();
    	//see if they typed anything
    	if(roomSearch == "")
    		return;
    	//see what they are searching for
    	
    	changeScene("/view/SUFloor1FXML.fxml");
    }
    
    void changeScene(String filePath)
    {

    	try{
    		FXMLLoader loader = new FXMLLoader();
    		loader.setLocation(Main.class.getResource(filePath));
    		AnchorPane ancPane = loader.load();
    		Scene scene = new Scene(ancPane,800,800);
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
    
    //@Override
    public void handle(ActionEvent actionEvent)
    {
    	
    }
    
    //@Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
    	
    }
}
