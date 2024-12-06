/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package charityapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author damie
 */
public class Charity implements Serializable {

    //declare data types
    protected String userName;
    protected String password;

    //default constructor
    public Charity() {
        userName = new String();
        password = new String();
    }

    //overloaded constructor
    public Charity(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    //Getter and Setters method
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /*
    * author @edvin
    */
    
    
    //save the list of users to a file
    public static void saveUsers(ArrayList<Charity> users) {
        File f;
        FileOutputStream fStream;
        ObjectOutputStream oStream;

        try {
            // Create or open a file to store the users
            f = new File("users.dat");
            fStream = new FileOutputStream(f);
            oStream = new ObjectOutputStream(fStream);

            // Serialize and save the list of users to the file
            oStream.writeObject(users);

            // Close the streams after saving
            oStream.close();
        } catch (IOException e) {
            // Handle any errors during the file saving process
            System.out.println("Error saving users: " + e.getMessage());
        }
    }

    //load the list of users from the file
    public static ArrayList<Charity> loadUsers() {
        File f;
        FileInputStream fStream;
        ObjectInputStream oStream;
        
        //Initialize the list for users
        ArrayList<Charity> users = new ArrayList<>(); 

        try {
            //Checks if the file exists before attempting to load data
            f = new File("users.dat");

            if (f.exists()) {
                fStream = new FileInputStream(f);
                oStream = new ObjectInputStream(fStream);

                //Deserialize and load the list of users from the file
                users = (ArrayList<Charity>) oStream.readObject();

                
                oStream.close();
            }
            //error handeling
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading users: " + e.getMessage());
        }

        // Return the list of users, empty if not found
        return users;
    }

    //check if username already exists
    public static boolean usernameExists(String username, ArrayList<Charity> users) {
        //iterates through each Charity object in the users list to check if the username already exists
        for (Charity user : users) {
            if (user.getUserName().equals(username)) {
                //returns true if username does exist
                return true; 
            }
        }
        //returns false if username doesnt exist
        return false; 
    }
    //validates the login
    public static boolean validateLogin(String username, String password, ArrayList<Charity> users) {
        //iterates through each Charity object in the users list to check if the username and password match
        for (Charity user : users) {
            if (user.getUserName().equals(username) && user.getPassword().equals(password)) {
                //returns true if login was succesful 
                return true; 
            }
        }
        //returns false if login failed
        return false; 
    }
}
