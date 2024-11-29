/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package charityapp;

/**
 *
 * @author bogda
 */
import java.util.ArrayList;
import java.util.List;

public class DonationHistory {
    private List<Double> donationHistory;

    public DonationHistory() {
        this.donationHistory = new ArrayList<>();
    }

    public void addDonationEntry(double amount) {
        donationHistory.add(amount);
    }

    public void displayHistory() {
        System.out.println("\n=== Donation History ===");
        if (donationHistory.isEmpty()) {
            System.out.println("No donations made yet.");
        } else {
            for (int i = 0; i < donationHistory.size(); i++) {
                System.out.println("Donation " + (i + 1) + ": " + donationHistory.get(i));
            }
        }
    }

    StringBuilder getHistory() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

