package controller;

import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;

public class SUFloor2Controller implements Initializable, EventHandler<ActionEvent> {
    @FXML
    private Circle destCirc;

    public void moveCirc(int x, int y) {
        destCirc.setLayoutX(x);
        destCirc.setLayoutY(y);
    }

    @Override
    public void handle(ActionEvent actionEvent)
    {
        changeScene("/view/HomePageFXML.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        moveCirc();
    }

    private void moveCirc() {
        destCirc.setLayoutX(HomePageController.room.getCoorX());
        destCirc.setLayoutY(HomePageController.room.getCoorY());
    }

    private void changeScene(String filePath) {
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
