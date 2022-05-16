package sample;

public class page1Tables {

    String cargoID, cargoLocation, cargoStatus,clientID;

    public page1Tables(String id, String location, String status, String clientID) {
        this.cargoID = id;
        this.cargoLocation = location;
        this.cargoStatus = status;
        this.clientID = clientID;
    }

    public String getCargoID() {
        return cargoID;
    }

    public void setCargoID(String cargoID) {
        this.cargoID = cargoID;
    }

    public String getCargoLocation() {
        return cargoLocation;
    }

    public void setCargoLocation(String cargoLocation) {
        this.cargoLocation = cargoLocation;
    }

    public String getCargoStatus() {
        return cargoStatus;
    }

    public void setCargoStatus(String cargoStatus) {
        this.cargoStatus = cargoStatus;
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }
}
