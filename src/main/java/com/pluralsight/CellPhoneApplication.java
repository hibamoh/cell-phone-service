package com.pluralsight;
import java.util.Scanner;
public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        CellPhone myPhone;
        myPhone = new CellPhone();

        System.out.println("what is the phone serial number? : ");
        String userSerialNumber = myScanner.nextLine();

        int serialNumber = Integer.parseInt(userSerialNumber);
        myPhone.setSerialNumber(serialNumber);

        System.out.println("what is the model of your? ");
        String userModel = myScanner.nextLine();

        myPhone.setModel(userModel);

        System.out.println("what is your phone carrier? ");
        String userPhoneCarrier = myScanner.nextLine();

        myPhone.setCarrier(userPhoneCarrier);

        System.out.println("whats your number (wink) ?");
        String userNumber = myScanner.nextLine();

        myPhone.setPhoneNumber(userNumber);

        System.out.println("what is your name? ");
        String userName = myScanner.nextLine();

        myPhone.setOwnerName(userName);

        System.out.println("Owner Name: " + myPhone.getOwnerName());
        System.out.println("Serial Number: " + myPhone.getSerialNumber());
        System.out.println("Model: " + myPhone.getModel());
        System.out.println("Phone Carrier: " + myPhone.getCarrier());
        System.out.println("Phone Number: " + myPhone.getPhoneNumber());





    }
}
