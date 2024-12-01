/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package charityapp;

//import java.io.Serializable;

/**
 *
 * @author Bogdan Postolachi
 */
public class Donations {
    private double dAmount;
    private String name;
    private String dob;
    private String message;

    public Donations() {
        name = "";
        dob = "";
        message = "";
        this.dAmount = 0.0;
    }

    public Donations(double dAmount, String name, String dob, String message) {
        this.name = name;
        this.dob = dob;
        this.message = message;
        this.dAmount = dAmount;
    }

    
    
    public double getDonationAmount() {
        return dAmount;
    }

    public void setDonationAmount(double amount) {
        this.dAmount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
    
    public void addDonation(double amount) {
        this.dAmount += amount;
    }

    @Override
    public String toString() {
        return "Donation Amount: " + dAmount;
    }
    
    
    
}

