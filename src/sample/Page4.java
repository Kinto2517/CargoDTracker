package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.w3c.dom.Text;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Page4 {

    @FXML
    private StackPane icerikAlan;

    @FXML
    private Hyperlink userSifre;


    @FXML
    void userSifreOnAction(ActionEvent event) throws IOException {
        Parent degisSayfa = FXMLLoader.load(getClass().getResource("sifreDegis1.fxml"));
        Scene sifreDegisScene = new Scene(degisSayfa);
        Stage sifreDegisStage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        sifreDegisStage.setScene(sifreDegisScene);
        sifreDegisStage.show();
    }


}
