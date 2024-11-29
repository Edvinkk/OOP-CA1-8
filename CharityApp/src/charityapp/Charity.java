/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package charityapp;

import java.io.Serializable;

/**
 *
 * @author edvin
 */
public class Charity implements Serializable{
    //data type
    protected String userName;
    protected String password;
    
    public Charity(){
        userName = new String();
        password = new String();
    }
    
    //overloaded constructor
    public Charity(String userName, String password){
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
    
   
    
}
