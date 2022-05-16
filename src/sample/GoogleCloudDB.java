package sample;
import java.sql.*;

public class GoogleCloudDB {

    public Connection veritabaniLink;
    public Connection getConnection(){
        String veritabani_Ad="Mastermind";
        String veritabaniKullanici="root";
        String veritabani_parola="1234";
        String url= "jdbc:mysql://34.65.137.3:3306/"+veritabani_Ad;
        try{


            Class.forName("com.mysql.cj.jdbc.Driver");
            veritabaniLink= DriverManager.getConnection(url,veritabaniKullanici,veritabani_parola);
            System.out.println("Baglandi");

        }catch (Exception e){
            System.out.printf("Baglanti Kötü");
            e.printStackTrace();
            e.getCause();

        }
        return veritabaniLink;
    }

}
