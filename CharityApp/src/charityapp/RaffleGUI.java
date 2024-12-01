/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package charityapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author damie
 */
public class RaffleGUI extends javax.swing.JFrame {
    private RaffleGame raffleG;
    /**
     * Creates new form RaflleGUI
     */
    public RaffleGUI() {
        initComponents();
        raffleG = new RaffleGame();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        raffleLbl = new javax.swing.JLabel();
        charityBtn = new javax.swing.JButton();
        donationBtn = new javax.swing.JButton();
        pollBtn = new javax.swing.JButton();
        iconLbl = new javax.swing.JLabel();
        entryLbl = new javax.swing.JLabel();
        entryTf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        historyTa = new javax.swing.JTextArea();
        historyLbl = new javax.swing.JLabel();
        clearBtn = new javax.swing.JButton();
        titleLbl = new javax.swing.JLabel();
        showBtn = new javax.swing.JButton();
        playBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        loadBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 500));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setForeground(new java.awt.Color(153, 255, 102));

        raffleLbl.setBackground(new java.awt.Color(0, 0, 0));
        raffleLbl.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        raffleLbl.setForeground(new java.awt.Color(0, 255, 102));
        raffleLbl.setText("Raffle Page");

        charityBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        charityBtn.setForeground(new java.awt.Color(0, 255, 102));
        charityBtn.setText("Home");
        charityBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                charityBtnActionPerformed(evt);
            }
        });

        donationBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        donationBtn.setForeground(new java.awt.Color(0, 255, 102));
        donationBtn.setText("Donation");
        donationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donationBtnActionPerformed(evt);
            }
        });

        pollBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pollBtn.setForeground(new java.awt.Color(0, 255, 102));
        pollBtn.setText("Poll");
        pollBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pollBtnActionPerformed(evt);
            }
        });

        iconLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/charityapp/ticket.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(donationBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(charityBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pollBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(raffleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(raffleLbl)
                .addGap(18, 18, 18)
                .addComponent(iconLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(charityBtn)
                .addGap(54, 54, 54)
                .addComponent(donationBtn)
                .addGap(61, 61, 61)
                .addComponent(pollBtn)
                .addGap(59, 59, 59))
        );

        entryLbl.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        entryLbl.setForeground(new java.awt.Color(0, 255, 102));
        entryLbl.setText("Enter Number Entry:");

        historyTa.setColumns(20);
        historyTa.setRows(5);
        jScrollPane1.setViewportView(historyTa);

        historyLbl.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        historyLbl.setForeground(new java.awt.Color(0, 255, 102));
        historyLbl.setText("Raffle History");

        clearBtn.setBackground(new java.awt.Color(0, 51, 51));
        clearBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clearBtn.setForeground(new java.awt.Color(0, 255, 102));
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        titleLbl.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(0, 255, 102));
        titleLbl.setText("Welcome to Raffle!");
        titleLbl.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                titleLblFocusGained(evt);
            }
        });

        showBtn.setBackground(new java.awt.Color(0, 51, 51));
        showBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        showBtn.setForeground(new java.awt.Color(0, 255, 102));
        showBtn.setText("Show");
        showBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBtnActionPerformed(evt);
            }
        });

        playBtn.setBackground(new java.awt.Color(0, 51, 51));
        playBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        playBtn.setForeground(new java.awt.Color(0, 255, 102));
        playBtn.setText("Play");
        playBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playBtnActionPerformed(evt);
            }
        });

        saveBtn.setBackground(new java.awt.Color(0, 51, 51));
        saveBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(0, 255, 102));
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        loadBtn.setBackground(new java.awt.Color(0, 51, 51));
        loadBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loadBtn.setForeground(new java.awt.Color(0, 255, 102));
        loadBtn.setText("Load");
        loadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(entryLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(historyLbl)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(entryTf, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(playBtn))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(showBtn)
                                            .addComponent(clearBtn)
                                            .addComponent(saveBtn)
                                            .addComponent(loadBtn))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(33, 33, 33))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(titleLbl)
                        .addContainerGap(96, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(entryLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entryTf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playBtn))
                .addGap(28, 28, 28)
                .addComponent(historyLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(showBtn)
                        .addGap(18, 18, 18)
                        .addComponent(clearBtn)
                        .addGap(18, 18, 18)
                        .addComponent(saveBtn)
                        .addGap(18, 18, 18)
                        .addComponent(loadBtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void charityBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_charityBtnActionPerformed
        // TODO add your handling code here:
        CharityGUI myGUI = new CharityGUI();
        myGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_charityBtnActionPerformed

    private void donationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donationBtnActionPerformed
        // TODO add your handling code here:
        DonationGUI myGUI = new DonationGUI();
        myGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_donationBtnActionPerformed

    private void pollBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pollBtnActionPerformed
        // TODO add your handling code here:
        PollGUI myGUI = new PollGUI();
        myGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pollBtnActionPerformed

    private void titleLblFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_titleLblFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_titleLblFocusGained

    //This will be used to save the Game
    private void save(){
        //declare objects
        File f;
        FileOutputStream fStream;
        ObjectOutputStream oStream;
        
        try{
            //create objects for saving in output.dat file
            f = new File("output.dat");
            fStream = new FileOutputStream(f);
            oStream = new ObjectOutputStream(fStream);
            
            //use object: Save Raffle Game object to the file
            oStream.writeObject(raffleG);
        }
        catch(IOException re){
            //print error message if something goes wrong
            System.out.println("Error: "+re);
        }
    }
    
    //This will be used to load the game after closing the application
    private void load(){
        //declare objects
        File f;
        FileInputStream fStream;
        ObjectInputStream oStream;
        
        try{
            //create object
            f = new File("output.dat");
            fStream = new FileInputStream(f);
            oStream = new ObjectInputStream(fStream);
            
            //use object
            raffleG = (RaffleGame)oStream.readObject();
            
            //close stream to release the file
            oStream.close();
            //Get history from raffleG and information from RaffleResult is stored in the History
            ArrayList<RaffleResult> history = raffleG.getHistory();
            historyTa.setText("");
            //Loop through the history to display the result
            for(RaffleResult result : history){
                //Append formateted details of RaffleResult object to text area
                historyTa.append("Name: "+result.getName()+"\nEntry Number: "+result.getUserNumber()+"\nStatus: "+(result.isResult()?"Won": "Lost")+"\n\n");
            }
        }
        catch(IOException|ClassNotFoundException re){//Catch IOException if issues arise reading the file and ClassNotFound is saved object cannot be found
            System.out.println("Error: "+re);
        }
    }
    private void showBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBtnActionPerformed
        // TODO add your handling code here:
        ArrayList<RaffleResult> history = raffleG.getHistory();
        
        if(history.isEmpty()){
            historyTa.setText("No Available History. Play the game!\n");
        }
        else{
            for(RaffleResult result : history){//for each result in history array
                historyTa.append("Name: "+result.getName()+"\nEntry Number: "+result.getUserNumber()+"\nStatus: "+(result.isResult()?"Won": "Lost")+"\n\n");
            }
        }
        
    }//GEN-LAST:event_showBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
        //clear the historyTa text area
        historyTa.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        //calls the save method
        save();
    }//GEN-LAST:event_saveBtnActionPerformed

    private void loadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadBtnActionPerformed
        // TODO add your handling code here:
        //calls the load method
        load();
    }//GEN-LAST:event_loadBtnActionPerformed

    private void playBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playBtnActionPerformed
        // TODO add your handling code here:
        String userInput = entryTf.getText();
        entryTf.setText("");//clear field
        
        //try to parse userInput into integer
        try{
            //converting input to integer
            int userNumber= Integer.parseInt(userInput);
            
            //check if number entered is valid
            if(userNumber < 1|| userNumber > 20){
                JOptionPane.showMessageDialog(null, "Please enter a valid number from 1-20!!");
                return; //exiting the method
            }
            
            //set the raffle from the user in RaffleGame object only if input is valid
            raffleG.setUserNumber(userNumber);
            //call the computeRaffle() method
            raffleG.computeRaffle();
            
            //create msg to show if user won or lost
            String msg = raffleG.isResult() ?"Congrats! You Won the Raffle!" : "Hard Luck! "+raffleG.getNumber()+" Is the Winning Number.";
            //Display result in a pop-up
            JOptionPane.showMessageDialog(null, msg);
        }
        catch(NumberFormatException re ){
            //if number is not a number, show the error message
            JOptionPane.showMessageDialog(null, "INVALID INPUT. \nPlease enter a valid number between 1-20.");
        }
    }//GEN-LAST:event_playBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RaffleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RaffleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RaffleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RaffleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RaffleGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton charityBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton donationBtn;
    private javax.swing.JLabel entryLbl;
    private javax.swing.JTextField entryTf;
    private javax.swing.JLabel historyLbl;
    private javax.swing.JTextArea historyTa;
    private javax.swing.JLabel iconLbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loadBtn;
    private javax.swing.JButton playBtn;
    private javax.swing.JButton pollBtn;
    private javax.swing.JLabel raffleLbl;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton showBtn;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
