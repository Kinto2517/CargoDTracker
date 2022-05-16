package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class Page3 implements Initializable {


    @FXML
    private Button btndgs;

    @FXML
    private Button btnekle;

    @FXML
    private Button btnsil;

    @FXML
    private TextField dgsID;

    @FXML
    private TextField dgsStatus;

    @FXML
    private TextField ekleID;

    @FXML
    private TextField silID;

    @FXML
    private Label a;
    @FXML
    private Label b;
    @FXML
    private Label c;

    @FXML
    void btnekleOnAction(ActionEvent event) {
        GoogleCloudDB baglan = new GoogleCloudDB();

        Connection baglanDB = baglan.getConnection();

        String cargoLocation = ekleID.getText();

        String girisKisim = "INSERT INTO Mastermind.cargoStatus(cargoLocation) VALUES ('";
        String degerKisim = cargoLocation + "')";

        String kayitSon = girisKisim + degerKisim;


        try {
            Statement statement = baglanDB.createStatement();
            statement.executeUpdate(kayitSon);
            a.setText("Basariyla Eklendi");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    void btndgsOnAction(ActionEvent event) {

        //UPDATE Mastermind.cargoStatus SET cargoStatus = 'Teslim Edildi' where cargoID=1;
        GoogleCloudDB baglan = new GoogleCloudDB();
        Connection baglanDB = baglan.getConnection();
        String cargoID = dgsID.getText();
        String cargoStatus = dgsStatus.getText();
        String sq = "UPDATE Mastermind.cargoStatus SET cargoStatus= '" + cargoStatus + "' where cargoID = " + cargoID;

        try {
            Statement statement = baglanDB.createStatement();
            statement.executeUpdate(sq);
            b.setText("Basariyla Degisti");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    void btnsilOnAction(ActionEvent event) {
        GoogleCloudDB baglan = new GoogleCloudDB();

        Connection baglanDB = baglan.getConnection();

        String cargoID = silID.getText();
        //DELETE FROM Mastermind.cargoStatus where cargoID =null;
        String sq = "DELETE FROM Mastermind.cargoStatus where cargoID = " + cargoID;

        try {
            Statement statement = baglanDB.createStatement();
            statement.executeUpdate(sq);
            c.setText("Basari Ile Silindi");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
