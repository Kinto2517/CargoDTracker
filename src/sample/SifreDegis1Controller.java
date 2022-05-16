package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;

public class SifreDegis1Controller {

    @FXML
    private Button degisDon;
    @FXML
    private TextField sifredegisKullanici;
    @FXML
    private PasswordField sifredegisSifre;
    @FXML
    private Label lblDegis;
    @FXML
    private PasswordField sifredegisTekrarSifre;
    @FXML
    private Button btnSifreDegis;
    @FXML
    private Button btnSifreCik;


    public void degisCikisOnAction(ActionEvent event) {
        Stage stage = (Stage) btnSifreCik.getScene().getWindow();
        stage.close();
    }

    public void degisDonOnAction(ActionEvent event) throws IOException {
        Parent degisSayfa = FXMLLoader.load(getClass().getResource("mainGui.fxml"));
        Scene sifreDegisScene = new Scene(degisSayfa);
        Stage sifreDegisStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        sifreDegisStage.setScene(sifreDegisScene);
        sifreDegisStage.show();
    }

    public void degisOnAction(ActionEvent event) {
        GoogleCloudDB con = new GoogleCloudDB();
        Connection dbCon = con.getConnection();

        if (sifredegisSifre.getText().equals(sifredegisTekrarSifre.getText())) {

            String queryU = "Update cargoUsers set sifre = '" + sifredegisSifre.getText() + "' where kullanici = \"" + sifredegisKullanici.getText() + "\"";
            lblDegis.setText("Degisim Basarili");
            try{
                Statement statement = dbCon.createStatement();
                statement.executeUpdate(queryU);
            }catch (Exception e){
                e.printStackTrace();
                e.getCause();
            }
        } else lblDegis.setText("Sifreler Eslesmiyor!");
    }

}
