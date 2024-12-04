/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package charityapp;

/**
 *
 * @author Bogdan Postolachi
 */
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
import java.util.ArrayList;
//import java.util.List;

public class DonationHistory {
    private ArrayList<String> donationHistory;

    public DonationHistory() {
        this.donationHistory = new ArrayList<>();
    }

    public void addDonationEntry(String newRecord) {
        donationHistory.add(newRecord);
        //updateDonationFile();
    }
    
    
      /*public void updateDonationFile() {
        File file = new File("donationHistory.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, false))) {
            for (double donation : donationHistory) {
                writer.write("Donation: €" + donation);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing to donation file: " + e.getMessage());
        }
    }

    public void displayHistory() {
        System.out.println("Donation History");
        if (donationHistory.isEmpty()) {
            System.out.println("No donations made yet.");
        } else {
            for (int i = 0; i < donationHistory.size(); i++) {
                System.out.println("Donation " + (i + 1) + ": " + donationHistory.get(i));
            }
        }
    }

   public StringBuilder getHistory() {
        StringBuilder history = new StringBuilder();
        for (double donation : donationHistory) {
            history.append("Donation: €").append(donation).append("\n");
        }
        return history;
    }*/
    
    
     public ArrayList<String> getHistory() {
        return donationHistory;
    }

    public String displayHistory() {
        if (donationHistory.isEmpty()) {
            return "No donation history available.";
        }
        StringBuilder sb = new StringBuilder("Donation History:\n");
        for (String newRecord : donationHistory) {
            sb.append(newRecord).append("\n");
        }
        return sb.toString();
    }
}

