package controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class SUFloor1Controller implements Initializable, EventHandler<ActionEvent> {
	@FXML
	public Circle destCirc;

	@FXML
	public Label searchLable;

	@Override
	public void handle(ActionEvent actionEvent) {
		changeScene("/view/HomePageFXML.fxml");
	}

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle)
	{
		searchLable.setText( HomePageController.room.getBuildingCode() + " " + HomePageController.room.getRoomNum() );
		moveCirc();
	}

	private void moveCirc() {
		//searchLable.setText( HomePageController.room.getBuildingCode() + HomePageController.room.getRoomNum() );
		destCirc.setLayoutX(HomePageController.room.getCoorX());
		destCirc.setLayoutY(HomePageController.room.getCoorY());
	}

	private void changeScene(String filePath)
	{

		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource(filePath));
			AnchorPane ancPane = loader.load();
			Scene scene = new Scene(ancPane,800,800);
			Main.stage.setScene(scene);
			Main.stage.show();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
