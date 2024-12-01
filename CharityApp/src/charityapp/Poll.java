/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package charityapp;

import java.util.ArrayList;

/**
 *
 * @author edvin
 */
public class Poll {
    //array list to store polls
    private ArrayList<String> polls; 
    
    //construcotr to initialize 3 polls 
    public Poll(){
        polls = new ArrayList<>();
        polls.add("Education Funding in Syria");
        polls.add("Medical Aid in Syria");
        polls.add("Clean Water Funding in syria");
    }
    
    public ArrayList<String> getPolls(){
        return polls;
    }
}
