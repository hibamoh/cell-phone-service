package com.pluralsight;

public class CellPhone {
    private int serialNumber ;
    private String model;
    private String carrier;
    private String phoneNumber;
    private  String ownerName;

    public CellPhone(){

    }

    public CellPhone(int serialNumber, String model, String carrier, String phoneNumber, String ownerName) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.ownerName = ownerName;
    }

    public int getSerialNumber() {

        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {

        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
