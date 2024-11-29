/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package charityapp;

import java.util.ArrayList;

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
    private ArrayList<String> history;
    
    //default constructor
    public RaffleGame(){
        number = 0;
        userNumber = 0;
        entryNum = (int)(Math.random()*20)+1;
        result = new String();
        history = new ArrayList<>();
    }

    public RaffleGame(String email, String password, int number, int userNumber, int entryNum, String result, ArrayList<String> history) {
        super(email, password);
        this.number = number;
        this.userNumber = userNumber;
        this.entryNum = entryNum;
        this.result = result;
        this.history = history;
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
    
    
    public void computeRaffle(){
        Charity c = new Charity();
        if(number == 0){
            this.number = (int)(Math.random()*entryNum)+1;
        }
        
        if(userNumber== number){
            result= "Congratulations! "+c.getUserName()+"Your number " + userNumber + " has been picked!";
        }
        else{
            result = "Unfortunately, "+c.getUserName()+" your number: "+userNumber+" did not get picked, the raffle winner is: "+number;
        }
        
        //Reset number every raffle entry
        this.number = (int)(Math.random()*entryNum)+1;
        
        //Store result in the history
        history.add(result);
    }
    
    public ArrayList<String> getHistory(){
        //return ArrayList history that stores the results for all the raffle
        return history;
    }
    
}
