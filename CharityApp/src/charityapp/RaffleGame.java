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
    private int number;//winning number
    private int userNumber;//the number entered by user
    private int entryNum;//range for random numbers
    private boolean result;//stores the result
    private ArrayList<RaffleResult> history;//list to store the history of raffle results
    
    //default constructor
    public RaffleGame(){
        super();//call the parent class constructor
        number = 0;
        userNumber = 0;
        entryNum = (int)(Math.random()*20)+1;//Generate numbers between 1-20
        result = false;
        history = new ArrayList<>();//initialize history
    }

    //Overloaded Constructor that initialise all variables and the inherited ones as well
    public RaffleGame(String userName, String password, int number, int userNumber, int entryNum, boolean result, ArrayList<RaffleResult> history) {
        super(userName, password);//call the parent class constructor
        this.number = number;
        this.userNumber = userNumber;
        this.entryNum = entryNum;
        this.result = result;
        this.history = history;
    }

    //Getters and Setters for accessing and update of the variables
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

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }
    
    //ComputeRaffle method
    public void computeRaffle(){
        //Charity c = new Charity();
        
        //If the winning number hasn't been set, generate one
        if(number == 0){
            this.number = (int)(Math.random()*entryNum)+1;
        }
        
        //Create Object RaffleResult
        RaffleResult myR = new RaffleResult();
        
        myR.setUserNumber(userNumber);//Store the raffle number
        myR.setResult(userNumber == number);//check if it matches with the winning number
        
        //Use variable Username from the Charity parent class
        /*if(userName.isEmpty()){
            myR.setName("Damien");
        }
        else {
            myR.setName(userName);
        }*/
        
        //determine the result of the raffle
        if(userNumber== number){
            result =true; 
            myR.getUserNumber();
            myR.isResult();
        }
        else{
            result = false;
            myR.getUserNumber();
            myR.isResult();
        }
        
        //Reset number every raffle entry
        this.number = (int)(Math.random()*entryNum)+1;
        
        //Store result in the history
        history.add(myR);
    }
    
    public ArrayList<RaffleResult> getHistory(){
        //return ArrayList history that stores the results for all the raffle
        return history;
    }
    
}
