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
public class Donations extends Charity{
    private ArrayList<Double> donationAmounts;
    private double dAmount;
    //private String name;
    private String dob;
    private String message;
    
    

    public Donations() {
        super();
        donationAmounts = new ArrayList<>();
        //name = "";
        dob = "";
        message = "";
        dAmount = 0.0;
    }

    
    
    public Donations(String userName, String password, double dAmount, String dob, String message) {
        //this.name = name;
        super(userName, password);
        this.dob = dob;
        this.message = message;
        this.dAmount = dAmount;
    }

    public void addDonation(double amount) {
          dAmount = amount;
        donationAmounts.add(amount);
    }
    
    
      public ArrayList<Double> getDonationAmounts() {
        return donationAmounts;
    }

      

        public double getdAmount() {
            return dAmount;
        }

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
        
        
        
        //@Override
        public String getDetails() {
            return "User: " + userName + ", DOB: " + dob + "Message:" + message + "Your Donation Was: $" + dAmount;
        }
}
    
    /*public double getDonationAmount() {
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
    }*/
    
    
    
    /*public void addDonation(double amount) {
        this.dAmount = amount;
    }*/

    /*@Override
    public String toString() {
        return "Donation Amount: " + dAmount;
    }*/
    
    
    
//}

