package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class page1 implements Initializable {

    @FXML
    private TableView<page1Tables> tableView;
    @FXML
    private TableColumn<page1Tables, String> col1;
    @FXML
    private TableColumn<page1Tables, String> col2;
    @FXML
    private TableColumn<page1Tables, String> col3;
    @FXML
    private TableColumn<page1Tables, String> col4;

    ObservableList<page1Tables> oblist = FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        GoogleCloudDB bag = new GoogleCloudDB();
        Connection veritabanibaglan = bag.getConnection();

        String connectQuery = "SELECT * FROM cargoStatus";
        try {
            Statement statement = veritabanibaglan.createStatement();
            ResultSet queryO = statement.executeQuery(connectQuery);
            while (queryO.next()) {
                oblist.add(new page1Tables(queryO.getString("cargoID"),queryO.getString("cargoLocation"),queryO.getString("cargoStatus"),queryO.getString("clientID")));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }


        col1.setCellValueFactory(new PropertyValueFactory<>("cargoID"));
        col2.setCellValueFactory(new PropertyValueFactory<>("cargoLocation"));
        col3.setCellValueFactory(new PropertyValueFactory<>("cargoStatus"));
        col4.setCellValueFactory(new PropertyValueFactory<>("clientID"));

        tableView.setItems(oblist);


    }
}
