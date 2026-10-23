package com.pluralsight;
import java.util.Scanner;
public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        CellPhone myPhone;
        myPhone = new CellPhone();

        System.out.println("what is the phone serial number? : ");
        int userSerialNumber = myScanner.nextInt();

        myPhone.setSerialNumber(userSerialNumber);

        System.out.println("what is the model of your? ");
        String userModel = myScanner.nextLine();

        myPhone.setModel(userModel);

        System.out.println("what is your phone carrier? ");
        String





    }
}
