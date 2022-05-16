package sample;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Logger;

public class MainGuiController implements Initializable {
    @FXML
    private Label exit;

    @FXML
    private JFXButton btnpage1;

    @FXML
    private JFXButton btnpage2;

    @FXML
    private JFXButton btnpage3;

    @FXML
    private JFXButton btnpage4;

    @FXML
    private StackPane icerikAlan;


    @FXML
    void btnpage1OnAction(ActionEvent event) throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("page1.fxml"));
        icerikAlan.getChildren().removeAll();
        icerikAlan.getChildren().setAll(fxml);
    }

    @FXML
    void btnpage2OnAction(ActionEvent event) throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("page2.fxml"));
        icerikAlan.getChildren().removeAll();
        icerikAlan.getChildren().setAll(fxml);
    }

    @FXML
    void btnpage3OnAction(ActionEvent event) throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("page3.fxml"));
        icerikAlan.getChildren().removeAll();
        icerikAlan.getChildren().setAll(fxml);
    }


    @FXML
    void btnpage4OnAction(ActionEvent event) throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("page4.fxml"));
        icerikAlan.getChildren().removeAll();
        icerikAlan.getChildren().setAll(fxml);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        exit.setOnMouseClicked(mouseEvent -> {
            System.exit(0);
        });

        try{
            Parent fxml = FXMLLoader.load(getClass().getResource("page1.fxml"));
            icerikAlan.getChildren().removeAll();
            icerikAlan.getChildren().setAll(fxml);

        } catch (IOException e) {
            e.printStackTrace();
            e.getCause();
        }
    }

}
