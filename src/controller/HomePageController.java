package controller;

import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import model.Building;
import model.Room;

public class HomePageController implements Initializable {

    @FXML
    private Button searchButton;

    @FXML
    private TextField searchField;

    public static Building data;
    public static Room room;

    /************************* Handlers ************************/

    @FXML
    void handleEnterPressed(KeyEvent event) {
    	if(event.getCode() == KeyCode.ENTER) {
    		ActionEvent search = new ActionEvent();
    		handleButtonPress(search);
    	}
    }

    @FXML
    void handleButtonPress(ActionEvent event) {
    	String usrInput = searchField.getText();
		room = data.findRoom( usrInput );
    	//see if they typed anything
    	if( room == null ) {
			// TODO: Write to app home page: No room found
            //errorbox.setText("Can not find the room");
		}
		changeScene("/view/" + room.getBuildingCode() + "Floor" + room.getFloorNum() + "FXML.fxml");
    }
    
    private void changeScene(String filePath) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource(filePath));
            AnchorPane ancPane = loader.load();
            Scene scene = new Scene(ancPane,800,800);
            Main.stage.setScene(scene);
            Main.stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    //@Override
    public void handle(ActionEvent actionEvent) {
    	
    }
    
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    	try {
    		this.data = new Building("SU", "Student Union", 60, 2);
		} catch (IOException e) {
    		e.printStackTrace( );
		}
    }
}
