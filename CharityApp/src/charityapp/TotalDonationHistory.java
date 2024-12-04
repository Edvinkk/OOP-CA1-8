/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package charityapp;

/**
 *
 * @author Bogdan Postolachi
 */


import java.util.ArrayList;

public class TotalDonationHistory {
    private ArrayList<Donations> allDonations;  // List of all Donations objects (one per user)

    public TotalDonationHistory() {
        allDonations = new ArrayList<>();
    }

    // Add a new user's donation
    public void addDonation(String userName, String password, double amount, String dob, String message) {
        // Check if the user already exists
        for (Donations donation : allDonations) {
            if (donation.getUserName().equalsIgnoreCase(userName)) {
                donation.addDonation(amount);  // Update existing user's donation
                return;
            }
        }

        // Add a new user with their first donation
        Donations newDonation = new Donations(userName, password, amount, dob, message);
        allDonations.add(newDonation);
    }

    // Display all donations from all users
    public String displayTotalDonations() {
        if (allDonations.isEmpty()) {
            return "No donations have been made.";
        }

        StringBuilder sb = new StringBuilder("Total Donations:\n");
        for (Donations donation : allDonations) {
            sb.append(donation.getDetails()).append("\n");
        }
        return sb.toString();
    }

    // Calculate the total of all donations
    public double calculatedTotal() {
        double total = 0;
        for (Donations donation : allDonations) {
            for (Double amount : donation.getDonationAmounts()) {
                total += amount;
            }
        }
        return total;
    }

    Object getAllDonations() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Donations getUserDonation(String userName) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

