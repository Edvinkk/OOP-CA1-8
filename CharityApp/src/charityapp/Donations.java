/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package charityapp;

//import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Bogdan Postolachi
 */



//Donations is a subclass of Charity
public class Donations extends Charity {

    //defined variables
    //ArrayList used for collection that can grow or shrink in size
    private ArrayList<Double> donationAmounts; //stores a collection of donation amounts made by a user
    private double dAmount;
    private String name;
    private String dob;
    private String message;

    
    
    
    //default constructor
    //used for initializing objects
    public Donations() {
        super();
        /*super keyword refers to superclass parent objects (https://www.w3schools.com/java/ref_keyword_super.asp)*/
        donationAmounts = new ArrayList<>(); //stores history of donation amounts for this user
        name = "";
        dob = ""; //initializes dob
        message = ""; //initializes message
        dAmount = 0.0; //initializes dAmount
    }

    
    
    
    //overloaded constructor
    public Donations(String userName, String password,String name, double dAmount, String dob, String message) {
        super(userName, password); //call for superclass constructor
        this.name = name;
        //this.donationAmounts = donationAmounts;
        this.dob = dob;
        this.message = message;
        this.dAmount = dAmount;
    }

    
    
    
    //Code from ToDoApp from lecture used:
    /*public void addTask(String task) {
        tasks.add(task);
    })*/
    //responsible for adding a new donation to the user's donation history and updating the dAmount field
    public void addDonation(double amount) {
        dAmount = amount; //dAmount field stores most recent donation amount
        donationAmounts.add(amount); // ArrayList that stores all the donations made by the user
    }

    
    
    //Getter and Setter Methods
    
   //method returns the donationAmounts field
    public ArrayList<Double> getDonationAmounts() {
        return donationAmounts;
    }
    
    //method returns the value of the dAmount field
    public double getdAmount() {
        return dAmount;
    }

    // allows controlled modification of the private dAmount field
    public void setdAmount(double dAmount) {
        this.dAmount = dAmount;
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

    
   
     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    //custom instance method
    //example from EmployeeApp from lecture used:
    /*@Override
    public String toString() {
        return "Name: " + name + ", Employee ID: " + id + ", Salary: " + salary;
    }
    */
    
    
    //custom instance method
    //generates formatted string containing details about the user and their most recent donation
    //@Override
    public String getDetails() {   //method returns a String
        return "User: " + userName + "Name:" + name +", DOB: " + dob + "Message:" + message + "Your Donation Was: €" + dAmount;
    }

   
}