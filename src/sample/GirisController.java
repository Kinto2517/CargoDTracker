package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.w3c.dom.events.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.Timer;

public class GirisController implements Initializable {

    @FXML
    private TextField kullanici_giris;

    @FXML
    private PasswordField sifre_giris;

    @FXML
    private Button btnGiris;

    @FXML
    private Button btnGirisCik;

    @FXML
    private Button forgotP;

    @FXML
    private TextField adsoyad_sign;

    @FXML
    private Button btnkayitOl;

    @FXML
    private PasswordField sifre_sign;
    @FXML
    private PasswordField sifreTekrar_sign;

    @FXML
    private Button btnCikis;

    @FXML
    private TextField kullanici_sign;

    @FXML
    private Label lblGiris;

    @FXML
    private Label lblTekrar;

    @FXML
    private Label lblKayit;


    double x,y;

    public void anaCikisOnAction(ActionEvent event) {
        Stage stage = (Stage) btnGirisCik.getScene().getWindow();
        stage.close();
    }

    public void forgotPonAction(ActionEvent event) throws IOException {
       Parent degisSayfa = FXMLLoader.load(getClass().getResource("sifreDegis.fxml"));
       Scene sifreDegisScene = new Scene(degisSayfa);
       Stage sifreDegisStage = (Stage) ((Node)event.getSource()).getScene().getWindow();

       sifreDegisStage.setScene(sifreDegisScene);
       sifreDegisStage.show();

    }



    public void kayitCikisOnAction(ActionEvent event) {
        Stage stage = (Stage) btnCikis.getScene().getWindow();
        stage.close();
    }


    public void btnGirisOnAction(ActionEvent event) {

        if (kullanici_giris.getText().isBlank() == false && sifre_giris.getText().isBlank() == false) {
            GirisKontrol();

        } else {
            lblGiris.setText("Kullanıcı Adı ve Şifre Girin.");
        }

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    public void GirisKontrol() {
        GoogleCloudDB bag = new GoogleCloudDB();
        Connection veritabanibaglan = bag.getConnection();
        String girisDogrula = "SELECT count(1) FROM cargoUsers WHERE kullanici = '" + kullanici_giris.getText() + "'AND sifre= '" + sifre_giris.getText() + "'";



        try {
            Statement statement = veritabanibaglan.createStatement();

            ResultSet rs = statement.executeQuery(girisDogrula);

            while (rs.next()) {
                if (rs.getInt(1) == 1) {
                    lblGiris.setText("Basarili Giris");

                    Stage stage = (Stage) btnCikis.getScene().getWindow();
                    stage.close();

                    Stage guiStage = new Stage();
                    Parent root = FXMLLoader.load(getClass().getResource("mainGui.fxml"));
                    guiStage.initStyle(StageStyle.UNDECORATED);
                    root.setOnMousePressed(event -> {
                        x= event.getSceneX();
                        y = event.getSceneY();
                    });

                    root.setOnMouseDragged(event -> {
                        guiStage.setX(event.getScreenX() - x);
                        guiStage.setY(event.getScreenY()- y);
                    });
                    guiStage.setScene(new Scene(root, 1280, 800));
                    guiStage.show();

                  } else {
                    lblGiris.setText("Hatali Giris");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }



    public void btnKayitOnAction(ActionEvent event){
        if(sifre_sign.getText().equals(sifreTekrar_sign.getText())){
            cloudKayit();
            lblTekrar.setText("");
        }else{
            lblTekrar.setText("Sifreler eslesmiyor.");

        }
    }

    public void cloudKayit(){
        GoogleCloudDB baglan = new GoogleCloudDB();


        Connection baglanDB = baglan.getConnection();

        String adsoyad = adsoyad_sign.getText();
        String kullaniciAd = kullanici_sign.getText();
        String sifre = sifre_sign.getText();

        String girisKisim = "INSERT INTO cargoUsers(adSoyad, kullanici, sifre) VALUES ('";
        String degerKisim = adsoyad + "','"+ kullaniciAd + "','"+sifre+"')";

        String kayitQuery = girisKisim+degerKisim;

        try {
            Statement statement = baglanDB.createStatement();
            statement.executeUpdate(kayitQuery);
            lblKayit.setText("Basari ile kayit olundu.");


        }catch(Exception e){
            e.printStackTrace();
            e.getCause();
        }


    }

}