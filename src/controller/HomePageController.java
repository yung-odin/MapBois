package controller;

import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import model.Building;
import model.Campus;
import model.Room;

public class HomePageController implements Initializable {

    @FXML
    private Button searchButton;

    @FXML
    private TextField searchField;

    @FXML
    public Label errorTxt;

    public static Campus campus;
    public static Building data;
    public static Room room;

    /************************* Handlers ************************/
    /*
     * Handles action when the key "Enter" is pressed, con-
     * ducting a search for the given room number
     * 
     */
    @FXML
    void handleEnterPressed(KeyEvent event) {
    	if(event.getCode() == KeyCode.ENTER) {
    		ActionEvent search = new ActionEvent();
    		handleButtonPress(search);
    	}
    }
    /*
     * Handles search for specified room asked to be found
     *  	-when room is non-existent or not apart of the directory,
     *  		prints out a error, allowing the user to enter another room
     */
    @FXML
    void handleButtonPress(ActionEvent event)
    {
        String rawUsrInput = searchField.getText( );
        String pattern = "([a-zA-Z]{2,3})(\\S+)";
        String usrInput= rawUsrInput.replaceAll(pattern, "$1" + " " + "$2");
        String[] values = usrInput.split(" ");

        data = campus.findBuilding( values[0] );
        room = data.findRoom( values[1] );
        //see if they typed anything
        if ( room == null ) {
            errorTxt.setText( "Room does not exist" );
        }
        if ( data == null) {
            errorTxt.setText( "Building does not exist" );
        }
		changeScene("/view/" + room.getBuildingCode() + "Floor" + room.getFloorNum() + "FXML.fxml");
    }
    
    /*
     * Changes scene based on user input and if action is true
     */
    
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

/*
 * (non-Javadoc)
 * @see javafx.fxml.Initializable#initialize(java.net.URL, java.util.ResourceBundle)
 */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        campus = new Campus("University of Texas at San Antonio","UTSA");
    }
}
