/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package charityapp;

/**
 *
 * @author edvin
 */
public class Charity {
    //data type
    private String email;
    private String password;
    
    public Charity(){
        email = new String();
        password = new String();
    }
    
    //overloaded constructor
    public Charity(String email, String password){
        this.email = email;
        this.password = password;
    }

    //Getter and Setters method
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
}
