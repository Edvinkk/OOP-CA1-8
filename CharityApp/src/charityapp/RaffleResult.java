/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package charityapp;

/**
 *
 * @author damie
 */
public class RaffleResult extends Charity{
    //declare data types
    private String name;
    private int userNumber;
    private boolean result;

    //default constructor
    public RaffleResult() {
        name = new String();
        userNumber = 0;
        result = false;
    }

    //Overloaded constructor
    public RaffleResult(String userName, String password, String name, int userNumber, boolean result) {
        super(userName, password);
        this.name = name;
        this.userNumber = userNumber;
        this.result = result;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }
   
}
