/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package charityapp;

/**
 *
 * @author Bogdan Postolachi
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TotalDonationHistory {
    private ArrayList<String> users;
    private ArrayList<Double> donations;

    public TotalDonationHistory() {
        this.users = new ArrayList<>();
        this.donations = new ArrayList<>();
    }

    public void addDonation(String userName, double amount) {
        int index = users.indexOf(userName);
        if (index == -1) { // New user
            users.add(userName);
            donations.add(amount);
        } else { // Existing user
            donations.set(index, donations.get(index) + amount);
        }
        updateTotalDonationFile();
    }

    public void updateTotalDonationFile() {
        File file = new File("totalDonations.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, false))) {
            for (int i = 0; i < users.size(); i++) {
                writer.write("User: " + users.get(i) + ", Total Donations: €" + donations.get(i));
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing to total donations file: " + e.getMessage());
        }
    }

    public String displayTotalDonations() {
        StringBuilder sb = new StringBuilder("Total Donations");
        for (int i = 0; i < users.size(); i++) {
            sb.append("User: ").append(users.get(i))
              .append(", Total Donations: €").append(donations.get(i)).append("\n");
        }
        return sb.toString();
    }
}
