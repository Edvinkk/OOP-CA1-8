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
/*import java.util.ArrayList;
//import java.util.List;

public class DonationHistory extends Charity{
    
    //declaried variable
    private ArrayList<String> donationHistory; //ArrayList that stores strings representing the donation history for a user

    //default constructor
    //this. used to refer to the instance variable
    public DonationHistory() {
        this.donationHistory = new ArrayList<>();
    }

    //Adds the newRecord string to the donationHistory list
    //Code from lectures used: 
    /*public void addEmployee(Employee employee) {
        employees.add(employee); 
    }*/
    /*public void addDonationEntry(String newRecord) {
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
    
    
    //provides access to the donationHistory list
    //code from ToDoApp in lectures used:
    /*public ArrayList<String> getTasks() {
        return tasks;
    }*/
     /*public ArrayList<String> getHistory() {
        return donationHistory;
    }

     //returnes formatted string representation of all the donation records stored in the donationHistory list
     //Code from ToDoApp used:
     /*public String displayTasks() {
        StringBuilder sb = new StringBuilder("Tasks:\n");
        for (String task : tasks) {
            sb.append(task).append("\n");
        }
        return sb.toString();
        }*/
   /* public String displayHistory() {
        if (donationHistory.isEmpty()) {
            return "No donation history available.";
        }
        StringBuilder sb = new StringBuilder("Donation History:\n");
        for (String newRecord : donationHistory) {
            sb.append(newRecord).append("\n");
        }
        return sb.toString();
    }
}*/

