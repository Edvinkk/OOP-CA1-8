/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package charityapp;

/**
 *
 * @author damie
 */
public class RaffleGame extends Charity{
    //declare data types
    private int number;
    private int userNumber;
    private int entryNum;
    private String result;
    
    //default constructor
    public RaffleGame(){
        number = 0;
        userNumber = 0;
        entryNum = 0;
        result = new String();
    }

    public RaffleGame(int number, int userNumber, int entryNum, String result, String email, String password) {
        super(email, password);
        this.number = number;
        this.userNumber = userNumber;
        this.entryNum = entryNum;
        this.result = result;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }

    public int getEntryNum() {
        return entryNum;
    }

    public void setEntryNum(int entryNum) {
        this.entryNum = entryNum;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    
    
    public void computeEverything(){
        Charity c = new Charity();
        if(number == 0){
            this.number = (int)(Math.random()*entryNum)+1;
        }
        
        if(userNumber== number){
            result= "Congratulations! "+c.getUserName()+"Your number " + userNumber + " has been picked!";
        }
        else{
            result = "Unfortunately, you did not win this time, but every ticket purchased supports a great cause. Don’t give up, your next chance might be just around the corner!";
        }
    }
    
}
