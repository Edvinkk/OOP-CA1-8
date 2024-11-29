/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package charityapp;

//import java.io.Serializable;

/**
 *
 * @author bogda
 */
public class Donations {
    private double dAmount;

    public Donations() {
        this.dAmount = 0.0;
    }

    public Donations(double amount) {
        this.dAmount = amount;
    }

    public double getDonationAmount() {
        return dAmount;
    }

    public void setDonationAmount(double amount) {
        this.dAmount = amount;
    }

    public void addDonation(double amount) {
        this.dAmount += amount;
    }

    @Override
    public String toString() {
        return "Donation Amount: " + dAmount;
    }
}

