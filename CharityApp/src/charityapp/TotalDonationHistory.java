/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package charityapp;

/**
 *
 * @author bogda
 */
import java.util.HashMap;
import java.util.Map;

public class TotalDonationHistory {
    private Map<String, Double> totalDonations;

    public TotalDonationHistory() {
        this.totalDonations = new HashMap<>();
    }

    public void addDonation(String userName, double amount) {
        totalDonations.put(userName, totalDonations.getOrDefault(userName, 0.0) + amount);
    }

    public String displayTotalDonations() {
        StringBuilder sb = new StringBuilder("=== Total Donations ===\n");
        if (totalDonations.isEmpty()) {
            sb.append("No donations have been made.\n");
        } else {
            for (Map.Entry<String, Double> entry : totalDonations.entrySet()) {
                sb.append("User: ").append(entry.getKey())
                  .append(", Total Donations: ").append(entry.getValue()).append("\n");
            }
        }
        return sb.toString();
    }
}

